package net.settlerstavern.tavern_core.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.block.custom.*;
import net.settlerstavern.tavern_core.item.ModItemGroup;

public class ModBlocksPaintings {

    public static final Block STARRY_NIGHT = registerBlock("painting/starry_night",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block ANCHORS_AWAY = registerBlock("painting/anchors_away",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block ACRO = registerBlock("painting/acro",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block CLASSIC_DAGGER = registerBlock("painting/classic_dagger",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block MAID = registerBlock("painting/maid",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block HOLMES = registerBlock("painting/holmes",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block SMOKING_SKELETON = registerBlock("painting/smoking_skeleton",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block BELLA = registerBlock("painting/bella",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block SUSSY_ADVICE = registerBlock("painting/sussy_advice",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block RIBBIT = registerBlock("painting/ribbit",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block DOLLY = registerBlock("painting/dolly",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block PORKCHOP = registerBlock("painting/porkchop",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block HARRY_OTTERNAUGHT = registerBlock("painting/harry_otternaught",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block GLORY_DAYS = registerBlock("painting/glory_days",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block FROZEN_NIGHTS = registerBlock("painting/frozen_nights",
            new PaintingBlock_32x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block THE_GOAT = registerBlock("painting/the_goat",
            new PaintingBlock_16x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block DUCKY_STAB = registerBlock("painting/ducky_stab",
            new PaintingBlock_16x(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block LLAMA_PRIDE = registerBlock("painting/llama_pride",
            new PaintingBlock_16x32(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block RAT_BOI = registerBlock("painting/rat_boi",
            new PaintingBlock_16x32(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block TABLE_FOR_TWO = registerBlock("painting/table_for_two",
            new PaintingBlock_16x32(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block TABLE_MAKE_BLOCKIES = registerBlock("painting/table_make_blockies",
            new PaintingBlock_32x48(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block LAST_DAY_OUT = registerBlock("painting/last_day_out",
            new PaintingBlock_32x48(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block SETTING_SUMMER = registerBlock("painting/setting_summer",
            new PaintingBlock_32x48(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);

    public static final Block VIVID_SIERRA = registerBlock("painting/vivid_sierra",
            new PaintingBlock_48x48(FabricBlockSettings.of(Material.WOOD).nonOpaque().noCollision().breakInstantly()), ModItemGroup.SETTLERSTAVERN_DECOR);


    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TavernCore.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(TavernCore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        TavernCore.LOGGER.debug("Registering paintings for Tavern Blocks.");
    }
}
