package net.settlerstavern.tavern_core.client;

import net.minecraft.util.Identifier;
import net.settlerstavern.tavern_core.entity.custom.KrakenEntity;
import net.settlerstavern.tavern_core.TavernCore;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KrakenModel extends AnimatedGeoModel<KrakenEntity> {

    @Override
    public Identifier getModelResource(KrakenEntity object) {
        return new Identifier(TavernCore.MOD_ID, "geo/kraken.geo.json");
    }

    @Override
    public Identifier getTextureResource(KrakenEntity object) {
        return new Identifier(TavernCore.MOD_ID, "textures/entity/kraken/kraken.png");
    }

    @Override
    public Identifier getAnimationResource(KrakenEntity animatable) {
        return new Identifier(TavernCore.MOD_ID, "animations/kraken.animation.json");
    }
}
