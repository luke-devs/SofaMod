package net.settlerstavern.tavern_core.util;


import com.mojang.datafixers.types.templates.Tag;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.settlerstavern.tavern_core.TavernCore;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> FOSSILS = createCommonTag("fossils");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(TavernCore.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
