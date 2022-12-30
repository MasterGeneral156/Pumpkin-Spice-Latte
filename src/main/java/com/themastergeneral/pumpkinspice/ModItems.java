/*
	Project:	Pumpkin Spice Latte 1.19
	File:		com.themastergeneral.pumpkinspice.ModItems
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

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ModItems {
	//@TODO: Yeah fix this.
	static MobEffectInstance speed = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10000, 1, true, false);
	static MobEffectInstance jump = new MobEffectInstance(MobEffects.JUMP, 10000, 1, true, false);
	static MobEffectInstance haste = new MobEffectInstance(MobEffects.DIG_SPEED, 10000, 1, true, false);
	
	static final FoodProperties pumpkinSpice = new FoodProperties.Builder().nutrition(4).saturationMod(0.1F).effect(speed, 1.0F).effect(jump, 1.0F).effect(haste, 1.0F).build();
	
	public static LatteItem latte = new LatteItem((new Item.Properties()).food(pumpkinSpice));
}
