package com.tung.bicbiomecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class Tunglog extends BlockLog{
	public Tunglog(Material p_i45394_1_) {
		super();
		this.setStepSound(soundTypeWood);
		this.setHardness(2.0F);
	}
	
	public IIcon field94393_a;//top of block
	public IIcon field94392_b;//bottom
	 @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister par1registerIcon)
	    {
	        this.blockIcon = par1registerIcon.registerIcon("bicbiome:tunglog_side");
	        this.field94393_a = par1registerIcon.registerIcon("bicbiome:tunglog_top");
	        this.field94392_b = par1registerIcon.registerIcon("bicbiome:tunglog_top");
	    }
	 
	 @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	    {
	        return p_149691_1_ == 1 ? this.field94393_a : (p_149691_1_ == 0 ? this.field94392_b : this.blockIcon);
	    }
	 
	 public static int func_150165_c(int p_150165_0_)
	    {
	        return p_150165_0_ & 3;
	    }

	 
	 
	    @SideOnly(Side.CLIENT)
	    protected IIcon getSideIcon(int p_150163_1_)
	    {
	        return this.field_150167_a[p_150163_1_ % this.field_150167_a.length];
	    }

	    @SideOnly(Side.CLIENT)
	    protected IIcon getTopIcon(int p_150161_1_)
	    {
	        return this.field_150166_b[p_150161_1_ % this.field_150166_b.length];
	    }

	    @Override
	    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
	    {
	        return true;
	    }

	    @Override
	    public boolean isWood(IBlockAccess world, int x, int y, int z)
	    {
	        return true;
	    }
}
