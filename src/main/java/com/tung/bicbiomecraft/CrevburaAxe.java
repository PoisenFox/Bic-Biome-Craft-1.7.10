package com.tung.bicbiomecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class CrevburaAxe extends ItemAxe{

	protected CrevburaAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		// TODO Auto-generated constructor stub
	}

	 @SideOnly(Side.CLIENT)
	 public boolean hasEffect(ItemStack par1ItemStack)
	 {
	  return true;
	 }
	
}
