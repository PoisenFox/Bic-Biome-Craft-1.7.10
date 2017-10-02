package com.tung.bicbiomecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTung extends Block{

	protected BlockTung(Material material) {
		super(material);
		this.setStepSound(soundTypeStone);
	}

}
