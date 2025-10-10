package dev.itsLarss.arcanewilds.enchantment.custom;

import com.mojang.serialization.MapCodec;
import dev.itsLarss.arcanewilds.ArcaneWilds;
import dev.itsLarss.arcanewilds.enchantment.ModEnchantments;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ArcaneWilds.MOD_ID)
public class AreaMiningBlockBreakHandler {

    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        if (player == null || player.level().isClientSide()) return;
        ItemStack held = player.getMainHandItem();

        // *** Passe das hier an, falls dein Enchantment einen anderen Namen hat! ***
        int level = EnchantmentHelper.getItemEnchantmentLevel((Holder<Enchantment>) ModEnchantments.DRILL_POWER, held);
        if (level <= 0) return;

        BlockPos origin = event.getPos();
        Level world = player.level();

        // Nur für Werkzeuge (Pickaxe, Shovel, Axe)
        String name = held.getItem().getDescriptionId();
        boolean toolValid = name.contains("pickaxe") || name.contains("shovel") || name.contains("axe");
        if (!toolValid) return;

        int radius = (level == 1 ? 0 : 1);
        for (int dx = -radius; dx <= radius; dx++) {
            for (int dz = -radius; dz <= radius; dz++) {
                // Für 2x2 nur positive Offsets
                if (level == 1 && (dx < 0 || dz < 0)) continue;
                BlockPos target = origin.offset(dx, 0, dz);
                if (target.equals(origin)) continue; // Der Block des Events wird bereits abgebaut

                BlockState state = world.getBlockState(target);
                if (!state.isAir() && held.isCorrectToolForDrops(state)) {
                    world.destroyBlock(target, true, player);
                }
            }
        }
    }
}
