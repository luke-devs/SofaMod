package net.settlerstavern.tavern_core.client;

import net.minecraft.util.Identifier;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.entity.custom.DuckyEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DuckyModel extends AnimatedGeoModel<DuckyEntity> {
    @Override
    public Identifier getModelResource(DuckyEntity object) {
        return new Identifier(TavernCore.MOD_ID, "geo/duck.geo.json");
    }

    @Override
    public Identifier getTextureResource(DuckyEntity object) {
        return new Identifier(TavernCore.MOD_ID, "textures/entity/duck/ducky.png");
    }

    @Override
    public Identifier getAnimationResource(DuckyEntity animatable) {
        return new Identifier(TavernCore.MOD_ID, "animations/duck.animation.json");
    }
}
