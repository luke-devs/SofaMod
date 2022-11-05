package net.settlerstavern.tavern_core.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.tag.TagKey;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SitEntity extends PathAwareEntity {
    public SitEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
        this.noClip = true;
    }

    @Override
    public boolean canMoveVoluntarily() {
        return false;
    }

    public void setSeatPos(BlockPos pos) {
        setPos(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D);
    }

    @Override
    public double getMountedHeightOffset() {
        return  0.3f;
    }

    @Override
    public void move(MovementType movementType, Vec3d movement) {
    }

    @Override
    public boolean updateMovementInFluid(TagKey<Fluid> tag, double speed) {
        return false;
    }

    @Override
    public void tickMovement() {
    }

    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        player.startRiding(this);
        return super.interactMob(player, hand);
    }

    @Override
    public boolean shouldSave() {
        return super.shouldSave();
    }

    @Override
    public Vec3d updatePassengerForDismount(LivingEntity passenger) {
        return this.getPos();
    }

    @Override
    public boolean cannotDespawn() {
        return true;
    }

    @Override
    protected void removePassenger(Entity entity) {
        super.removePassenger(entity);
        if (!this.isRemoved() && !this.world.isClient()) {
            entity.move(MovementType.PLAYER, entity.getPos());
        }
    }

}
