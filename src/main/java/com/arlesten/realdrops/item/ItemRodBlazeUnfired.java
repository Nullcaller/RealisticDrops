package com.arlesten.realdrops.item;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.item.Item;

public class ItemRodBlazeUnfired extends Item {
	public static final ItemRodBlazeUnfired instance = new ItemRodBlazeUnfired();
	
	public ItemRodBlazeUnfired() {
		super();
		setUnlocalizedName("RodBlazeUnfired");
		setRegistryName("rod_blaze_unfired");
		setCreativeTab(TabRealDrops.instance);
	}
}
