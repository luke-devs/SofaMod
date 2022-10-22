package net.settlerstavern.tavern_core;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntryList;
import net.settlerstavern.tavern_core.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.settlerstavern.tavern_core.block.ModBlocks_Lanterns;
import net.settlerstavern.tavern_core.block.ModBlocks_Trees;
import net.settlerstavern.tavern_core.item.ModItems;
import net.settlerstavern.tavern_core.util.ModFlammableBlocks;
import net.settlerstavern.tavern_core.util.ModStrippableBlocks;
import net.settlerstavern.tavern_core.util.ModTags;
import net.settlerstavern.tavern_core.world.feature.ModConfiguredFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

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
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlocks_Trees.registerModBlocks();
		ModBlocks_Lanterns.registerModBlocks();
		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippables();
		Optional<RegistryEntryList.Named<Item>> tagList = Registry.ITEM.getEntryList(ModTags.Items.FOSSILS);
	}

}
