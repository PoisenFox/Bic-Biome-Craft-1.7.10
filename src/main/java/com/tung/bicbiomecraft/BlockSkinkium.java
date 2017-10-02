package com.tung.bicbiomecraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class BlockSkinkium extends Block{

	protected BlockSkinkium(Material material) {
		super(material);
		this.setHardness(2.3F);
		this.setStepSound(soundTypeStone);
	}

	 	private Random rand = new Random();
	    @Override // World, meta, fortune
	    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
	    {
	        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
	        {
	            return 1 + rand.nextInt(2);
	        }
	        return 0;
	    }
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune)
	{
		return Bicbiome.skinkiumcrystal;
	}
	
}
