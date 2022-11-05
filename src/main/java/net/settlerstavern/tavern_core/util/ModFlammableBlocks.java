package net.settlerstavern.tavern_core.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.settlerstavern.tavern_core.block.ModBlocksTrees;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocksTrees.MAPLE_LOG, 5 ,5);
        registry.add(ModBlocksTrees.MAPLE_WOOD, 5 ,5);
        registry.add(ModBlocksTrees.STRIPPED_MAPLE_LOG, 5 ,5);
        registry.add(ModBlocksTrees.STRIPPED_MAPLE_WOOD, 5 ,5);
        registry.add(ModBlocksTrees.MAPLE_PLANKS, 5 ,20);
        registry.add(ModBlocksTrees.MAPLE_LEAVES, 30 ,60);

        registry.add(ModBlocksTrees.EUCALYPTUS_LOG, 5 ,5);
        registry.add(ModBlocksTrees.EUCALYPTUS_WOOD, 5 ,5);
        registry.add(ModBlocksTrees.STRIPPED_EUCALYPTUS_LOG, 5 ,5);
        registry.add(ModBlocksTrees.STRIPPED_EUCALYPTUS_WOOD, 5 ,5);
        registry.add(ModBlocksTrees.EUCALYPTUS_PLANKS, 5 ,20);
        registry.add(ModBlocksTrees.EUCALYPTUS_LEAVES, 30 ,60);

        registry.add(ModBlocksTrees.WILLOW_LOG, 5 ,5);
        registry.add(ModBlocksTrees.WILLOW_WOOD, 5 ,5);
        registry.add(ModBlocksTrees.STRIPPED_WILLOW_LOG, 5 ,5);
        registry.add(ModBlocksTrees.STRIPPED_WILLOW_WOOD, 5 ,5);
        registry.add(ModBlocksTrees.WILLOW_PLANKS, 5 ,20);
        registry.add(ModBlocksTrees.WILLOW_LEAVES, 30 ,60);

        registry.add(ModBlocksTrees.CHERRY_BLOSSOM_LOG, 5 ,5);
        registry.add(ModBlocksTrees.CHERRY_BLOSSOM_WOOD, 5 ,5);
        registry.add(ModBlocksTrees.STRIPPED_CHERRY_BLOSSOM_LOG, 5 ,5);
        registry.add(ModBlocksTrees.STRIPPED_CHERRY_BLOSSOM_WOOD, 5 ,5);
        registry.add(ModBlocksTrees.CHERRY_BLOSSOM_PLANKS, 5 ,20);
        registry.add(ModBlocksTrees.CHERRY_BLOSSOM_LEAVES, 30 ,60);

        registry.add(ModBlocksTrees.SILVERBELL_LOG, 5 ,5);
        registry.add(ModBlocksTrees.SILVERBELL_WOOD, 5 ,5);
        registry.add(ModBlocksTrees.STRIPPED_SILVERBELL_LOG, 5 ,5);
        registry.add(ModBlocksTrees.STRIPPED_SILVERBELL_WOOD, 5 ,5);
        registry.add(ModBlocksTrees.SILVERBELL_PLANKS, 5 ,20);
        registry.add(ModBlocksTrees.SILVERBELL_LEAVES, 30 ,60);

    }
}
