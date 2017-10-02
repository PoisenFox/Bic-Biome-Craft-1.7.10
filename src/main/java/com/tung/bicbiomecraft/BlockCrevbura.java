package com.tung.bicbiomecraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCrevbura extends Block{

	protected BlockCrevbura(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune)
	{
		return Bicbiome.crevburacrystal;
	}
	
	 private Random rand = new Random();
	    @Override // World, meta, fortune
	    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
	    {
	        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
	        {
	            return 1 + rand.nextInt(5);
	        }
	        return 0;
	    }
    
    
    


}
