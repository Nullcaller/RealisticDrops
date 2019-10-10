package com.arlesten.realdrops.item;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.item.Item;

public class ItemDustSaltpeter extends Item {
	public static final ItemDustSaltpeter instance = new ItemDustSaltpeter();
	
	public ItemDustSaltpeter() {
		super();
		setUnlocalizedName("DustSaltpeter");
		setRegistryName("dust_saltpeter");
		setCreativeTab(TabRealDrops.instance);
	}
}
