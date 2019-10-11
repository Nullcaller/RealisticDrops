package com.arlesten.realdrops.proxy;

import com.arlesten.realdrops.block.BlockSilverOre;
import com.arlesten.realdrops.item.ItemRodBlazeUnfired;
import com.arlesten.realdrops.item.ItemSilverIngot;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Proxy {
	public void preInit(FMLPreInitializationEvent event) {
		GameRegistry.addSmelting(Items.SKULL, new ItemStack(Items.SKULL, 1, 1), 1F);
		GameRegistry.addSmelting(ItemRodBlazeUnfired.instance, new ItemStack(Items.BLAZE_ROD, 1), 1F);
		GameRegistry.addSmelting(Items.GUNPOWDER, new ItemStack(Items.GLOWSTONE_DUST, 1), 0.1F);
		GameRegistry.addSmelting(BlockSilverOre.itemBlock, new ItemStack(ItemSilverIngot.instance, 1), 0.1F);
	}

	public void init(FMLInitializationEvent event) {
		
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
