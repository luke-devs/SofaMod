package net.settlerstavern.tavern_core.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.settlerstavern.tavern_core.entity.custom.KrakenEntity;
import net.settlerstavern.tavern_core.TavernCore;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class KrakenRenderer extends GeoEntityRenderer<KrakenEntity> {
    public KrakenRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new KrakenModel());
    }

    @Override
    public Identifier getTextureResource(KrakenEntity object) {
        return new Identifier(TavernCore.MOD_ID, "textures/entity/kraken/kraken.png");
    }
}
