package net.settlerstavern.tavern_core.client;

import net.minecraft.util.Identifier;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.entity.custom.OtterEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OtterModel extends AnimatedGeoModel<OtterEntity> {
    @Override
    public Identifier getModelResource(OtterEntity object) {
        return new Identifier(TavernCore.MOD_ID, "geo/otter.geo.json");
    }

    @Override
    public Identifier getTextureResource(OtterEntity object) {
        return new Identifier(TavernCore.MOD_ID, "textures/entity/otter/otter.png");
    }

    @Override
    public Identifier getAnimationResource(OtterEntity animatable) {
        return new Identifier(TavernCore.MOD_ID, "animations/otter.animation.json");
    }
}
