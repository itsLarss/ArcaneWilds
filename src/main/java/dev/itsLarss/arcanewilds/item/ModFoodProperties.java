package dev.itsLarss.arcanewilds.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BLACKBERRY = new FoodProperties.Builder()
            .nutrition(3).saturationModifier(0.25f).fast().build();

    public static final FoodProperties BLUEBERRY = new FoodProperties.Builder()
            .nutrition(3).saturationModifier(0.25f).fast().build();

    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder()
            .nutrition(3).saturationModifier(0.25f).fast().build();

    public static final FoodProperties RASPBERRY = new FoodProperties.Builder()
            .nutrition(3).saturationModifier(0.25f).fast().build();

    public static final FoodProperties LEMON = new FoodProperties.Builder()
            .nutrition(5).saturationModifier(0.5f).build();

    public static final FoodProperties DRAGON_FRUIT = new FoodProperties.Builder()
            .nutrition(5).saturationModifier(0.5f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60), 0.5f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 30), 0.25f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 60), 0.75f).build();

    public static final FoodProperties GOLDEN_DRAGON_FRUIT = new FoodProperties.Builder()
            .nutrition(16).saturationModifier(2.5f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400), 1.0f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 2600, 1), 1.0f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 1400), 1.0f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2), 1.0f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2800, 2), 1.0f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2800, 1), 1.0f)
            .alwaysEdible().build();

    public static final FoodProperties PAPRIKA = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.5f).build();

    public static final FoodProperties CUCUMBER = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.5f).build();

    public static final FoodProperties TOMATO = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.5f).build();
}
