package net.settlerstavern.tavern_core.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.NoPenaltyTargeting;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.control.YawAdjustingLookControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.settlerstavern.tavern_core.entity.ModEntities;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.function.Predicate;

public class OtterEntity extends AnimalEntity implements IAnimatable {
    private static final Ingredient BREEDING_INGREDIENT;
    private static final TrackedData<Boolean> ACTIVELY_TRAVELING;
    private static final TrackedData<BlockPos> TRAVEL_POS;
    private static final TrackedData<Boolean> LAND_BOUND;

    public OtterEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
        this.setPathfindingPenalty(PathNodeType.WATER, 0.0F);
        this.moveControl = new OtterEntity.OtterMoveControl(this);
        this.lookControl = new OtterEntity.OtterLookControl(this, 20);
        this.setAir(4800);
        this.ignoreCameraFrustum = true;
        this.stepHeight = 1.5F;
    }

    private AnimationFactory factory = new AnimationFactory(this);

    boolean isLandBound() {
        return (Boolean)this.dataTracker.get(LAND_BOUND);
    }

    void setLandBound(boolean landBound) {
        this.dataTracker.set(LAND_BOUND, landBound);
    }

    void setTravelPos(BlockPos pos) {
        this.dataTracker.set(TRAVEL_POS, pos);
    }

    BlockPos getTravelPos() {
        return (BlockPos)this.dataTracker.get(TRAVEL_POS);
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return AnimalEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 12.0f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.45f);

    }

    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(TRAVEL_POS, BlockPos.ORIGIN);
        this.dataTracker.startTracking(ACTIVELY_TRAVELING, false);
        this.dataTracker.startTracking(LAND_BOUND, false);
    }

    static {
        TRAVEL_POS = DataTracker.registerData(OtterEntity.class, TrackedDataHandlerRegistry.BLOCK_POS);
        ACTIVELY_TRAVELING = DataTracker.registerData(OtterEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
        LAND_BOUND = DataTracker.registerData(OtterEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    }

    public int getXpToDrop() {
        return 10;
    }

    public boolean isActivelyTraveling() {
        return (Boolean)this.dataTracker.get(ACTIVELY_TRAVELING);
    }

    public void setActivelyTraveling(boolean traveling) {
        this.dataTracker.set(ACTIVELY_TRAVELING, traveling);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new BreatheAirGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1.4D));
        this.goalSelector.add(1, new TemptGoal(this, 1.0D, BREEDING_INGREDIENT, false));
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.0D));
        this.targetSelector.add(3, new ActiveTargetGoal<SalmonEntity>(this, SalmonEntity.class, 10, true, true, (Predicate<LivingEntity>)null));
        this.goalSelector.add(7, new OtterEntity.WanderOnLandGoal(this, 1.0D, 100));
        this.goalSelector.add(4, new OtterEntity.WanderInWaterGoal(this, 1.0D));
        this.goalSelector.add(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.add(7, new OtterEntity.TravelGoal(this, 1.0D));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 12.0F));
    }

    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return this.isBaby() ? dimensions.height * 0.25F : dimensions.height * 0.5F;
    }

    public boolean tryAttack(Entity target) {
        boolean bl = target.damage(DamageSource.mob(this), (float)((int)this.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE)));
        if (bl) {
            this.applyDamageEffects(this, target);
        }
        return bl;
    }

    public EntityGroup getGroup() {
        return EntityGroup.AQUATIC;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_AXOLOTL_IDLE_AIR;
    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_AXOLOTL_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_AXOLOTL_DEATH;
    }

    protected SoundEvent getSwimSound() {
        return SoundEvents.ENTITY_AXOLOTL_SWIM;
    }

    protected SoundEvent getSplashSound() {
        return SoundEvents.ENTITY_AXOLOTL_SPLASH;
    }

    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_FROG_STEP, 0.15F, 1.0F);
    }

    public boolean canBeLeashedBy(PlayerEntity player) {
        return true;
    }

    public boolean isBreedingItem(ItemStack stack) {
        return BREEDING_INGREDIENT.test(stack);
    }

    static {
        BREEDING_INGREDIENT = Ingredient.ofItems(Items.SALMON);
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving() && !isTouchingWater()){
            event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
        }else if (event.isMoving() && isTouchingWater()){
            event.getController().setAnimation(new AnimationBuilder().addAnimation("swim", true));
        }else{
            event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        }
        return PlayState.CONTINUE;
    }

    public int getMaxLookPitchChange() {
        return 1;
    }

    public int getMaxHeadRotation() {
        return 1;
    }

    class OtterLookControl extends YawAdjustingLookControl {

        public OtterLookControl(MobEntity entity, int yawAdjustThreshold) {
            super(entity, yawAdjustThreshold);
        }

        public void tick() {
            super.tick();
        }
    }

    static class OtterMoveControl extends MoveControl {
        private final OtterEntity otter;

        OtterMoveControl(OtterEntity otter) {
            super(otter);
            this.otter = otter;
        }

        private void updateVelocity() {
            if (this.otter.isTouchingWater() && this.otter.isSubmergedInWater()) {
                this.otter.setSwimming(true);
                this.otter.setVelocity(this.otter.getVelocity().add(0.0D, 0.01D, 0.0D));
                if (this.otter.isBaby()) {
                    this.otter.setMovementSpeed(Math.max(this.otter.getMovementSpeed() / 3.0F, 0.25F));
                }
            } else if (this.otter.onGround) {
                this.otter.setSwimming(false);
                this.otter.setMovementSpeed(Math.max(this.otter.getMovementSpeed() / 2.0F, 0.2F));
            }

        }

        public boolean canBreatheInWater() {
            return true;
        }

        public void tick() {
            this.updateVelocity();
            if (this.state == State.MOVE_TO && !this.otter.getNavigation().isIdle()) {
                double d = this.targetX - this.otter.getX();
                double e = this.targetY - this.otter.getY();
                double f = this.targetZ - this.otter.getZ();
                double g = Math.sqrt(d * d + e * e + f * f);
                e /= g;
                float h = (float)(MathHelper.atan2(f, d) * 57.2957763671875D) - 90.0F;
                this.otter.setYaw(this.wrapDegrees(this.otter.getYaw(), h, 90.0F));
                this.otter.bodyYaw = this.otter.getYaw();
                float i = (float)(this.speed * this.otter.getAttributeValue(EntityAttributes.GENERIC_MOVEMENT_SPEED));
                this.otter.setMovementSpeed(MathHelper.lerp(0.125F, this.otter.getMovementSpeed(), i));
                this.otter.setVelocity(this.otter.getVelocity().add(0.0D, (double)this.otter.getMovementSpeed() * e * 0.2D, 0.0D));
            } else {
                this.otter.setMovementSpeed(0.0F);
            }
        }
    }

    public float getPathfindingFavor(BlockPos pos, WorldView world) {
        if (!this.isLandBound() && world.getFluidState(pos).isIn(FluidTags.WATER)) {
            return 10.0F;
        } else {
            return world.getPhototaxisFavor(pos);
        }
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<OtterEntity>(this, "controller", 10, this::predicate));
    }

    protected EntityNavigation createNavigation(World world) {
        return new OtterEntity.OtterSwimNavigation(this, world);
    }

    static class WanderOnLandGoal extends WanderAroundGoal {
        private final OtterEntity otter;

        WanderOnLandGoal(OtterEntity otter, double speed, int chance) {
            super(otter, speed, chance);
            this.otter = otter;
        }

        public boolean canStart() {
            return !this.mob.isTouchingWater() && !this.otter.isLandBound();
        }
    }

    private static class WanderInWaterGoal extends MoveToTargetPosGoal {
        private final OtterEntity otter;

        WanderInWaterGoal(OtterEntity otter, double speed) {
            super(otter, otter.isBaby() ? 2.0D : speed, 24);
            this.otter = otter;
            this.lowestY = -1;
        }

        public boolean shouldContinue() {
            return !this.otter.isTouchingWater() && this.tryingTime <= 600 && this.isTargetPos(this.otter.world, this.targetPos);
        }

        public boolean canStart() {
            if (this.otter.isBaby() && !this.otter.isTouchingWater()) {
                return super.canStart();
            } else {
                return !this.otter.isLandBound() && !this.otter.isTouchingWater() && super.canStart();
            }
        }

        public boolean shouldResetPath() {
            return this.tryingTime % 160 == 0;
        }

        protected boolean isTargetPos(WorldView world, BlockPos pos) {
            return world.getBlockState(pos).isOf(Blocks.WATER);
        }
    }

    private static class TravelGoal extends Goal {
        private final OtterEntity otter;
        private final double speed;
        private boolean noPath;

        TravelGoal(OtterEntity otter, double speed) {
            this.otter = otter;
            this.speed = speed;
        }

        public boolean canStart() {
            return !this.otter.isLandBound() && this.otter.isTouchingWater();
        }

        public void start() {
            boolean i = true;
            boolean j = true;
            Random random = this.otter.random;
            int k = random.nextInt(1025) - 512;
            int l = random.nextInt(9) - 4;
            int m = random.nextInt(1025) - 512;
            if ((double)l + this.otter.getY() > (double)(this.otter.world.getSeaLevel() - 1)) {
                l = 0;
            }

            BlockPos blockPos = new BlockPos((double)k + this.otter.getX(), (double)l + this.otter.getY(), (double)m + this.otter.getZ());
            this.otter.setTravelPos(blockPos);
            this.otter.setActivelyTraveling(true);
            this.noPath = false;
        }

        public void tick() {
            if (this.otter.getNavigation().isIdle()) {
                Vec3d vec3d = Vec3d.ofBottomCenter(this.otter.getTravelPos());
                Vec3d vec3d2 = NoPenaltyTargeting.findTo(this.otter, 16, 3, vec3d, 0.3141592741012573D);
                if (vec3d2 == null) {
                    vec3d2 = NoPenaltyTargeting.findTo(this.otter, 8, 7, vec3d, 1.5707963705062866D);
                }

                if (vec3d2 != null) {
                    int i = MathHelper.floor(vec3d2.x);
                    int j = MathHelper.floor(vec3d2.z);
                    boolean k = true;
                    if (!this.otter.world.isRegionLoaded(i - 34, j - 34, i + 34, j + 34)) {
                        vec3d2 = null;
                    }
                }

                if (vec3d2 == null) {
                    this.noPath = true;
                    return;
                }

                this.otter.getNavigation().startMovingTo(vec3d2.x, vec3d2.y, vec3d2.z, this.speed);
            }

        }

        public boolean shouldContinue() {
            return !this.otter.getNavigation().isIdle() && !this.noPath && !this.otter.isLandBound() && !this.otter.isInLove();
        }

        public void stop() {
            this.otter.setActivelyTraveling(false);
            super.stop();
        }
    }

    public void travel(Vec3d movementInput) {
        if (this.canMoveVoluntarily() && this.isTouchingWater()) {
            this.updateVelocity(0.1F, movementInput);
            this.move(MovementType.SELF, this.getVelocity());
            this.setVelocity(this.getVelocity().multiply(0.9D));
            if (this.getTarget() == null && (!this.isLandBound())) {
                this.setVelocity(this.getVelocity().add(0.0D, -0.005D, 0.0D));
            }
        } else {
            super.travel(movementInput);
        }

    }

    static class OtterSwimNavigation extends AxolotlSwimNavigation {
        OtterSwimNavigation(OtterEntity owner, World world) {
            super(owner, world);
        }

        public OtterSwimNavigation(MobEntity mobEntity, World world) {
            super(mobEntity, world);
        }

        public boolean isValidPosition(BlockPos pos) {
            MobEntity var3 = this.entity;
            if (var3 instanceof OtterEntity) {
                OtterEntity otterEntity = (OtterEntity)var3;
                if (otterEntity.isActivelyTraveling()) {
                    return this.world.getBlockState(pos).isOf(Blocks.WATER);
                }
            }

            return !this.world.getBlockState(pos.down()).isAir();
        }
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.OTTER.create(world);
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
