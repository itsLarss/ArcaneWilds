package dev.itsLarss.arcanewilds.enchantment.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.enchantment.Enchantment;

public class DrillPowerEnchantment extends Enchantment {
    public DrillPowerEnchantment(Rarity rarity, EquipmentSlot... slots) {
        super(rarity, EnchantmentCategory.DIGGER, slots);
    }

    @Override
    public int getMaxLevel() {
        return 2; // Level 1 (2x2), Level 2 (3x3)
    }

    @Override
    public boolean canEnchant(ItemStack stack) {
        return stack.isCorrectToolForDrops(stack.getItem().defaultBlockState());
    }
}
