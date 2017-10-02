package com.tung.bicbiomecraft;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemWakadewiaArmor extends ItemArmor{
	public ItemWakadewiaArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getArmorTexture(ItemStack stack,Entity entity,int slot,String type)
	{
		if (this.armorType == 2)
		{
			return "bicbiome:textures/armor/wakadewia_2.png";
		}
		return "bicbiome:textures/armor/wakadewia_1.png";
	}
}
