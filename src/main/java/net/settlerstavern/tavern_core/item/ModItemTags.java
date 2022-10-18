package net.settlerstavern.tavern_core.item;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemTags {
    public static final TagKey<Item> FOSSILS = TagKey.of(Registry.ITEM_KEY, new Identifier("tavern_core", "fossils"));
}
