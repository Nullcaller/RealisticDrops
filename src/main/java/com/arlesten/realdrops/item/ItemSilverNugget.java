package com.arlesten.realdrops.item;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.item.Item;

public class ItemSilverNugget extends Item {
	public static final ItemSilverNugget instance = new ItemSilverNugget();
	public static final String name = "silver_nugget";
	
	public ItemSilverNugget() {
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
	}
}
