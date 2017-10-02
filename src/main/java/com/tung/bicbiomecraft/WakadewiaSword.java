package com.tung.bicbiomecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class WakadewiaSword extends ItemSword{

	public WakadewiaSword(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
		
	}
	 
	//Damage to entity.
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{ //Adds potion effects on contact with the mob and adds potion effects to player
		 par1ItemStack.damageItem(1, par3EntityLiving);
		 par2EntityLiving.setFire(9);
		 return true;
	}
	/*
	public boolean hitEntity(ItemStack stack, EntityLivingBase living, EntityLivingBase living2)
	{
	stack.damageItem(1, living2);
	living.setFire(10);
	return true;
	}*/
	
	 @SideOnly(Side.CLIENT)
	 public boolean hasEffect(ItemStack par1ItemStack)
	 {
	  return true;
	 }

}
