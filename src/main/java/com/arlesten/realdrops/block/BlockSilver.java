package com.arlesten.realdrops.block;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockSilver extends Block {
	public static final BlockSilver instance = new BlockSilver();
	public static final String name = "silver_block";
	public static final ItemBlock itemBlock = (ItemBlock) (new ItemBlock(instance)).setRegistryName(name);
	
	public BlockSilver() {
		super(Material.IRON);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
		setSoundType(SoundType.METAL);
		setHardness(1.5F);
		setResistance(1.5F);
	}
}
