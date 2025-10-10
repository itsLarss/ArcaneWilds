package dev.itsLarss.arcanewilds.enchantment;

import com.mojang.blaze3d.font.SpaceProvider;
import dev.itsLarss.arcanewilds.ArcaneWilds;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.item.enchantment.Enchantment;

public class ModEnchantments {
    public static final ResourceKey<Enchantment> DRILL_POWER = ResourceKey.create(Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(ArcaneWilds.MOD_ID, "drill_power"));

    public static void bootstrap(BootstrapContext<Enchantment> context) {
        var enchantments = context.lookup(Registries.ENCHANTMENT);
        var items = context.lookup(Registries.ITEM);
        var pickaxeTag = items.getOrThrow(ItemTags.PICKAXES);

        // Definition des Enchantments
        Enchantment.EnchantmentDefinition definition = Enchantment.definition(
                pickaxeTag,
                pickaxeTag,
                5,
                1,
                Enchantment.dynamicCost(10, 10),
                Enchantment.dynamicCost(30, 10),
                5,
                EquipmentSlotGroup.MAINHAND
        );

        register(context, DRILL_POWER, Enchantment.enchantment(definition));

    }

    private static void register(BootstrapContext<Enchantment> registry, ResourceKey<Enchantment> key, Enchantment.Builder builder) {
        registry.register(key, builder.build(key.location()));
    }
}
