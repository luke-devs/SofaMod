package net.settlerstavern.tavern_core;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.settlerstavern.tavern_core.block.ModBlocks_Trees;
import net.settlerstavern.tavern_core.entity.ModEntities;
import net.settlerstavern.tavern_core.entity.client.KrakenRenderer;

@Environment(EnvType.CLIENT)
public class TavernCoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //MAPLE
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.MAPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.MAPLE_SAPLING, RenderLayer.getCutout());

        //WILLOW
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.WILLOW_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.WILLOW_SAPLING, RenderLayer.getCutout());

        //SCULK MUSHROOM
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.SCULK_MUSHROOM, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.KRAKEN, KrakenRenderer::new);
    }
}