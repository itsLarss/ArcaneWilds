package dev.itsLarss.arcanewilds.item;

import dev.itsLarss.arcanewilds.utils.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier JADE = new ForgeTier(2100, 4, 3f, 20,
            ModTags.Blocks.NEEDS_JADE_TOOL, () -> Ingredient.of(ModItemClass.JADE.get()),
            ModTags.Blocks.INCORRECT_FOR_JADE_TOOL);

    public static final Tier AMETHYST = new ForgeTier(1800, 4, 3f, 20,
            ModTags.Blocks.NEEDS_AMETHYST_TOOL, () -> Ingredient.of(ModItemClass.AMETHYST.get()),
            ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL);

    public static final Tier IGNIUM = new ForgeTier(2600, 4, 3f, 20,
            ModTags.Blocks.NEEDS_IGNIUM_TOOL, () -> Ingredient.of(ModItemClass.IGNIUM.get()),
            ModTags.Blocks.INCORRECT_FOR_IGNIUM_TOOL);
}
