package net.settlerstavern.tavern_core.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PaintingBlock_32x48 extends HorizontalFacingBlock {
    public static DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public PaintingBlock_32x48(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        world.removeBlock(pos, false);
        BlockPos newPos = pos.add(0,1,0);
        world.setBlockState(newPos, state);
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = state.get(FACING);
        switch (facing) {
            case NORTH:
                return VoxelShapes.cuboid(0f,0f,0f,2f,3f,0.1f).offset(-1,-1,0.9);
            case SOUTH:
                return VoxelShapes.cuboid(0f,0f,0f,2f,3f,0.1f).offset(0,-1,0);
            case EAST:
                return VoxelShapes.cuboid(0f,0f,0f,0.1f,3f,2f).offset(0,-1,-1);
            case WEST:
                return VoxelShapes.cuboid(0f,0f,0f,0.1f,3f,2f).offset(0.9,-1,0);
        }
        return super.getOutlineShape(state, world, pos, context);
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
