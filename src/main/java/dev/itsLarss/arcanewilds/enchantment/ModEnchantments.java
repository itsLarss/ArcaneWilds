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

    public static final Enchantment DRILL_POWER = Registry.register(
            Registry.ENCHANTMENT,
            new ResourceLocation("arcanewilds", "drill_power"),
            new DrillPowerEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.MAINHAND)
    );

    private static void register(BootstrapContext<Enchantment> registry, ResourceKey<Enchantment> key, Enchantment.Builder builder) {
        registry.register(key, builder.build(key.location()));
    }
}
