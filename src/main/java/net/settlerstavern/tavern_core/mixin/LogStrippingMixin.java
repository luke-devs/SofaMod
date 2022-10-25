package net.settlerstavern.tavern_core.mixin;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.settlerstavern.tavern_core.block.ModBlocks;
import net.settlerstavern.tavern_core.block.ModBlocks_Trees;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AxeItem.class)
public abstract class LogStrippingMixin {

    @Shadow protected abstract Optional<BlockState> getStrippedState(BlockState state);

    @Inject(at = @At("HEAD"), method = "useOnBlock")
    private void supports(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        PlayerEntity playerEntity = context.getPlayer();
        BlockState blockState = world.getBlockState(blockPos);
        Optional<BlockState> optional = this.getStrippedState(blockState);
        ItemStack itemStack = context.getStack();
        Optional<BlockState> optional4 = Optional.empty();

        if (optional.isPresent() && blockState.getBlock() == ModBlocks_Trees.MAPLE_LOG) {
            net.minecraft.util.math.random.Random random = Random.create();
            int rarity = random.nextBetween(1, 4);
            if (rarity == 4){
                optional4 = Optional.ofNullable(ModBlocks_Trees.STRIPPED_MAPLE_LOG_FULL.getStateWithProperties(blockState));
            }else{
                optional4 = optional;
            }
            world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
        }

        if (optional4.isPresent()) {
            if (playerEntity instanceof ServerPlayerEntity) {
                Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity)playerEntity, blockPos, itemStack);

                world.setBlockState(blockPos, (BlockState)optional4.get(), 11);
                world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, (BlockState)optional4.get()));
                if (playerEntity != null) {
                    itemStack.damage(1, playerEntity, (p) -> {
                        p.sendToolBreakStatus(context.getHand());
                    });
                }
            }
        }
    }
}
