package net.settlerstavern.tavern_core.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.sound.Sound;
import net.minecraft.client.sound.SoundSystem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.block.custom.ModStairsBlock;
import net.settlerstavern.tavern_core.item.ModItemGroup;
import net.settlerstavern.tavern_core.world.feature.tree.MapleSaplingGenerator;
import net.settlerstavern.tavern_core.world.feature.tree.SculkMushroomGenerator;


public class ModBlocks_Trees {

    // MAPLE TREE
    public static final Block MAPLE_LOG = registerBlock("maple_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.SETTLERSTAVERN);

    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.SETTLERSTAVERN);

    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.SETTLERSTAVERN);

    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.SETTLERSTAVERN);

    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block CARVED_MAPLE_PLANKS = registerBlock("carved_maple_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new ModStairsBlock(ModBlocks_Trees.MAPLE_PLANKS.getDefaultState(),FabricBlockSettings.copy(Blocks.OAK_STAIRS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.SETTLERSTAVERN);

    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)), ModItemGroup.SETTLERSTAVERN);

    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)), ModItemGroup.SETTLERSTAVERN);

    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.SETTLERSTAVERN);

    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",
            new SaplingBlock(new MapleSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.SETTLERSTAVERN);

    // SCULK MUSHROOM
    public static final Block SCULK_MUSHROOM_LOG = registerBlock("sculk_mushroom_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN);

    public static final Block SCULK_MUSHROOM_WOOD = registerBlock("sculk_mushroom_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN);

    public static final Block STRIPPED_SCULK_MUSHROOM_LOG = registerBlock("stripped_sculk_mushroom_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN);

    public static final Block STRIPPED_SCULK_MUSHROOM_WOOD = registerBlock("stripped_sculk_mushroom_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN);

    public static final Block SCULK_MUSHROOM_PLANKS = registerBlock("sculk_mushroom_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN);

    public static final Block CARVED_SCULK_MUSHROOM_PLANKS = registerBlock("carved_sculk_mushroom_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN);

    public static final Block SCULK_MUSHROOM_STAIRS = registerBlock("sculk_mushroom_stairs",
            new ModStairsBlock(ModBlocks_Trees.MAPLE_PLANKS.getDefaultState(),FabricBlockSettings.copy(Blocks.OAK_STAIRS).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN);

    public static final Block SCULK_MUSHROOM_SLAB = registerBlock("sculk_mushroom_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN);

    public static final Block SCULK_MUSHROOM_FENCE = registerBlock("sculk_mushroom_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN);

    public static final Block SCULK_MUSHROOM_FENCE_GATE = registerBlock("sculk_mushroom_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN);

    public static final Block SCULK_MUSHROOM_MEMBRANE = registerBlock("sculk_mushroom_membrane",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.SCULK).sounds(BlockSoundGroup.SCULK)), ModItemGroup.SETTLERSTAVERN);

    public static final Block SCULK_MUSHROOM = registerBlock("sculk_mushroom",
            new SaplingBlock(new SculkMushroomGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING).sounds(BlockSoundGroup.SCULK_VEIN)), ModItemGroup.SETTLERSTAVERN);

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TavernCore.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(TavernCore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        TavernCore.LOGGER.debug("Registering mod blocks for Tavern Blocks.");
    }
}
