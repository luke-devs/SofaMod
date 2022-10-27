package net.settlerstavern.tavern_core.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.settlerstavern.tavern_core.block.ModBlocks_Trees;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks_Trees.MAPLE_LOG, 5 ,5);
        registry.add(ModBlocks_Trees.MAPLE_WOOD, 5 ,5);
        registry.add(ModBlocks_Trees.STRIPPED_MAPLE_LOG, 5 ,5);
        registry.add(ModBlocks_Trees.STRIPPED_MAPLE_WOOD, 5 ,5);
        registry.add(ModBlocks_Trees.MAPLE_PLANKS, 5 ,20);
        registry.add(ModBlocks_Trees.MAPLE_LEAVES, 30 ,60);

        registry.add(ModBlocks_Trees.EUCALYPTUS_LOG, 5 ,5);
        registry.add(ModBlocks_Trees.EUCALYPTUS_WOOD, 5 ,5);
        registry.add(ModBlocks_Trees.STRIPPED_EUCALYPTUS_LOG, 5 ,5);
        registry.add(ModBlocks_Trees.STRIPPED_EUCALYPTUS_WOOD, 5 ,5);
        registry.add(ModBlocks_Trees.EUCALYPTUS_PLANKS, 5 ,20);
        registry.add(ModBlocks_Trees.EUCALYPTUS_LEAVES, 30 ,60);

        registry.add(ModBlocks_Trees.WILLOW_LOG, 5 ,5);
        registry.add(ModBlocks_Trees.WILLOW_WOOD, 5 ,5);
        registry.add(ModBlocks_Trees.STRIPPED_WILLOW_LOG, 5 ,5);
        registry.add(ModBlocks_Trees.STRIPPED_WILLOW_WOOD, 5 ,5);
        registry.add(ModBlocks_Trees.WILLOW_PLANKS, 5 ,20);
        registry.add(ModBlocks_Trees.WILLOW_LEAVES, 30 ,60);

        registry.add(ModBlocks_Trees.CHERRY_BLOSSOM_LOG, 5 ,5);
        registry.add(ModBlocks_Trees.CHERRY_BLOSSOM_WOOD, 5 ,5);
        registry.add(ModBlocks_Trees.STRIPPED_CHERRY_BLOSSOM_LOG, 5 ,5);
        registry.add(ModBlocks_Trees.STRIPPED_CHERRY_BLOSSOM_WOOD, 5 ,5);
        registry.add(ModBlocks_Trees.CHERRY_BLOSSOM_PLANKS, 5 ,20);
        registry.add(ModBlocks_Trees.CHERRY_BLOSSOM_LEAVES, 30 ,60);

        registry.add(ModBlocks_Trees.SILVERBELL_LOG, 5 ,5);
        registry.add(ModBlocks_Trees.SILVERBELL_WOOD, 5 ,5);
        registry.add(ModBlocks_Trees.STRIPPED_SILVERBELL_LOG, 5 ,5);
        registry.add(ModBlocks_Trees.STRIPPED_SILVERBELL_WOOD, 5 ,5);
        registry.add(ModBlocks_Trees.SILVERBELL_PLANKS, 5 ,20);
        registry.add(ModBlocks_Trees.SILVERBELL_LEAVES, 30 ,60);

    }
}
