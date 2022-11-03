package net.settlerstavern.tavern_core;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.settlerstavern.tavern_core.block.ModBlocks_Trees;
import net.settlerstavern.tavern_core.client.DuckyRenderer;
import net.settlerstavern.tavern_core.client.EmptyRenderer;
import net.settlerstavern.tavern_core.client.OtterRenderer;
import net.settlerstavern.tavern_core.entity.ModEntities;
import net.settlerstavern.tavern_core.client.KrakenRenderer;

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

        //EUCALYPTUS
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.EUCALYPTUS_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.EUCALYPTUS_SAPLING, RenderLayer.getCutout());

        //WILLOW
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.CHERRY_BLOSSOM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.CHERRY_BLOSSOM_SAPLING, RenderLayer.getCutout());

        //SCULK MUSHROOM
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.SCULK_MUSHROOM, RenderLayer.getCutout());

        //SILVERBELL
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.SILVERBELL_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks_Trees.SILVERBELL_SAPLING, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.KRAKEN, KrakenRenderer::new);
        EntityRendererRegistry.register(ModEntities.DUCKY, DuckyRenderer::new);
        EntityRendererRegistry.register(ModEntities.OTTER, OtterRenderer::new);
        EntityRendererRegistry.register(ModEntities.SEAT, EmptyRenderer::new);
    }
}