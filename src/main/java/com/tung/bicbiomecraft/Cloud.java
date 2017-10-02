package com.tung.bicbiomecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Cloud extends Block{

	protected Cloud(Material material) {
		super(material);
		this.setLightOpacity(2);
		this.setStepSound(this.soundTypeCloth);
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

}
