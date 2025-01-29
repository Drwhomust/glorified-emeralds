package xyz.drwhomust.emeraldripoff;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.drwhomust.emeraldripoff.item.Moditems;

public class GlorifiedEmeralds implements ModInitializer {
	public static final String MOD_ID = "glorified-emeralds";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FuelRegistryEvents.BUILD.register(((builder, context) -> builder.add(Moditems.ruby, 600)));


	}
}