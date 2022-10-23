package net.settlerstavern.tavern_core.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.settlerstavern.entity.ModEntities;
import net.settlerstavern.entity.custom.KrakenEntity;

public class ModRegistries {

    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.KRAKEN, KrakenEntity.setAttributes());
    }
}
