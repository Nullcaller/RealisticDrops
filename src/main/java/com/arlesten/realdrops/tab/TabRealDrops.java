package com.arlesten.realdrops.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TabRealDrops extends CreativeTabs {
	public static final TabRealDrops instance = new TabRealDrops();
	public static final String name = "tab_real_drops";
	
	public TabRealDrops() {
		super(name);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.GUNPOWDER);
	}
}
