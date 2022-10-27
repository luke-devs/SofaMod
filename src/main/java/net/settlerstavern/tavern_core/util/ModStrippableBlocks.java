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

        //EUCALYPTUS
        StrippableBlockRegistry.register(ModBlocks_Trees.EUCALYPTUS_LOG, ModBlocks_Trees.STRIPPED_EUCALYPTUS_LOG);
        StrippableBlockRegistry.register(ModBlocks_Trees.EUCALYPTUS_WOOD, ModBlocks_Trees.STRIPPED_EUCALYPTUS_WOOD);

        //CHERRY BLOSSOM
        StrippableBlockRegistry.register(ModBlocks_Trees.CHERRY_BLOSSOM_LOG, ModBlocks_Trees.STRIPPED_CHERRY_BLOSSOM_LOG);
        StrippableBlockRegistry.register(ModBlocks_Trees.CHERRY_BLOSSOM_WOOD, ModBlocks_Trees.STRIPPED_CHERRY_BLOSSOM_WOOD);

        //SCULK
        StrippableBlockRegistry.register(ModBlocks_Trees.SCULK_MUSHROOM_LOG, ModBlocks_Trees.STRIPPED_SCULK_MUSHROOM_LOG);
        StrippableBlockRegistry.register(ModBlocks_Trees.SCULK_MUSHROOM_WOOD, ModBlocks_Trees.STRIPPED_SCULK_MUSHROOM_WOOD);

        //SILVERBELL
        StrippableBlockRegistry.register(ModBlocks_Trees.SILVERBELL_LOG, ModBlocks_Trees.STRIPPED_SILVERBELL_LOG);
        StrippableBlockRegistry.register(ModBlocks_Trees.SILVERBELL_WOOD, ModBlocks_Trees.STRIPPED_SILVERBELL_WOOD);
    }
}
