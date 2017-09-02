package com.themastergeneral.pumpkinspice.items;

import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.pumpkinspice.PumpkinSpice;

public class ModItems extends RegisterItem
{
	public static LatteItem latte;
	public static void init()
	{
		latte = register(new LatteItem(0, false, "latte", PumpkinSpice.MODID));
	}
}
