package net.settlerstavern.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.entity.custom.KrakenEntity;
import net.settlerstavern.tavern_core.TavernCore;

public class ModEntities {
    public static final EntityType<KrakenEntity> KRAKEN = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(TavernCore.MOD_ID, "kraken"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, KrakenEntity::new)
                    .dimensions(EntityDimensions.fixed(9, 7)).build());
}
