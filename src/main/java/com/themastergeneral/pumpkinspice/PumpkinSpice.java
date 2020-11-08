package com.themastergeneral.pumpkinspice;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("pumpkinspice")
public class PumpkinSpice
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public PumpkinSpice() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Hello from Pumpkin Spice Latte!");
    }
    
    @Mod.EventBusSubscriber(modid = "pumpkinspice", bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Registration
    {
		@SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event)
        {
			IForgeRegistry<Item> itemRegistry = event.getRegistry();

			itemRegistry.registerAll(ModItems.latte);
        }
    }
}
