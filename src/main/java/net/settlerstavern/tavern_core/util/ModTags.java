package net.settlerstavern.tavern_core.util;


import com.mojang.datafixers.types.templates.Tag;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> FOSSILS = TagKey.of(Registry.ITEM_KEY, new Identifier("tavern_core", "fossils"));
    }
}
