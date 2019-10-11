package com.arlesten.realdrops.item;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.item.Item;

public class ItemDustSulfur extends Item {
	public static final ItemDustSulfur instance = new ItemDustSulfur();
	public static final String name = "dust_sulfur";
	
	public ItemDustSulfur() {
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
	}
}
