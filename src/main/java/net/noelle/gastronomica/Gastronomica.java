package net.noelle.gastronomica;

import net.fabricmc.api.ModInitializer;

import net.noelle.gastronomica.item.ModItemGroups;
import net.noelle.gastronomica.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gastronomica implements ModInitializer {
	public static final String MOD_ID = "gastronomica";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}