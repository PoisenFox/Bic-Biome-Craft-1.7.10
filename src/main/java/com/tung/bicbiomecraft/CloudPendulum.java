package com.tung.bicbiomecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CloudPendulum extends Block{

	protected CloudPendulum(Material material) {
		super(material);
		this.setStepSound(this.soundTypeCloth);
		
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity){
		entity.motionY += 1.0F;

	}
}
