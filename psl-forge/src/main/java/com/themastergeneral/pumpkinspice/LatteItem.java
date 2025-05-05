/*
	Project:	Pumpkin Spice Latte 1.21
	File:		com.themastergeneral.pumpkinspice.LatteItem
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/Pumpkin-Spice-Latte
	License:	MIT License

				Copyright (c) 2025 MasterGeneral156
				
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

import com.themastergeneral.ctdcore.item.CTDItem;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.ConsumableListener;
import net.minecraft.world.level.Level;

public class LatteItem extends ConsumableItem {
	public LatteItem(Item.Properties properties, FoodProperties food, Consumable consumable) {
		super(properties, food, consumable);
	}

	public static class PumpkinSpiceConsumable implements Consumable, ConsumableListener {
		@Override
		public void onConsume(Level level, LivingEntity entity, ItemStack stack, Consumable consumable) {
			if (!level.isClientSide) {
				entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1));
				entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 200, 1));
				entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, 1));
			}
		}

		@Override
		public Holder<SoundEvent> sound() {
			return Holder.direct(SoundEvents.GENERIC_DRINK.get()); // Or a custom sound
		}
	}

}

