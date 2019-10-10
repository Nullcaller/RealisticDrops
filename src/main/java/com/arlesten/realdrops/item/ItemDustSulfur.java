package com.arlesten.realdrops.item;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.item.Item;

public class ItemDustSulfur extends Item {
	public static final ItemDustSulfur instance = new ItemDustSulfur();
	
	public ItemDustSulfur() {
		super();
		setUnlocalizedName("DustSulfur");
		setRegistryName("dust_sulfur");
		setCreativeTab(TabRealDrops.instance);
	}
}
