package net.settlerstavern.tavern_core.entity.custom;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.control.AquaticMoveControl;
import net.minecraft.entity.ai.control.YawAdjustingLookControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.ai.pathing.SwimNavigation;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.settlerstavern.tavern_core.entity.KrakenAttackGoal;
import net.settlerstavern.tavern_core.sound.ModSounds;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class KrakenEntity extends HostileEntity implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    public static final TrackedData<Integer> STATE = DataTracker.registerData(KrakenEntity.class,
            TrackedDataHandlerRegistry.INTEGER);

    public KrakenEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new AquaticMoveControl(this, 45, 1, 0.35F, 0.01F, true);
        this.setPathfindingPenalty(PathNodeType.WATER, 0.0F);
        this.cannotDespawn();
        this.ambientSoundChance = 45;
        this.ignoreCameraFrustum = true;
    }

    public EntityGroup getGroup() {
        return EntityGroup.AQUATIC;
    }

    public boolean isPushedByFluids() {
        return false;
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return AnimalEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 2000.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 3.0F)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.6f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 30)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 10.0f);

    }

    @Override
    protected void initGoals() {
        this.targetSelector.add(0, new ActiveTargetGoal<>(this, PlayerEntity.class, false));
        this.goalSelector.add(1, new KrakenAttackGoal(this, 1.0D, 0));
    }

    @Override
    public boolean tryAttack(Entity target) {
        boolean bl = target.damage(DamageSource.mob(this), (float)((int)this.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE)));
        if (bl) {
            this.attackLivingEntity((LivingEntity) target);
        }
        return bl;
    }

    public boolean canBeLeashedBy(PlayerEntity player) {
        return false;
    }

    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return dimensions.height * 0.2f;
    }

    public int getMaxLookPitchChange() {
        return 80;
    }

    public int getMaxHeadRotation() {
        return 10;
    }

    public int getXpToDrop() {
        return 200 + this.world.random.nextInt(400);
    }

    @Override
    public void travel(Vec3d movementInput) {
        if (this.canMoveVoluntarily() && this.isTouchingWater()) {
            this.updateVelocity(this.getMovementSpeed(), movementInput);
            this.move(MovementType.SELF, this.getVelocity());
            this.setVelocity(this.getVelocity().multiply(0.8D));
            if (this.getTarget() == null) {
                this.setVelocity(this.getVelocity().add(0.0D, -0.005D, 0.0D));
            }
        } else {
            super.travel(movementInput);
        }
    }

    @Override
    protected EntityNavigation createNavigation(World world) {
        return new SwimNavigation(this, world);
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving() && !this.isAttacking()){
            event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
        }else if(!event.isMoving() && !this.isAttacking()){
            event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        }else if (this.isAttacking()){
            event.getController().setAnimation(new AnimationBuilder().addAnimation("swing", true));
        }
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<KrakenEntity>(this, "kraken_controller", 20, this::predicate));
    }

    @Override
    public float getPathfindingFavor(BlockPos pos, WorldView world) {
        return world.getFluidState(pos).isIn(FluidTags.WATER) ? 10.0F + world.getPhototaxisFavor(pos) : super.getPathfindingFavor(pos, world);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(STATE, 0);
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    public boolean canBreatheInWater() {
        return true;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.KRAKEN_IDLE;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_DROWNED_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_DROWNED_DEATH;
    }

    public int getAttckingState() {
        return this.dataTracker.get(STATE);
    }

    public void setAttackingState(int time) {
        this.dataTracker.set(STATE, time);
    }
}
