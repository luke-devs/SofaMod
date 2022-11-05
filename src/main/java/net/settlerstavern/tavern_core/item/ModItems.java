package net.settlerstavern.tavern_core.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.tavern_core.entity.ModEntities;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.block.ModBlocksTrees;
import net.settlerstavern.tavern_core.item.custom.FossilItem;


public class ModItems {

    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item TRINKET_PILE = registerItem("trinket_pile",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item EXQUISITE_EMERALD = registerItem("exquisite_emerald",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item FIRE_QUARTZ = registerItem("fire_quartz",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item FLAWLESS_DIAMOND = registerItem("flawless_diamond",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item GARNET = registerItem("garnet",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item GLEAMING_LAPIS = registerItem("gleaming_lapis",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item BRILLIANT_AMETHYST = registerItem("brilliant_amethyst",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item SHINING_PEARL = registerItem("shining_pearl",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item RADIANT_GLOWSTONE = registerItem("radiant_glowstone",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item NETHER_BLACK_HOLE = registerItem("nether_black_hole",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item ONYX = registerItem("onyx",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item CORROSIVE_SOLVENT = registerItem("corrosive_solvent",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item KRAKEN_GREASE = registerItem("kraken_grease",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

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
                    ModBlocksTrees.MAPLE_SIGN_BLOCK, ModBlocksTrees.MAPLE_WALL_SIGN_BLOCK));

    public static final Item WILLOW_SIGN = registerItem("willow_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_TREES).maxCount(16),
                    ModBlocksTrees.WILLOW_SIGN_BLOCK, ModBlocksTrees.WILLOW_WALL_SIGN_BLOCK));

    public static final Item EUCALYPTUS_SIGN = registerItem("eucalyptus_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_TREES).maxCount(16),
                    ModBlocksTrees.EUCALYPTUS_SIGN_BLOCK, ModBlocksTrees.EUCALYPTUS_WALL_SIGN_BLOCK));

    public static final Item CHERRY_BLOSSOM_SIGN = registerItem("cherry_blossom_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_TREES).maxCount(16),
                    ModBlocksTrees.CHERRY_BLOSSOM_SIGN_BLOCK, ModBlocksTrees.CHERRY_BLOSSOM_WALL_SIGN_BLOCK));

    public static final Item SCULK_SIGN = registerItem("sculk_sign",
        new SignItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_TREES).maxCount(16),
                ModBlocksTrees.SCULK_SIGN_BLOCK, ModBlocksTrees.SCULK_WALL_SIGN_BLOCK));

    public static final Item SILVERBELL_SIGN = registerItem("silverbell_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_TREES).maxCount(16),
                    ModBlocksTrees.SILVERBELL_SIGN_BLOCK, ModBlocksTrees.SILVERBELL_WALL_SIGN_BLOCK));

    public static final Item KRAKEN_SPAWN_EGG = registerItem("kraken_spawn_egg",
            new SpawnEggItem(ModEntities.KRAKEN,0x948e8d, 0x3b3635,
                        new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item DUCKY_SPAWN_EGG = registerItem("ducky_spawn_egg",
            new SpawnEggItem(ModEntities.DUCKY,0x1d5735, 0x47372d,
                    new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_MISC)));

    public static final Item MAPLE_SYRUP = registerItem("maple_syrup",
            new Item(new FabricItemSettings().group(ModItemGroup.SETTLERSTAVERN_FOOD)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TavernCore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TavernCore.LOGGER.debug("Registering mod items for " + TavernCore.MOD_ID);
    }
}
