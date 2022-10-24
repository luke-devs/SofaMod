package net.settlerstavern.tavern_core.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.settlerstavern.tavern_core.entity.custom.KrakenEntity;
import net.settlerstavern.tavern_core.TavernCore;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.renderers.geo.layer.LayerGlowingAreasGeo;

public class KrakenRenderer extends GeoEntityRenderer<KrakenEntity> {
    public KrakenRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new KrakenModel());
        this.addLayer(new LayerGlowingAreasGeo<KrakenEntity>(this, getGeoModelProvider()::getTextureResource, getGeoModelProvider()::getModelResource, RenderLayer::getEntityTranslucentEmissive));
    }

    @Override
    public Identifier getTextureResource(KrakenEntity object) {
        return new Identifier(TavernCore.MOD_ID, "textures/entity/kraken/kraken.png");
    }
}
