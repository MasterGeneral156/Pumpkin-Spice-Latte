package com.themastergeneral.pumpkinspice;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.pumpkinspice.proxy.CommonProxy;

@Mod(modid = PumpkinSpice.MODID, name = PumpkinSpice.MODNAME, certificateFingerprint = PumpkinSpice.FingerPrint, version = PumpkinSpice.VERSION, dependencies = PumpkinSpice.DEPENDENCIES, updateJSON = PumpkinSpice.JSON)
public class PumpkinSpice {
	public static final String MODID = "pumpkinspice";
	public static final String MODNAME = "Pumpkin Spice Latte";
	public static final String VERSION = "1.1.2";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.3.3,]";
	public static final String JSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/PumpkinSpice.json";
	public static final String FingerPrint = "5101015479fe39f20b47f365472250d312a50a57";

	@Instance
	public static PumpkinSpice instance = new PumpkinSpice();

	@SidedProxy(clientSide = "com.themastergeneral.pumpkinspice.proxy.ClientProxy", serverSide = "com.themastergeneral.pumpkinspice.proxy.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for Pumpkin Spice Latte! TheMasterGeneral will not support this version!");
	}
}
