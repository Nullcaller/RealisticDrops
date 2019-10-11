package com.arlesten.realdrops.item;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.item.Item;

public class ItemSilverIngot extends Item {
	public static final ItemSilverIngot instance = new ItemSilverIngot();
	public static final String name = "silver_ingot";
	
	public ItemSilverIngot() {
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
	}
}
