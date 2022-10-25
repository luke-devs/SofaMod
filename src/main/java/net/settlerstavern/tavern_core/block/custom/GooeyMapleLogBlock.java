package net.settlerstavern.tavern_core.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.settlerstavern.tavern_core.block.ModBlocks_Trees;
import net.settlerstavern.tavern_core.item.ModItems;

public class GooeyMapleLogBlock extends PillarBlock {
    public GooeyMapleLogBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient){
            if (player.getStackInHand(hand).getItem() == Items.GLASS_BOTTLE){
                player.getStackInHand(hand).decrement(1);
                BlockState newState = ModBlocks_Trees.STRIPPED_MAPLE_LOG.getStateWithProperties(state);
                world.setBlockState(pos, (BlockState)newState, 11);
                player.dropStack(ModItems.MAPLE_SYRUP.getDefaultStack());
            }
        }
        return ActionResult.SUCCESS;
    }
}
