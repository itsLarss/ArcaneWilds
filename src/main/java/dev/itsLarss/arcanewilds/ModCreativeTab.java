package dev.itsLarss.arcanewilds;

import dev.itsLarss.arcanewilds.item.ModItemClass;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArcaneWilds.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ARCANE_WILDS_TAB = CREATIVE_MODE_TABS.register("arcane_wilds_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemClass.BLUEBERRY.get()))
                    .title(Component.translatable("creative.arcane.wilds.tab"))
                    .displayItems((itemDisplayParameters, out) -> {
                        out.accept(ModItemClass.BLACKBERRY.get());
                        out.accept(ModItemClass.BLUEBERRY.get());
                        out.accept(ModItemClass.STRAWBERRY.get());
                        out.accept(ModItemClass.RASPBERRY.get());
                        out.accept(ModItemClass.DRAGON_FRUIT.get());
                        out.accept(ModItemClass.GOLDEN_DRAGON_FRUIT.get());

                        out.accept(ModItemClass.AMETHYST.get());
                        out.accept(ModItemClass.JADE.get());
                        out.accept(ModItemClass.IGNIUM_INGOT.get());

                        out.accept(ModItemClass.AMETHYST_SWORD.get());
                        out.accept(ModItemClass.AMETHYST_PICKAXE.get());
                        out.accept(ModItemClass.AMETHYST_AXE.get());
                        out.accept(ModItemClass.AMETHYST_SHOVEL.get());
                        out.accept(ModItemClass.AMETHYST_HOE.get());
                        out.accept(ModItemClass.JADE_SWORD.get());
                        out.accept(ModItemClass.JADE_PICKAXE.get());
                        out.accept(ModItemClass.JADE_AXE.get());
                        out.accept(ModItemClass.JADE_SHOVEL.get());
                        out.accept(ModItemClass.JADE_HOE.get());
                        out.accept(ModItemClass.IGNIUM_SWORD.get());
                        out.accept(ModItemClass.IGNIUM_PICKAXE.get());
                        out.accept(ModItemClass.IGNIUM_AXE.get());
                        out.accept(ModItemClass.IGNIUM_SHOVEL.get());
                        out.accept(ModItemClass.IGNIUM_HOE.get());

                        out.accept(ModItemClass.AMETHYST_HELMET.get());
                        out.accept(ModItemClass.AMETHYST_CHESTPLATE.get());
                        out.accept(ModItemClass.AMETHYST_LEGGINGS.get());
                        out.accept(ModItemClass.AMETHYST_BOOTS.get());
                        out.accept(ModItemClass.JADE_HELMET.get());
                        out.accept(ModItemClass.JADE_CHESTPLATE.get());
                        out.accept(ModItemClass.JADE_LEGGINGS.get());
                        out.accept(ModItemClass.JADE_BOOTS.get());
                        out.accept(ModItemClass.IGNIUM_HELMET.get());
                        out.accept(ModItemClass.IGNIUM_CHESTPLATE.get());
                        out.accept(ModItemClass.IGNIUM_LEGGINGS.get());
                        out.accept(ModItemClass.IGNIUM_BOOTS.get());


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
