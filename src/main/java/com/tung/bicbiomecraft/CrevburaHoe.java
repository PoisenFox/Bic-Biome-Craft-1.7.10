package com.tung.bicbiomecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class CrevburaHoe extends ItemHoe{

	public CrevburaHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		// TODO Auto-generated constructor stub
	}
	
	 @SideOnly(Side.CLIENT)
	 public boolean hasEffect(ItemStack par1ItemStack)
	 {
	  return true;
	 }

}
