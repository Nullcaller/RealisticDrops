package com.arlesten.realdrops.item;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.item.Item;

public class ItemRodBlazeUnfired extends Item {
	public static final ItemRodBlazeUnfired instance = new ItemRodBlazeUnfired();
	public static final String name = "rod_blaze_unfired";
	
	public ItemRodBlazeUnfired() {
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
	}
}
