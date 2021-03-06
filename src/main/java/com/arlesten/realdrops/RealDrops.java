package com.arlesten.realdrops;

import com.arlesten.realdrops.proxy.Proxy;
import com.arlesten.realdrops.proxy.ProxyClient;
import com.arlesten.realdrops.proxy.ProxyServer;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
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
	
	@Config(modid = RealDrops.ID, category = "drops")
	public static class configDrops {
		public static _bonelike bonelike = new _bonelike();
		public static _skulllike skulllike = new _skulllike();
		
		public static class _bonelike {
			@Name("One per HP")
			public float perhp = 5;
			
			@Name("Drop IDs")
			public String[] ids = { "minecraft:bone" };
		}
		
		public static class _skulllike {
			@Name("Chance per HP")
			public float perhp = 0.04F;
			
			@Name("Chance per looting level")
			public float perll = 0.05F;
			
			@Name("Drop IDs")
			public String[] ids = { "minecraft:skull" };
		}
	}
	
	@Config(modid = RealDrops.ID, category = "generation")
	public static class configGeneration {
		public static _silver silver = new _silver();
		public static _saltpeter saltpeter = new _saltpeter();
		public static _sulfur sulfur = new _sulfur();
		public static _quartz quartz = new _quartz();
		public static _cobalt cobalt = new _cobalt();
		public static _ardite ardite = new _ardite();
		
		
		public static class _silver {
			@Name("Enable")
			public boolean enable = true;
			
			@Name("Block Amount")
			public int blockAmount = 4;

			@Name("Chances to Spawn")
			public int chancesToSpawn = 6;

			@Name("Minimum Spawn Height")
			public int minHeight = 10;

			@Name("Maximum Spawn Height")
			public int maxHeight = 40;
		}
		
		public static class _quartz {
			@Name("Enable")
			public boolean enable = true;
			
			@Name("Block Amount")
			public int blockAmount = 6;

			@Name("Chances to Spawn")
			public int chancesToSpawn = 6;

			@Name("Minimum Spawn Height")
			public int minHeight = 10;

			@Name("Maximum Spawn Height")
			public int maxHeight = 30;
		}
			
		public static class _saltpeter {
			@Name("Enable")
			public boolean enable = true;
			
			@Name("Block Amount")
			public int blockAmount = 8;

			@Name("Chances to Spawn")
			public int chancesToSpawn = 10;

			@Name("Minimum Spawn Height")
			public int minHeight = 30;

			@Name("Maximum Spawn Height")
			public int maxHeight = 70;				
		}
			
		public static class _sulfur {
			@Name("Enable")
			public boolean enable = true;
			
			@Name("Block Amount")
			public int blockAmount = 16;

			@Name("Chances to Spawn")
			public int chancesToSpawn = 2;

			@Name("Minimum Spawn Height")
			public int minHeight = 40;

			@Name("Maximum Spawn Height")
			public int maxHeight = 256;
		}
		
		public static class _cobalt {
			@Name("Enable")
			public boolean enable = false;
			
			@Name("Block Amount")
			public int blockAmount = 3;

			@Name("Chances to Spawn")
			public int chancesToSpawn = 30;

			@Name("Minimum Spawn Height")
			public int minHeight = 0;

			@Name("Maximum Spawn Height")
			public int maxHeight = 20;
		}
		
		public static class _ardite {
			@Name("Enable")
			public boolean enable = false;
			
			@Name("Block Amount")
			public int blockAmount = 3;

			@Name("Chances to Spawn")
			public int chancesToSpawn = 30;

			@Name("Minimum Spawn Height")
			public int minHeight = 0;

			@Name("Maximum Spawn Height")
			public int maxHeight = 20;
		}
	}
}
