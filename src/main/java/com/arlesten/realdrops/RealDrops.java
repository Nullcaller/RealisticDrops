package com.arlesten.realdrops;

import com.arlesten.realdrops.proxy.Proxy;
import com.arlesten.realdrops.proxy.ProxyClient;
import com.arlesten.realdrops.proxy.ProxyServer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RealDrops.ID)
public class RealDrops {
	public static final String ID = "@MODID@";
	
	@Instance
	public static RealDrops instance;
	
	@SidedProxy(modId = RealDrops.ID, clientSide = ProxyClient.location, serverSide = ProxyServer.location)
	public static Proxy proxy;
	
	@EventHandler public void preInit(FMLPreInitializationEvent event) { proxy.preInit(event); }
	@EventHandler public void init(FMLInitializationEvent event) { proxy.init(event); }
	@EventHandler public void postInit(FMLPostInitializationEvent event) { proxy.postInit(event); }
}
