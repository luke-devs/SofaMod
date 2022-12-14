package net.settlerstavern.tavern_core.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.block.custom.*;
import net.settlerstavern.tavern_core.item.ModItemGroup;


public class ModBlocks {

    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block ENDER_PEARL_BLOCK = registerBlock("ender_pearl_block",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().sounds(BlockSoundGroup.GLASS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block ENGRAVED_BRILLIANT_AMETHYST_BLOCK = registerBlock("engraved_brilliant_amethyst_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.5f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block ENGRAVED_PLATINUM_BLOCK = registerBlock("engraved_platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block ENGRAVED_DIAMOND_BLOCK = registerBlock("engraved_diamond_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block ENGRAVED_SHINING_PEARL_BLOCK = registerBlock("engraved_shining_pearl_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.5f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(1.5f).requiresTool().sounds(BlockSoundGroup.GRAVEL)), ModItemGroup.SETTLERSTAVERN);

    public static final Block PLATED_GOLD_BLOCK = registerBlock("plated_gold_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block PLATED_COPPER_BLOCK = registerBlock("plated_copper_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block POLISHED_CALCITE_BLOCK = registerBlock("polished_calcite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(0.75f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block POLISHED_AMETHYST_BLOCK = registerBlock("polished_amethyst_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.5f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block BRILLIANT_AMETHYST_BLOCK = registerBlock("brilliant_amethyst_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.5f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block SHINING_PEARL_BLOCK = registerBlock("shining_pearl_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.5f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block POLISHED_EMERALD_BLOCK = registerBlock("polished_emerald_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block POLISHED_LAPIS_BLOCK = registerBlock("polished_lapis_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block POLISHED_REDSTONE_BLOCK = registerBlock("polished_redstone_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()), ModItemGroup.SETTLERSTAVERN);

    public static final Block BEER_MUG = registerBlock("decor/beer_mug",
            new DecorationBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block GREEN_SOFA = registerBlock("decor/green_sofa",
            new SofaBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block BLUE_ICE_BRICKS = registerBlock("blue_ice_bricks",
            new Block(FabricBlockSettings.of(Material.ICE).strength(2.8f).requiresTool().slipperiness(0.989f)
                    .sounds(BlockSoundGroup.GLASS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block BLUE_ICE_PILLAR = registerBlock("blue_ice_pillar",
            new Block(FabricBlockSettings.of(Material.ICE).strength(2.8f).requiresTool().slipperiness(0.989f)
                    .sounds(BlockSoundGroup.GLASS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block FROSTED_COBBLESTONE = registerBlock("frosted_cobblestone",
            new Block(FabricBlockSettings.of(Material.ICE).strength(2.8f).requiresTool().slipperiness(0.989f)
                    .sounds(BlockSoundGroup.GLASS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block PACKED_ICE_BRICKS = registerBlock("packed_ice_bricks",
            new Block(FabricBlockSettings.of(Material.ICE).strength(0.5f).requiresTool().slipperiness(0.98f)
                    .sounds(BlockSoundGroup.GLASS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block PACKED_ICE_PILLAR = registerBlock("packed_ice_pillar",
            new Block(FabricBlockSettings.of(Material.ICE).strength(0.5f).requiresTool().slipperiness(0.98f)
                    .sounds(BlockSoundGroup.GLASS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block ICEY_DEEPSLATE = registerBlock("icey_deepslate",
            new Block(FabricBlockSettings.of(Material.ICE).strength(0.5f).requiresTool().slipperiness(0.98f)
                    .sounds(BlockSoundGroup.GLASS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block PACKED_SNOW = registerBlock("packed_snow",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.2f).requiresTool()
                    .sounds(BlockSoundGroup.SNOW)), ModItemGroup.SETTLERSTAVERN);

    public static final Block PACKED_SNOW_BRICKS = registerBlock("packed_snow_bricks",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.2f).requiresTool()
                    .sounds(BlockSoundGroup.SNOW)), ModItemGroup.SETTLERSTAVERN);

    public static final Block PACKED_SNOW_PILLAR = registerBlock("packed_snow_pillar",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.2f).requiresTool()
                    .sounds(BlockSoundGroup.SNOW)), ModItemGroup.SETTLERSTAVERN);

    public static final Block CARVED_OAK_PLANKS = registerBlock("carved_oak_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block CARVED_BIRCH_PLANKS = registerBlock("carved_birch_planks",
        new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block CARVED_DARK_OAK_PLANKS = registerBlock("carved_dark_oak_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block CARVED_SPRUCE_PLANKS = registerBlock("carved_spruce_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block CARVED_ACACIA_PLANKS = registerBlock("carved_acacia_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block CARVED_JUNGLE_PLANKS = registerBlock("carved_jungle_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block CARVED_WARPED_PLANKS = registerBlock("carved_warped_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN);

    public static final Block CARVED_CRIMSON_PLANKS = registerBlock("carved_crimson_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.SETTLERSTAVERN);


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
