package com.themastergeneral.pumpkinspice;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModItems {
	//@TODO: Yeah fix this.
	static EffectInstance speed = new EffectInstance(Effects.SPEED, 10000, 4, true, false);
	static EffectInstance jump = new EffectInstance(Effects.JUMP_BOOST, 10000, 1, true, false);
	static EffectInstance haste = new EffectInstance(Effects.HASTE, 10000, 4, true, false);
	
	static Food pumpkinspice = (new Food.Builder()).hunger(3).saturation(1.0F).effect(speed, 1.0F).effect(jump, 1.0F).effect(haste, 1.0F).setAlwaysEdible().build();
	public static LatteItem latte = new LatteItem((new Item.Properties()).group(ItemGroup.FOOD).food(pumpkinspice), "latte");
}
