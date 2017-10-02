package com.tung.bicbiomecraft;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class CloudHuge extends Block{

	protected CloudHuge(Material material) {
		super(material);
		this.setLightOpacity(2);
		this.setStepSound(this.soundTypeCloth);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 5.0F, 1.0F, 5.0F);
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity) {
	    // change the parameters below to what you want
	    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}

}
