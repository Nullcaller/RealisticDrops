package com.arlesten.realdrops.block;

import java.util.Random;

import com.arlesten.realdrops.item.ItemDustSulfur;
import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockSulfurSand extends Block {
	public static final BlockSulfurSand instance = new BlockSulfurSand();
	public static final String name = "sulfur_sand";
	public static final ItemBlock itemBlock = (ItemBlock) (new ItemBlock(instance)).setRegistryName(name);
	
	public BlockSulfurSand() {
		super(Material.SAND);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
		setSoundType(SoundType.SAND);
		setHardness(0.75F);
		setResistance(0.75F);
	}

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
    	int ret = (int) Math.floor((1 + fortune) * random.nextDouble());
    	ret = ret > 0 ? ret : 1;
        return ret;
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemDustSulfur.instance;
    }
}
