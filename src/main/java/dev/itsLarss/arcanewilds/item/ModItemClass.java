package dev.itsLarss.arcanewilds.item;

import dev.itsLarss.arcanewilds.ArcaneWilds;
import dev.itsLarss.arcanewilds.block.ModBlockClass;
import dev.itsLarss.arcanewilds.item.custom.HammerItem;
import net.minecraft.world.item.*;
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
            () -> new ItemNameBlockItem(ModBlockClass.BLACKBERRY_BUSH.get(), new Item.Properties().food(ModFoodProperties.BLACKBERRY)));

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new ItemNameBlockItem(ModBlockClass.BLUEBERRY_BUSH.get(), new Item.Properties().food(ModFoodProperties.BLUEBERRY)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new ItemNameBlockItem(ModBlockClass.STRAWBERRY_BUSH.get(), new Item.Properties().food(ModFoodProperties.STRAWBERRY)));

    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new ItemNameBlockItem(ModBlockClass.RASPBERRY_BUSH.get(), new Item.Properties().food(ModFoodProperties.RASPBERRY)));

    /*public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LEMON)));

    public static final RegistryObject<Item> DRAGON_FRUIT = ITEMS.register("dragon_fruit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DRAGON_FRUIT)));

    public static final RegistryObject<Item> GOLDEN_DRAGON_FRUIT = ITEMS.register("golden_dragon_fruit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOLDEN_DRAGON_FRUIT)));*/

    public static final RegistryObject<Item> RAW_JADEIT = ITEMS.register("raw_jadeit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_IGNIUM = ITEMS.register("raw_ignium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            () -> new HammerItem(ModToolTiers.IGNIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.IGNIUM, 10, -3.2f))));

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));

    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));

    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));

    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));


    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AMETHYST, 5, -2.4f))));

    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AMETHYST, 3, -2.8f))));

    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AMETHYST, 7, -2.4f))));

    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.AMETHYST, 5.5f, -3f))));

    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.AMETHYST, 0, 0))));



    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet",
            () -> new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));

    public static final RegistryObject<Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate",
            () -> new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));

    public static final RegistryObject<Item> JADE_LEGGINGS = ITEMS.register("jade_leggings",
            () -> new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));

    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots",
            () -> new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));


    public static final RegistryObject<Item> JADE_SWORD = ITEMS.register("jade_sword",
            () -> new SwordItem(ModToolTiers.JADE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.JADE, 7, -2.4f))));

    public static final RegistryObject<Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JADE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.JADE, 4, -2.8f))));

    public static final RegistryObject<Item> JADE_AXE = ITEMS.register("jade_axe",
            () -> new AxeItem(ModToolTiers.JADE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.JADE, 9, -2.4f))));

    public static final RegistryObject<Item> JADE_SHOVEL = ITEMS.register("jade_shovel",
            () -> new ShovelItem(ModToolTiers.JADE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.JADE, 6.5f, -3f))));

    public static final RegistryObject<Item> JADE_HOE = ITEMS.register("jade_hoe",
            () -> new HoeItem(ModToolTiers.JADE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.JADE, 0, 0))));



    public static final RegistryObject<Item> IGNIUM_INGOT = ITEMS.register("ignium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IGNIUM_HELMET = ITEMS.register("ignium_helmet",
            () -> new ArmorItem(ModArmorMaterials.IGNIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));

    public static final RegistryObject<Item> IGNIUM_CHESTPLATE = ITEMS.register("ignium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.IGNIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));

    public static final RegistryObject<Item> IGNIUM_LEGGINGS = ITEMS.register("ignium_leggings",
            () -> new ArmorItem(ModArmorMaterials.IGNIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));

    public static final RegistryObject<Item> IGNIUM_BOOTS = ITEMS.register("ignium_boots",
            () -> new ArmorItem(ModArmorMaterials.IGNIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

    public static final RegistryObject<Item> IGNIUM_SWORD = ITEMS.register("ignium_sword",
            () -> new SwordItem(ModToolTiers.IGNIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.IGNIUM, 9, -2.4f))));

    public static final RegistryObject<Item> IGNIUM_PICKAXE = ITEMS.register("ignium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.IGNIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.IGNIUM, 6, -2.8f))));

    public static final RegistryObject<Item> IGNIUM_AXE = ITEMS.register("ignium_axe",
            () -> new AxeItem(ModToolTiers.IGNIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.IGNIUM, 11, -2.4f))));

    public static final RegistryObject<Item> IGNIUM_SHOVEL = ITEMS.register("ignium_shovel",
            () -> new ShovelItem(ModToolTiers.IGNIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.IGNIUM, 7.5f, -3f))));

    public static final RegistryObject<Item> IGNIUM_HOE = ITEMS.register("ignium_hoe",
            () -> new HoeItem(ModToolTiers.IGNIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.IGNIUM, 1, 0))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
