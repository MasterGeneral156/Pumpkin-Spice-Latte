/*
	Project:	Pumpkin Spice Latte 1.16
	File:		com.themastergeneral.pumpkinspice.ModItems
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/Pumpkin-Spice-Latte
	License:	MIT License

				Copyright (c) 2017 MasterGeneral156
				
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

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModItems {
	//@TODO: Yeah fix this.
	static EffectInstance speed = new EffectInstance(Effects.SPEED, 10000, 3, true, false);
	static EffectInstance jump = new EffectInstance(Effects.JUMP_BOOST, 10000, 1, true, false);
	static EffectInstance haste = new EffectInstance(Effects.HASTE, 10000, 1, true, false);
	
	static Food pumpkinspice = (new Food.Builder()).hunger(3).saturation(1.0F).effect(speed, 1.0F).effect(jump, 1.0F).effect(haste, 1.0F).setAlwaysEdible().build();
	public static LatteItem latte = new LatteItem((new Item.Properties()).group(ItemGroup.FOOD).food(pumpkinspice));
}
