package com.arlesten.realdrops.item;

import com.arlesten.realdrops.RealDrops;
import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRodBlazeUnfired extends Item {
	public static final ItemRodBlazeUnfired instance = new ItemRodBlazeUnfired();
	public static final String name = "rod_blaze_unfired";
	
	public ItemRodBlazeUnfired() {
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
	}
	
	@SideOnly(Side.CLIENT)
	public void addModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(new ResourceLocation(RealDrops.ID, name), "inventory"));
	}
}
