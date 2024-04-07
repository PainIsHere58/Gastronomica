package net.noelle.gastronomica.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.noelle.gastronomica.Gastronomica;

public class ModItemGroups {

    public static final ItemGroup GASTRONOMICA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Gastronomica.MOD_ID, "gastronomica"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gastronomica"))
                    .icon(() -> new ItemStack(ModItems.BAKED_APPLE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BAKED_APPLE);
                        entries.add(ModItems.SKEWER);
                        entries.add(ModItems.ROCK_HARD_STEW);


                    }).build());

    public static void registerItemGroups() {
        Gastronomica.LOGGER.info("REGISTERING ITEM GROUPS " + Gastronomica.MOD_ID);
    }
}
