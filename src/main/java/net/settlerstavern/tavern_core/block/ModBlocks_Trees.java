package net.settlerstavern.tavern_core.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.tavern_core.block.custom.GooeyMapleLogBlock;
import net.settlerstavern.tavern_core.block.custom.ModButtonBlock;
import net.settlerstavern.tavern_core.block.custom.ModPressurePlateBlock;
import net.settlerstavern.tavern_core.entity.ModSignTypes;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.block.custom.ModStairsBlock;
import net.settlerstavern.tavern_core.item.ModItemGroup;
import net.settlerstavern.tavern_core.world.feature.tree.MapleSaplingGenerator;
import net.settlerstavern.tavern_core.world.feature.tree.SculkMushroomGenerator;


public class ModBlocks_Trees {

    // MAPLE TREE
    public static final Block MAPLE_LOG = registerBlock("maple_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block STRIPPED_MAPLE_LOG_FULL = registerBlock("stripped_maple_log_full",
            new GooeyMapleLogBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block CARVED_MAPLE_PLANKS = registerBlock("carved_maple_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new ModStairsBlock(ModBlocks_Trees.MAPLE_PLANKS.getDefaultState(),FabricBlockSettings.copy(Blocks.OAK_STAIRS)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            new ModButtonBlock(FabricBlockSettings.of(Material.WOOD).noCollision().sounds(BlockSoundGroup.WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("maple_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.MAPLE), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_SIGN_BLOCK = registerBlockWithoutBlockItem("maple_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.MAPLE), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",
            new SaplingBlock(new MapleSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.SETTLERSTAVERN_TREES);

    // SCULK MUSHROOM
    public static final Block SCULK_MUSHROOM_LOG = registerBlock("sculk_mushroom_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_MUSHROOM_WOOD = registerBlock("sculk_mushroom_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block STRIPPED_SCULK_MUSHROOM_LOG = registerBlock("stripped_sculk_mushroom_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block STRIPPED_SCULK_MUSHROOM_WOOD = registerBlock("stripped_sculk_mushroom_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_MUSHROOM_PLANKS = registerBlock("sculk_mushroom_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block CARVED_SCULK_MUSHROOM_PLANKS = registerBlock("carved_sculk_mushroom_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_MUSHROOM_STAIRS = registerBlock("sculk_mushroom_stairs",
            new ModStairsBlock(ModBlocks_Trees.MAPLE_PLANKS.getDefaultState(),FabricBlockSettings.copy(Blocks.OAK_STAIRS).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_MUSHROOM_SLAB = registerBlock("sculk_mushroom_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_MUSHROOM_FENCE = registerBlock("sculk_mushroom_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_MUSHROOM_FENCE_GATE = registerBlock("sculk_mushroom_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_MUSHROOM_MEMBRANE = registerBlock("sculk_mushroom_membrane",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.SCULK).sounds(BlockSoundGroup.SCULK)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_MUSHROOM_BUTTON = registerBlock("sculk_mushroom_button",
            new ModButtonBlock(FabricBlockSettings.of(Material.WOOD).noCollision().sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_MUSHROOM_PRESSURE_PLATE = registerBlock("sculk_mushroom_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("sculk_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN).sounds(BlockSoundGroup.SCULK_CATALYST), ModSignTypes.SCULK), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_SIGN_BLOCK = registerBlockWithoutBlockItem("sculk_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN).sounds(BlockSoundGroup.SCULK_CATALYST), ModSignTypes.SCULK), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block SCULK_MUSHROOM = registerBlock("sculk_mushroom",
            new SaplingBlock(new SculkMushroomGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING).sounds(BlockSoundGroup.SCULK_VEIN)), ModItemGroup.SETTLERSTAVERN_TREES);

    //WILLOW
    public static final Block WILLOW_LOG = registerBlock("willow_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_WOOD = registerBlock("willow_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_PLANKS = registerBlock("willow_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block CARVED_WILLOW_PLANKS = registerBlock("carved_willow_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_STAIRS = registerBlock("willow_stairs",
            new ModStairsBlock(ModBlocks_Trees.MAPLE_PLANKS.getDefaultState(),FabricBlockSettings.copy(Blocks.OAK_STAIRS)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_SLAB = registerBlock("willow_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_FENCE = registerBlock("willow_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_LEAVES = registerBlock("willow_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("willow_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.WILLOW), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_SIGN_BLOCK = registerBlockWithoutBlockItem("willow_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.WILLOW), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_BUTTON = registerBlock("willow_button",
            new ModButtonBlock(FabricBlockSettings.of(Material.WOOD).noCollision().sounds(BlockSoundGroup.WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block WILLOW_SAPLING = registerBlock("willow_sapling",
            new SaplingBlock(new MapleSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.SETTLERSTAVERN_TREES);

    //EUCALYPTUS
    public static final Block EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_WOOD = registerBlock("eucalyptus_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block STRIPPED_EUCALYPTUS_LOG = registerBlock("stripped_eucalyptus_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block STRIPPED_EUCALYPTUS_WOOD = registerBlock("stripped_eucalyptus_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_PLANKS = registerBlock("eucalyptus_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block CARVED_EUCALYPTUS_PLANKS = registerBlock("carved_eucalyptus_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_STAIRS = registerBlock("eucalyptus_stairs",
            new ModStairsBlock(ModBlocks_Trees.MAPLE_PLANKS.getDefaultState(),FabricBlockSettings.copy(Blocks.OAK_STAIRS)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_SLAB = registerBlock("eucalyptus_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_FENCE = registerBlock("eucalyptus_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_FENCE_GATE = registerBlock("eucalyptus_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("eucalyptus_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.WILLOW), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_SIGN_BLOCK = registerBlockWithoutBlockItem("eucalyptus_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.WILLOW), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_BUTTON = registerBlock("eucalyptus_button",
            new ModButtonBlock(FabricBlockSettings.of(Material.WOOD).noCollision().sounds(BlockSoundGroup.WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_PRESSURE_PLATE = registerBlock("eucalyptus_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD)), ModItemGroup.SETTLERSTAVERN_TREES);

    public static final Block EUCALYPTUS_SAPLING = registerBlock("eucalyptus_sapling",
            new SaplingBlock(new MapleSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.SETTLERSTAVERN_TREES);


    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(TavernCore.MOD_ID, name), block);
    }

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
