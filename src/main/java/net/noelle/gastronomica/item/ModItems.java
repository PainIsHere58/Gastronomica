package net.noelle.gastronomica.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.noelle.gastronomica.Gastronomica;

public class ModItems {

    public static final Item BAKED_APPLE = registerItem("baked_apple", new Item(new FabricItemSettings()
            .food(ModFoodComponents.BAKED_APPLE)));
    public static final Item SKEWER = registerItem("skewer", new Item(new FabricItemSettings()));

    public static final Item ROCK_HARD_STEW = registerItem("rock_hard_stew", new Item(new FabricItemSettings()
            .food(ModFoodComponents.ROCK_HARD_STEW)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Gastronomica.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Gastronomica.LOGGER.info("REGISTERING STUFF " + Gastronomica.MOD_ID);

    }
}
