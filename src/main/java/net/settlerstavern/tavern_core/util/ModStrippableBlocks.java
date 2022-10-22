package net.settlerstavern.tavern_core.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.settlerstavern.tavern_core.block.ModBlocks_Trees;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        //MAPLE
        StrippableBlockRegistry.register(ModBlocks_Trees.MAPLE_LOG, ModBlocks_Trees.STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(ModBlocks_Trees.MAPLE_WOOD, ModBlocks_Trees.STRIPPED_MAPLE_WOOD);

        //WILLOW
        StrippableBlockRegistry.register(ModBlocks_Trees.WILLOW_LOG, ModBlocks_Trees.STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register(ModBlocks_Trees.WILLOW_WOOD, ModBlocks_Trees.STRIPPED_WILLOW_WOOD);

        //SCULK
        StrippableBlockRegistry.register(ModBlocks_Trees.SCULK_MUSHROOM_LOG, ModBlocks_Trees.STRIPPED_SCULK_MUSHROOM_LOG);
        StrippableBlockRegistry.register(ModBlocks_Trees.SCULK_MUSHROOM_WOOD, ModBlocks_Trees.STRIPPED_SCULK_MUSHROOM_WOOD);
    }
}
