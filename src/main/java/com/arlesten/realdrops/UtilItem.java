package com.arlesten.realdrops;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UtilItem {
	public static EntityItem createEntityItem(World world, BlockPos position, ItemStack stack) {
		EntityItem entity = new EntityItem(world, position.getX(), position.getY(), position.getZ(), stack);
		entity.setDefaultPickupDelay();
		return entity;
	}
}
