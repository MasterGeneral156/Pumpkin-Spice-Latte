package com.themastergeneral.pumpkinspice;

import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems {
	Food pumpkinspice = (new Food.Builder()).hunger(3).saturation(1.0F).build();
	public static LatteItem latte = new LatteItem((new Item.Properties()).group(ItemGroup.FOOD).food(Foods.APPLE), "latte");
}
