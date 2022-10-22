package net.settlerstavern.tavern_core.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.block.custom.DecorationBlock;
import net.settlerstavern.tavern_core.block.custom.SofaBlock;
import net.settlerstavern.tavern_core.item.ModItemGroup;


public class ModBlocks_Lanterns {

    public static final Block CHERRYBLOSSOM_LANTERN = registerBlock("cherry_blossom_lantern",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).luminance(15).sounds(BlockSoundGroup.WOOD)), ModItemGroup.SETTLERSTAVERN);

    public static final Block MAPLE_LANTERN = registerBlock("maple_lantern",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).luminance(15).sounds(BlockSoundGroup.WOOD)), ModItemGroup.SETTLERSTAVERN);

    public static final Block SCULK_MUSHROOM_LANTERN = registerBlock("sculk_mushroom_lantern",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).luminance(15).sounds(BlockSoundGroup.SCULK_CATALYST)), ModItemGroup.SETTLERSTAVERN);

    public static final Block EUCALYPTUS_LANTERN = registerBlock("eucalyptus_lantern",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).luminance(15).sounds(BlockSoundGroup.WOOD)), ModItemGroup.SETTLERSTAVERN);

    public static final Block WILLOW_LANTERN = registerBlock("willow_lantern",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).luminance(15).sounds(BlockSoundGroup.WOOD)), ModItemGroup.SETTLERSTAVERN);

    public static final Block SILVERBELL_LANTERN = registerBlock("silverbell_lantern",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).luminance(15).sounds(BlockSoundGroup.WOOD)), ModItemGroup.SETTLERSTAVERN);


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
