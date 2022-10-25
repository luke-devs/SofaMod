package net.settlerstavern.tavern_core.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.entity.custom.DuckyEntity;
import net.settlerstavern.tavern_core.entity.custom.KrakenEntity;

public class ModEntities {
    public static final EntityType<KrakenEntity> KRAKEN = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(TavernCore.MOD_ID, "kraken"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, KrakenEntity::new)
                    .dimensions(EntityDimensions.fixed(8, 8)).build());

    public static final EntityType<DuckyEntity> DUCKY = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(TavernCore.MOD_ID, "ducky"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DuckyEntity::new)
                    .dimensions(EntityDimensions.fixed(1, 1)).build());
}
