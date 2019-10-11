package com.arlesten.realdrops.block;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockSilverOre extends Block {
	public static final BlockSilverOre instance = new BlockSilverOre();
	public static final String name = "silver_ore";
	public static final ItemBlock itemBlock = (ItemBlock) (new ItemBlock(instance)).setRegistryName(name);
	
	public BlockSilverOre() {
		super(Material.ROCK);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(1.5F);
	}
}
