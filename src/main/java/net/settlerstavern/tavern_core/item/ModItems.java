package net.settlerstavern.tavern_core.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.block.ModBlocks;
import net.settlerstavern.tavern_core.block.ModBlocks_Trees;
import net.settlerstavern.tavern_core.item.custom.FossilItem;


public class ModItems {

    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN)));

    public static final Item UNIDENTIFIED_FOSSIL = registerItem("fossils/unidentified_fossil",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item ACANTHOSTEGA = registerItem("fossils/acanthostega",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item AMMONITE = registerItem("fossils/ammonite",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item ANOMALOCARIS = registerItem("fossils/anomalocaris",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item ARCEHLON_BODY = registerItem("fossils/arcehlon_body",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item ARCEHLON_SKULL = registerItem("fossils/arcehlon_skull",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item DUNKLEOSTEUS_BODY = registerItem("fossils/dunkleosteus_body",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item DUNKLEOSTEUS_SKULL = registerItem("fossils/dunkleosteus_skull",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item DUNKLEOSTEUS_TAIL = registerItem("fossils/dunkleosteus_tail",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item EUSTHENOPTERON = registerItem("fossils/eusthenopteron",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item OPHTHALMOSAURUS_BODY = registerItem("fossils/ophthalmosaurus_body",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item OPHTHALMOSAURUS_SKULL = registerItem("fossils/ophthalmosaurus_skull",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item OPHTHALMOSAURUS_TAIL = registerItem("fossils/ophthalmosaurus_tail",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item PLESIOSAURUS_BODY = registerItem("fossils/plesiosaurus_body",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item PLESIOSAURUS_NECK = registerItem("fossils/plesiosaurus_neck",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item PLESIOSAURUS_SKULL = registerItem("fossils/plesiosaurus_skull",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item PLESIOSAURUS_TAIL = registerItem("fossils/plesiosaurus_tail",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item SHARK_TOOTH = registerItem("fossils/shark_tooth",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item TRILOBITE = registerItem("fossils/trilobite",
            new FossilItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_TREES).maxCount(16),
                    ModBlocks_Trees.MAPLE_SIGN_BLOCK, ModBlocks_Trees.MAPLE_WALL_SIGN_BLOCK));

    public static final Item WILLOW_SIGN = registerItem("willow_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_TREES).maxCount(16),
                    ModBlocks_Trees.WILLOW_SIGN_BLOCK, ModBlocks_Trees.WILLOW_WALL_SIGN_BLOCK));

        public static final Item SCULK_SIGN = registerItem("sculk_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_TREES).maxCount(16),
                    ModBlocks_Trees.SCULK_SIGN_BLOCK, ModBlocks_Trees.SCULK_WALL_SIGN_BLOCK));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TavernCore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TavernCore.LOGGER.debug("Registering mod items for " + TavernCore.MOD_ID);
    }
}
