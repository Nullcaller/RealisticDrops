package com.arlesten.realdrops.block;

import java.util.Random;

import com.arlesten.realdrops.item.ItemDustSaltpeter;
import com.arlesten.realdrops.tab.TabRealDrops;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockSaltpeterOre extends Block {
	public static final BlockSaltpeterOre instance = new BlockSaltpeterOre();
	public static final String name = "saltpeter_ore";
	public static final ItemBlock itemBlock = (ItemBlock) (new ItemBlock(instance)).setRegistryName(name);
	
	public BlockSaltpeterOre() {
		super(Material.ROCK);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(TabRealDrops.instance);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(1.5F);
	}


    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
    	int ret = (int) Math.floor((1 + fortune) * random.nextDouble());
    	ret = ret > 0 ? ret : 1;
        return ret;
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemDustSaltpeter.instance;
    }
}
