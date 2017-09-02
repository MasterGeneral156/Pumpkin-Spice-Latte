package com.themastergeneral.pumpkinspice;

import com.themastergeneral.pumpkinspice.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PumpkinSpice.MODID, name = PumpkinSpice.MODNAME, version = PumpkinSpice.VERSION, dependencies = PumpkinSpice.DEPENDENCIES, updateJSON = PumpkinSpice.JSON)
public class PumpkinSpice 
{
	public static final String MODID = "pumpkinspice";
	public static final String MODNAME = "Pumpkin Spice Latte";
	public static final String VERSION = "1.0.0";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.1.6,]";
	public static final String JSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/PumpkinSpice.json";
	
	@Instance
    public static PumpkinSpice instance = new PumpkinSpice();
	
	@SidedProxy(clientSide="com.themastergeneral.pumpkinspice.proxy.ClientProxy", serverSide="com.themastergeneral.pumpkinspice.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	proxy.preInit(e);
    }
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	proxy.postInit(e);
    }
}
