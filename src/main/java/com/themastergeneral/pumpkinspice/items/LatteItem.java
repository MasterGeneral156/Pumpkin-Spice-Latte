package com.themastergeneral.pumpkinspice.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class LatteItem extends ItemFood implements ItemModelProvider 
{
	protected String name;
	protected String modid;
	public LatteItem(int amount, boolean isWolfFood, String name, String modid) 
	{
		super(amount, isWolfFood);
		this.name = name;
		this.modid = modid;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setAlwaysEdible();
	}
	public void registerItemModel(Item item) 
	{
		Main.proxy.registerItemRenderer(modid, this, 0, name);
	}
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) 
	{
	    super.onFoodEaten(stack, world, player);
	    player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 10000, 4, true, false));
	    player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 10000, 4, true, false));
	    player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 10000, 1, true, false));
	}
}
