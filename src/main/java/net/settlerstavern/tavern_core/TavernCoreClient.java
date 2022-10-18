package net.settlerstavern.tavern_core;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.settlerstavern.tavern_core.block.ModBlocks_Trees;

@Environment(EnvType.CLIENT)
public class TavernCoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.MAPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.MAPLE_SAPLING, RenderLayer.getCutout());
    }
}