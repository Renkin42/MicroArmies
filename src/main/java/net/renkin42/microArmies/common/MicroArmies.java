package net.renkin42.microArmies.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MicroArmies.mod_id, version = MicroArmies.version)
public class MicroArmies {

	public static final String mod_id = "microarmies";
	public static final String version = "1710.1180.1.0";
	
	// The instance of your mod that Forge uses.
	@Instance("microarmies")
	public static MicroArmies instance;
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "net.renkin42.microArmies.client.ClientProxy", serverSide = "net.renkin42.microArmies.common.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
	}
}
