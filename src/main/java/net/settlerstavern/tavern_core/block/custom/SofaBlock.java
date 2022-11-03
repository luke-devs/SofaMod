package net.settlerstavern.tavern_core.block.custom;

import com.eliotlash.mclib.math.functions.classic.Mod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.settlerstavern.tavern_core.entity.ModEntities;
import net.settlerstavern.tavern_core.entity.custom.SeatEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SofaBlock extends HorizontalFacingBlock {
    public static DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public SofaBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = state.get(FACING);
        switch (facing) {
            case NORTH:
                return VoxelShapes.cuboid(0f,0f,0f,2f,0.5f,1f).offset(-1,0,0);
            case SOUTH:
                return VoxelShapes.cuboid(0f,0f,0f,2f,0.5f,1f);
            case EAST:
                return VoxelShapes.cuboid(0f,0f,0f,1f,0.5f,2f).offset(0,0,-1);
            case WEST:
                return VoxelShapes.cuboid(0f,0f,0f,1f,0.5f,2f);
        }
        return null;
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        double x = pos.getX();
        double y = pos.getY();
        double z = pos.getZ();
        List<SeatEntity> entities = world.getEntitiesByClass(SeatEntity.class, new Box(x, y, z, x + 1, y - 1, z + 1), EntityPredicates.VALID_ENTITY);
        for (SeatEntity entity : entities) {
            entity.remove(Entity.RemovalReason.DISCARDED);
        }
        List<SeatEntity> entities2 = world.getEntitiesByClass(SeatEntity.class, new Box(x, y, z, x - 1, y - 1, z - 1), EntityPredicates.VALID_ENTITY);
        for (SeatEntity entity : entities2) {
            entity.remove(Entity.RemovalReason.DISCARDED);
        }
        super.onBreak(world, pos, state, player);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        PlayerEntity player = (PlayerEntity) placer;
        BlockPos newPos = pos.offset(player.getHorizontalFacing().getOpposite());
        SeatEntity seatEntity = new SeatEntity(ModEntities.SEAT, world);
        seatEntity.setYaw(player.getHorizontalFacing().getOpposite().asRotation());
        seatEntity.setSeatPos(pos);
        world.spawnEntity(seatEntity);
        super.onPlaced(world, pos, state, placer, itemStack);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
