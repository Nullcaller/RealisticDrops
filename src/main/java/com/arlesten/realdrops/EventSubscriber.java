package com.arlesten.realdrops;

import com.arlesten.realdrops.item.ItemDustSaltpeter;
import com.arlesten.realdrops.item.ItemDustSulfur;
import com.arlesten.realdrops.item.ItemRodBlazeUnfired;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = RealDrops.ID)
public class EventSubscriber {
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		
		Items.POTIONITEM.setContainerItem(Items.GLASS_BOTTLE);
		OreDictionary.registerOre("listAllmeatraw", Items.PORKCHOP);
		OreDictionary.registerOre("listAllmeatraw", Items.BEEF);
		OreDictionary.registerOre("listAllmeatraw", Items.MUTTON);
		OreDictionary.registerOre("listAllmeatraw", Items.RABBIT);
		OreDictionary.registerOre("listAllmeatraw", Items.CHICKEN);
		
		registry.register(ItemDustSaltpeter.instance);
		OreDictionary.registerOre("dustSaltpeter", ItemDustSaltpeter.instance);
		
		registry.register(ItemDustSulfur.instance);
		OreDictionary.registerOre("dustSulfur", ItemDustSulfur.instance);

		registry.register(ItemRodBlazeUnfired.instance);
		OreDictionary.registerOre("rodBlazeUnfired", ItemRodBlazeUnfired.instance);
	}
	
    @SubscribeEvent
    public static void livingDropsEvent(LivingDropsEvent event) {
    	if(event.getEntity() instanceof EntityLivingBase) {
    		EntityLivingBase entity = (EntityLivingBase) event.getEntity();
    		
    		int boneAmount = (int) Math.floor((entity.getMaxHealth() / 5) * (1 + event.getLootingLevel()));
    		boneAmount = boneAmount > 0 ? boneAmount : 1;
    		EntityItem bonesEntity = UtilItem.createEntityItem(entity.world, entity.getPosition(), new ItemStack(Items.BONE, boneAmount));
    		event.getDrops().add(bonesEntity);
    		
    		if(Math.random() < (entity.getMaxHealth() * 4 / 100) + ((1 + event.getLootingLevel()) * 5 / 100)) {
    			EntityItem skullEntity = UtilItem.createEntityItem(entity.world, entity.getPosition(), new ItemStack(Items.SKULL, 1));
    			event.getDrops().add(skullEntity);
    		}
    	}
    }
}
