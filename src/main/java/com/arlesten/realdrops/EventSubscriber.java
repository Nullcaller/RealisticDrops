package com.arlesten.realdrops;

import com.arlesten.realdrops.block.BlockArditeOre;
import com.arlesten.realdrops.block.BlockCobaltOre;
import com.arlesten.realdrops.block.BlockQuartzOre;
import com.arlesten.realdrops.block.BlockSaltpeterOre;
import com.arlesten.realdrops.block.BlockSilver;
import com.arlesten.realdrops.block.BlockSilverOre;
import com.arlesten.realdrops.block.BlockSulfurSand;
import com.arlesten.realdrops.item.ItemDustSaltpeter;
import com.arlesten.realdrops.item.ItemDustSulfur;
import com.arlesten.realdrops.item.ItemRodBlazeUnfired;
import com.arlesten.realdrops.item.ItemSilverIngot;
import com.arlesten.realdrops.item.ItemSilverNugget;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
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
		OreDictionary.registerOre("dustNitrate", ItemDustSaltpeter.instance);
		
		registry.register(ItemDustSulfur.instance);
		OreDictionary.registerOre("dustSulfur", ItemDustSulfur.instance);

		registry.register(ItemRodBlazeUnfired.instance);
		OreDictionary.registerOre("rodBlazeUnfired", ItemRodBlazeUnfired.instance);
		
		registry.register(ItemSilverIngot.instance);
		OreDictionary.registerOre("ingotSilver", ItemSilverIngot.instance);
		
		registry.register(ItemSilverNugget.instance);
		OreDictionary.registerOre("nuggetSilver", ItemSilverNugget.instance);
		
		registry.register(BlockSaltpeterOre.itemBlock);
		OreDictionary.registerOre("oreSaltpeter", BlockSaltpeterOre.itemBlock);
		
		registry.register(BlockSulfurSand.itemBlock);
		OreDictionary.registerOre("oreSulfur", BlockSulfurSand.itemBlock);
		OreDictionary.registerOre("sandSulfur", BlockSulfurSand.itemBlock);
		
		registry.register(BlockSilverOre.itemBlock);
		OreDictionary.registerOre("oreSilver", BlockSilverOre.itemBlock);
		
		registry.register(BlockSilver.itemBlock);
		OreDictionary.registerOre("blockSilver", BlockSilver.itemBlock);
		
		registry.register(BlockQuartzOre.itemBlock);
		OreDictionary.registerOre("oreQuartz", BlockQuartzOre.itemBlock);
		OreDictionary.registerOre("oreNetherQuartz", BlockQuartzOre.itemBlock);
		
		registry.register(BlockCobaltOre.itemBlock);
		OreDictionary.registerOre("oreCobalt", BlockCobaltOre.itemBlock);

		registry.register(BlockArditeOre.itemBlock);
		OreDictionary.registerOre("oreArdite", BlockArditeOre.itemBlock);
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		
		registry.register(BlockSaltpeterOre.instance);
		
		registry.register(BlockSulfurSand.instance);
		
		registry.register(BlockSilverOre.instance);
		
		registry.register(BlockSilver.instance);
		
		registry.register(BlockQuartzOre.instance);
		
		registry.register(BlockCobaltOre.instance);
		
		registry.register(BlockArditeOre.instance);
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ItemRodBlazeUnfired.instance);
		registerModel(ItemDustSulfur.instance);
		registerModel(ItemDustSaltpeter.instance);
		registerModel(ItemSilverIngot.instance);
		registerModel(ItemSilverNugget.instance);
		
		registerModel(BlockSaltpeterOre.itemBlock);
		registerModel(BlockSulfurSand.itemBlock);
		registerModel(BlockSilverOre.itemBlock);
		registerModel(BlockSilver.itemBlock);
		registerModel(BlockQuartzOre.itemBlock);
		registerModel(BlockCobaltOre.itemBlock);
		registerModel(BlockArditeOre.itemBlock);
	}
	
	protected static void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
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
