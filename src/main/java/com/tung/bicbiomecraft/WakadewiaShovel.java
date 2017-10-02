package com.tung.bicbiomecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class WakadewiaShovel extends ItemSpade{

	public WakadewiaShovel(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		// TODO Auto-generated constructor stub
	}

	 @SideOnly(Side.CLIENT)
	 public boolean hasEffect(ItemStack par1ItemStack)
	 {
	  return true;
	 }
	
}
