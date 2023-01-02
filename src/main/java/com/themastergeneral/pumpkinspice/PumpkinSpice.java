/*
	Project:	Pumpkin Spice Latte 1.19
	File:		com.themastergeneral.pumpkinspice.PumpkinSpice
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/Pumpkin-Spice-Latte
	License:	MIT License

				Copyright (c) 2022 MasterGeneral156
				
				Permission is hereby granted, free of charge, to any person obtaining a copy
				of this software and associated documentation files (the "Software"), to deal
				in the Software without restriction, including without limitation the rights
				to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
				copies of the Software, and to permit persons to whom the Software is
				furnished to do so, subject to the following conditions:
				
				The above copyright notice and this permission notice shall be included in all
				copies or substantial portions of the Software.
				
				THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
				IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
				FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
				AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
				LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
				OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
				SOFTWARE.
*/
package com.themastergeneral.pumpkinspice;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("pumpkinspice")
public class PumpkinSpice
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static String MODID = "pumpkinspice";

    public PumpkinSpice() {
    	MinecraftForge.EVENT_BUS.register(this);
    	
        // Register the setup method for modloading
    	IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
    	modbus.addListener(this::setup);
        modbus.addListener(this::fillTab);
        
        // Register ourselves for server and other game events we are interested in
        itemRegistry.ITEMS.register(modbus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Hello from Pumpkin Spice Latte!");
    }
    
    public static class itemRegistry
    {
    	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    	
    	public static final RegistryObject<Item> latte = ITEMS.register("latte", () -> ModItems.latte);
    }
    
    private void fillTab(CreativeModeTabEvent.BuildContents ev)
	{
		if (ev.getTab() == CreativeModeTabs.FOOD_AND_DRINKS)
			ev.accept(ModItems.latte);
	}
}
