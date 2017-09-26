package com.themastergeneral.pumpkinspice.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.pumpkinspice.items.ModItems;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		ModItems.init();
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
