package net.noelle.gastronomica.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ROCK_HARD_STEW =
            new FoodComponent.Builder().hunger(2).saturationModifier(0.25f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 2), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 3), 1.0f)
                    .build();
    public static final FoodComponent BAKED_APPLE =
            new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build();
}
