package net.settlerstavern.tavern_core;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntryList;
import net.settlerstavern.tavern_core.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.settlerstavern.tavern_core.block.ModBlocksLanterns;
import net.settlerstavern.tavern_core.block.ModBlocksPaintings;
import net.settlerstavern.tavern_core.block.ModBlocksTrees;
import net.settlerstavern.tavern_core.entity.custom.SitEntity;
import net.settlerstavern.tavern_core.item.ModItems;
import net.settlerstavern.tavern_core.sound.ModSounds;
import net.settlerstavern.tavern_core.util.ModFlammableBlocks;
import net.settlerstavern.tavern_core.util.ModRegistries;
import net.settlerstavern.tavern_core.util.ModStrippableBlocks;
import net.settlerstavern.tavern_core.util.ModTags;
import net.settlerstavern.tavern_core.world.feature.ModConfiguredFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

import static net.settlerstavern.tavern_core.entity.ModEntities.SIT_ENTITY;

public class TavernCore implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String MOD_ID = "tavern_core";


	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		FabricDefaultAttributeRegistry.register(SIT_ENTITY, SitEntity.createLivingAttributes().add(EntityAttributes.GENERIC_FOLLOW_RANGE).add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 100000000000L));
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlocksTrees.registerModBlocks();
		ModBlocksLanterns.registerModBlocks();
		ModBlocksPaintings.registerModBlocks();
		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippables();
		Optional<RegistryEntryList.Named<Item>> tagList = Registry.ITEM.getEntryList(ModTags.Items.FOSSILS);
		ModRegistries.registerAttributes();
		ModSounds.registerModSounds();
	}

}
