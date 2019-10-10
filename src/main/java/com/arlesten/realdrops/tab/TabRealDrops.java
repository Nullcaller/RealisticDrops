package com.arlesten.realdrops.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TabRealDrops extends CreativeTabs {
	public static final TabRealDrops instance = new TabRealDrops();
	
	public TabRealDrops() {
		super("tabRealDrops");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.GUNPOWDER);
	}
}
