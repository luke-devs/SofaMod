package net.settlerstavern.tavern_core.block.custom;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SkullBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.MathHelper;


public class DecorationBlock extends Block {

    public static final int ROTATION_HALF_MAX = 7;
    public static final IntProperty ROTATION_HALF;

    static {
        ROTATION_HALF = IntProperty.of("rotation_half", 0, 7);
    }

    public DecorationBlock(Settings settings) {
        super(settings);
    }


    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(ROTATION_HALF, MathHelper.floor((double)(ctx.getPlayerYaw() * 8.0F / 360.0F) + 0.5D) & 7);
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror){
        return (BlockState)state.with(ROTATION_HALF, mirror.mirror((Integer)state.get(ROTATION_HALF), 32));
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(ROTATION_HALF, rotation.rotate((Integer)state.get(ROTATION_HALF), 32));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ROTATION_HALF);
    }

}
