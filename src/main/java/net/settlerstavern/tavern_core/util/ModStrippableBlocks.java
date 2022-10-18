package net.settlerstavern.tavern_core.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.settlerstavern.tavern_core.block.ModBlocks_Trees;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks_Trees.MAPLE_LOG, ModBlocks_Trees.STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(ModBlocks_Trees.MAPLE_WOOD, ModBlocks_Trees.STRIPPED_MAPLE_WOOD);
    }
}
