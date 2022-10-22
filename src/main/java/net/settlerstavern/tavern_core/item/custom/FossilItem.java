package net.settlerstavern.tavern_core.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FossilItem extends Item {
    public FossilItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.getNbt() != null) {
            tooltip.add(Text.of(stack.getNbt().get("rarity").asString().formatted(Formatting.GOLD)));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
