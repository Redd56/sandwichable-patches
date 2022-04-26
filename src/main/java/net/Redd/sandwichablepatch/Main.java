package net.Redd.sandwichablepatch;

import net.Redd.sandwichablepatch.compats.ArchitectsPalette;
import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Sandwichable Addon:(modded woods fabric)");
	public static final RuntimeResourcePack SANDWICHABLE_RESOURCES = RuntimeResourcePack.create("sandwichable:main");

	@Override
	public void onInitialize() {


		if(FabricLoader.getInstance().isModLoaded("architects_palette")) {
			ArchitectsPalette.init();
			LOGGER.info("Setting up Architechts palette");
		}
		RRPCallback.BEFORE_VANILLA.register(a -> a.add(SANDWICHABLE_RESOURCES));

	}
}
