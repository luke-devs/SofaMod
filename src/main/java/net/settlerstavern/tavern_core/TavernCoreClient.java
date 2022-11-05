package net.settlerstavern.tavern_core;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.settlerstavern.tavern_core.block.ModBlocksTrees;
import net.settlerstavern.tavern_core.client.*;
import net.settlerstavern.tavern_core.entity.ModEntities;

@Environment(EnvType.CLIENT)
public class TavernCoreClient implements ClientModInitializer {

    public static final EntityModelLayer MODEL_SIT_ENTITY_LAYER = new EntityModelLayer(new Identifier("tavern_core", "sit_entity"), "main");

    @Override
    public void onInitializeClient() {
        //MAPLE
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksTrees.MAPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksTrees.MAPLE_SAPLING, RenderLayer.getCutout());

        //WILLOW
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksTrees.WILLOW_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksTrees.WILLOW_SAPLING, RenderLayer.getCutout());

        //EUCALYPTUS
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksTrees.EUCALYPTUS_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksTrees.EUCALYPTUS_SAPLING, RenderLayer.getCutout());

        //WILLOW
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksTrees.CHERRY_BLOSSOM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksTrees.CHERRY_BLOSSOM_SAPLING, RenderLayer.getCutout());

        //SCULK MUSHROOM
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksTrees.SCULK_MUSHROOM, RenderLayer.getCutout());

        //SILVERBELL
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksTrees.SILVERBELL_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksTrees.SILVERBELL_SAPLING, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.KRAKEN, KrakenRenderer::new);
        EntityRendererRegistry.register(ModEntities.DUCKY, DuckyRenderer::new);
        EntityRendererRegistry.register(ModEntities.OTTER, OtterRenderer::new);

        EntityRendererRegistry.register(ModEntities.SIT_ENTITY, (SitEntityRenderer::new));
        EntityModelLayerRegistry.registerModelLayer(MODEL_SIT_ENTITY_LAYER, SitEntityModel::getTexturedModelData);
    }
}