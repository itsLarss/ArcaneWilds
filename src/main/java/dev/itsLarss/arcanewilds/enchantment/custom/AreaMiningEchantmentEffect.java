package dev.itsLarss.arcanewilds.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.phys.Vec3;

public record AreaMiningEchantmentEffect() implements EnchantmentEntityEffect {

    public static final MapCodec<AreaMiningEchantmentEffect> CODEC = MapCodec.unit(new AreaMiningEchantmentEffect());

    @Override
    public void apply(ServerLevel level, int enchantmentLevel, EnchantedItemInUse enchantedItem, Entity entity, Vec3 origin) {
        if (level.isClientSide()) return;
        ItemStack stack = enchantedItem.itemStack();

        // Nur wenn Entity ein Spieler ist!
        if (!(entity instanceof net.minecraft.world.entity.player.Player player)) return;

        // Bestimme Radius
        int radius = (enchantmentLevel == 1) ? 0 : 1; // 2x2 bei Stufe 1, 3x3 bei Stufe 2

        // Hole Blockposition aus Origin
        BlockPos center = BlockPos.containing(origin);

        // Nur für passende Tools!
        String itemName = stack.getItem().getDescriptionId();
        boolean validTool = itemName.contains("pickaxe") || itemName.contains("shovel") || itemName.contains("axe");
        if (!validTool) return;

        // Flächenabbau
        for (int dx = -radius; dx <= radius; dx++) {
            for (int dz = -radius; dz <= radius; dz++) {
                if (enchantmentLevel == 1 && (dx < 0 || dz < 0)) continue; // Nur positive für 2x2
                BlockPos target = center.offset(dx, 0, dz);
                if (!target.equals(center)) {
                    var state = level.getBlockState(target);
                    if (!state.isAir() && stack.isCorrectToolForDrops(state)) {
                        level.destroyBlock(target, true, player);
                    }
                }
            }
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec() {
        return CODEC;
    }
}
