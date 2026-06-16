/*
	Project:	Pumpkin Spice Latte 26.1.1
	File:		com.themastergeneral.pumpkinspice.PumpkinSpice
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/Pumpkin-Spice-Latte
	License:	MIT License

				Copyright (c) 2026 MasterGeneral156
				
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

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("pumpkinspice")
public class PumpkinSpice
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static String MODID = "pumpkinspice";
    public static final FoodProperties pumpkinSpice = new FoodProperties.Builder().nutrition(4).saturationModifier(0.1F).alwaysEdible().build();

    public PumpkinSpice(IEventBus modEventBus) {
        // Register the setup method for modloading
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::fillTab);


        // Register ourselves for server and other game events we are interested in
        itemRegistry.ITEMS.register(modEventBus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Hello from Pumpkin Spice Latte!");
    }

    public static class itemRegistry
    {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

        public static final DeferredItem<Item> latte = ITEMS.registerItem(
                "latte",
                LatteItem::new, // The factory that the properties will be passed into.
                props -> props // A unary operator of the properties to use.
        );
    }
    
    private void fillTab(BuildCreativeModeTabContentsEvent ev)
	{
		if (ev.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS)
			ev.accept(new ItemStack(itemRegistry.latte.asItem()));
	}
}
