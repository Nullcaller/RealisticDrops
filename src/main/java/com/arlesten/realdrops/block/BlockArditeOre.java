package com.arlesten.realdrops.block;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockArditeOre extends Block {
	public static final BlockArditeOre instance = new BlockArditeOre();
	public static final String name = "ardite_ore";
	public static final ItemBlock itemBlock = (ItemBlock) (new ItemBlock(instance)).setRegistryName(name);
	
	public BlockArditeOre() {
		super(Material.ROCK);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(10.0F);
	}
}
