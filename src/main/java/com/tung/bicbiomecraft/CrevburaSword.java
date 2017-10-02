package com.tung.bicbiomecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CrevburaSword extends ItemSword{

	public CrevburaSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}

	 @SideOnly(Side.CLIENT)
	 public boolean hasEffect(ItemStack par1ItemStack)
	 {
	  return true;
	 }
	 
	//Damage to entity.
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
		{
			par1ItemStack.damageItem(1, par3EntityLivingBase);
			par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.wither.id, 200, 0));
			return true;
		}
	
}
