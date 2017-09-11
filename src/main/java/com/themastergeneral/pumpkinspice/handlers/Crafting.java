package com.themastergeneral.pumpkinspice.handlers;

import com.themastergeneral.pumpkinspice.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafting {
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.latte), "PS", "W ", 'P', Blocks.PUMPKIN, 'W', Items.WATER_BUCKET, 'S', Items.SUGAR);
	}
}
