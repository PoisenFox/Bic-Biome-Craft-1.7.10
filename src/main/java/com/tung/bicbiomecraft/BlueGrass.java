package com.tung.bicbiomecraft;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlueGrass extends Block{

	public BlueGrass(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setStepSound(soundTypeGrass);
	}

	public IIcon field94393_a;//top of block
	public IIcon field94392_b;//bottom
	 @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister par1registerIcon)
	    {
	        this.blockIcon = par1registerIcon.registerIcon("bicbiome:bluegrass_side");
	        this.field94393_a = par1registerIcon.registerIcon("bicbiome:bluegrass_top");
	        this.field94392_b = par1registerIcon.registerIcon("bicbiome:bluegrass_side_overlay");
	    }
	 
	 @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	    {
	        return p_149691_1_ == 1 ? this.field94393_a : (p_149691_1_ == 0 ? this.field94392_b : this.blockIcon);
	    }
	 @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	    {
	    	
	    	if (par1World.canLightningStrikeAt(par2, par3 + 1, par4) && !World.doesBlockHaveSolidTopSurface(par1World, par2, par3 - 1, par4) && par5Random.nextInt(15) == 1)
	        {
	            double d0 = (double)((float)par2 + par5Random.nextFloat());
	            double d1 = (double)par3 - 0.05D;
	            double d2 = (double)((float)par4 + par5Random.nextFloat());
	            par1World.spawnParticle("dripWater", d0, d1, d2, 0.0D, 0.0D, 0.0D);
	        }
	    	if (par5Random.nextInt(4) == 0) {
	    		 par1World.spawnParticle("enchantmenttable", par2 + par5Random.nextFloat(), par3 + 1.2F, par4 + par5Random.nextFloat(), 0.0D, 0.0D, 0.0D);
	    	    }
	    	  
	    }
}
