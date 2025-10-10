package dev.itsLarss.arcanewilds.event.enchantment;

import dev.itsLarss.arcanewilds.enchantment.ModEnchantments;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DrillPowerEnchantmentHandler {
    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack tool = player.getMainHandItem();
        int level = tool.getEnchantmentLevel(ModEnchantments.DRILL_POWER);

        if (level > 0) {
            BlockPos center = event.getPos();
            Level world = player.level;

            int radius = (level == 1) ? 0 : 1;
            for (int dx = -radius; dx <= radius; dx++) {
                for (int dz = -radius; dz <= radius; dz++) {
                    BlockPos target = center.offset(dx, 0, dz);
                    if (target.equals(center)) continue;
                    BlockState state = world.getBlockState(target);
                    if (tool.isCorrectToolForDrops(state)) {
                        world.destroyBlock(target, true, player);
                        tool.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(player.getUsedItemHand()));
                    }
                }
            }
        }
    }
}
