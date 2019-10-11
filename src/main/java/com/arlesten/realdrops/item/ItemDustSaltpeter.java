package com.arlesten.realdrops.item;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.item.Item;

public class ItemDustSaltpeter extends Item {
	public static final ItemDustSaltpeter instance = new ItemDustSaltpeter();
	public static final String name = "dust_saltpeter";
	
	public ItemDustSaltpeter() {
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
	}
}
