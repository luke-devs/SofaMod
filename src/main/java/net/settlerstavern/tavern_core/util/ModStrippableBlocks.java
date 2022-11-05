package net.settlerstavern.tavern_core.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.settlerstavern.tavern_core.block.ModBlocksTrees;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        //MAPLE
        StrippableBlockRegistry.register(ModBlocksTrees.MAPLE_LOG, ModBlocksTrees.STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(ModBlocksTrees.MAPLE_WOOD, ModBlocksTrees.STRIPPED_MAPLE_WOOD);

        //WILLOW
        StrippableBlockRegistry.register(ModBlocksTrees.WILLOW_LOG, ModBlocksTrees.STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register(ModBlocksTrees.WILLOW_WOOD, ModBlocksTrees.STRIPPED_WILLOW_WOOD);

        //EUCALYPTUS
        StrippableBlockRegistry.register(ModBlocksTrees.EUCALYPTUS_LOG, ModBlocksTrees.STRIPPED_EUCALYPTUS_LOG);
        StrippableBlockRegistry.register(ModBlocksTrees.EUCALYPTUS_WOOD, ModBlocksTrees.STRIPPED_EUCALYPTUS_WOOD);

        //CHERRY BLOSSOM
        StrippableBlockRegistry.register(ModBlocksTrees.CHERRY_BLOSSOM_LOG, ModBlocksTrees.STRIPPED_CHERRY_BLOSSOM_LOG);
        StrippableBlockRegistry.register(ModBlocksTrees.CHERRY_BLOSSOM_WOOD, ModBlocksTrees.STRIPPED_CHERRY_BLOSSOM_WOOD);

        //SCULK
        StrippableBlockRegistry.register(ModBlocksTrees.SCULK_MUSHROOM_LOG, ModBlocksTrees.STRIPPED_SCULK_MUSHROOM_LOG);
        StrippableBlockRegistry.register(ModBlocksTrees.SCULK_MUSHROOM_WOOD, ModBlocksTrees.STRIPPED_SCULK_MUSHROOM_WOOD);

        //SILVERBELL
        StrippableBlockRegistry.register(ModBlocksTrees.SILVERBELL_LOG, ModBlocksTrees.STRIPPED_SILVERBELL_LOG);
        StrippableBlockRegistry.register(ModBlocksTrees.SILVERBELL_WOOD, ModBlocksTrees.STRIPPED_SILVERBELL_WOOD);
    }
}
