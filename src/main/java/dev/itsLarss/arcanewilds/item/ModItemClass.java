package dev.itsLarss.arcanewilds.item;

import dev.itsLarss.arcanewilds.ArcaneWilds;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemClass {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArcaneWilds.MOD_ID);

    /**
     * public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties().stacksTo(64)));
     **/

    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLACKBERRY)));

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLUEBERRY)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STRAWBERRY)));

    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RASPBERRY)));

    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LEMON)));

    public static final RegistryObject<Item> DRAGON_FRUIT = ITEMS.register("dragon_fruit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DRAGON_FRUIT)));

    public static final RegistryObject<Item> GOLDEN_DRAGON_FRUIT = ITEMS.register("golden_dragon_fruit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOLDEN_DRAGON_FRUIT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
