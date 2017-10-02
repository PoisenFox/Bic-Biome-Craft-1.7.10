package com.tung.bicbiomecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CloudRed extends Block{

	protected CloudRed(Material material) {
		super(material);
		this.setStepSound(this.soundTypeCloth);
		
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
}
