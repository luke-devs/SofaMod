package net.settlerstavern.tavern_core.item;

import net.settlerstavern.tavern_core.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.block.ModBlocks_Trees;

public class ModItemGroup {
    public static final ItemGroup SETTLERSTAVERN = FabricItemGroupBuilder.build(new Identifier(TavernCore.MOD_ID,
            "settlers_tavern"), () -> new ItemStack(ModBlocks.PLATINUM_BLOCK));

    public static final ItemGroup SETTLERSTAVERN_TREES = FabricItemGroupBuilder.build(new Identifier(TavernCore.MOD_ID,
            "settlers_tavern_trees"), () -> new ItemStack(ModBlocks_Trees.MAPLE_SAPLING));

    public static final ItemGroup SETTLERSTAVERN_DECOR = FabricItemGroupBuilder.build(new Identifier(TavernCore.MOD_ID,
            "settlers_tavern_decor"), () -> new ItemStack(ModBlocks.BEER_MUG));

    public static final ItemGroup SETTLERSTAVERN_FOOD = FabricItemGroupBuilder.build(new Identifier(TavernCore.MOD_ID,
            "settlers_tavern_food"), () -> new ItemStack(ModItems.MAPLE_SYRUP));

    public static final ItemGroup SETTLERSTAVERN_MISC = FabricItemGroupBuilder.build(new Identifier(TavernCore.MOD_ID,
            "settlers_tavern_misc"), () -> new ItemStack(ModItems.UNIDENTIFIED_FOSSIL));
}
