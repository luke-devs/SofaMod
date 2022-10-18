package net.settlerstavern.tavern_core.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.block.custom.ModStairsBlock;
import net.settlerstavern.tavern_core.item.ModItemGroup;
import net.settlerstavern.tavern_core.world.feature.tree.MapleSaplingGenerator;


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
