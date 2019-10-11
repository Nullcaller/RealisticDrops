package com.arlesten.realdrops.block;

import java.util.Random;

import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockQuartzOre extends Block {
	public static final BlockQuartzOre instance = new BlockQuartzOre();
	public static final String name = "quartz_ore";
	public static final ItemBlock itemBlock = (ItemBlock) (new ItemBlock(instance)).setRegistryName(name);
	
	public BlockQuartzOre() {
		super(Material.ROCK);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(5.0F);
	}


    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
    	int ret = (int) Math.floor((1 + fortune) * random.nextDouble());
    	ret = ret > 0 ? ret : 1;
        return ret;
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.QUARTZ;
    }
}
