package com.arlesten.realdrops.block;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockCobaltOre extends Block {
	public static final BlockCobaltOre instance = new BlockCobaltOre();
	public static final String name = "cobalt_ore";
	public static final ItemBlock itemBlock = (ItemBlock) (new ItemBlock(instance)).setRegistryName(name);
	
	public BlockCobaltOre() {
		super(Material.ROCK);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
		setSoundType(SoundType.STONE);
		setHardness(4.0F);
		setResistance(8.0F);
	}
}
