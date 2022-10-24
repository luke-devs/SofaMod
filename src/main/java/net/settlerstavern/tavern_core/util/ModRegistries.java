package net.settlerstavern.tavern_core.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.settlerstavern.tavern_core.entity.ModEntities;
import net.settlerstavern.tavern_core.entity.custom.KrakenEntity;

public class ModRegistries {

    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.KRAKEN, KrakenEntity.setAttributes());
    }
}
