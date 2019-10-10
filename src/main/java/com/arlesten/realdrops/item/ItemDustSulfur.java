package com.arlesten.realdrops.item;

import com.arlesten.realdrops.RealDrops;
import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDustSulfur extends Item {
	public static final ItemDustSulfur instance = new ItemDustSulfur();
	public static final String name = "dust_sulfur";
	
	public ItemDustSulfur() {
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
