package com.tung.bicbiomecraft;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import java.util.Random;

public class MobEventHandler {
	public static Random rand;

	private EntityCreeper EntityCreeper;

	EntityCreeper creeper = (EntityCreeper) ;

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {

		if (event.entityLiving instanceof EntityCreeper) {
/*
			if (!creeper.worldObj.isRemote && miniCreeper && !mini) {
				for (int j = 0; j < 6; j++)

				{
					float f = ((float) (j % 2) - 0.5F) / 4F;
					float f1 = ((float) (j / 2) - 0.5F) / 4F;
					EntityLiving entityliving = (EntityLiving) EntityList.createEntityByName("Creeper", worldObj);
					entityliving.setLocationAndAngles(posX + (double) f,posY + 0.5D, posZ + (double) f1,
							rand.nextFloat() * 360F, 0.0F);
					((EntityCreeper) entityliving).setMini(true);
					entityliving.health = 10;
					creeper.worldObj.spawnEntityInWorld(entityliving);
				}
			}*/
		}
		if (event.entityLiving instanceof EntityCreeper) {
			
			 EntityCreeper creeper = new EntityCreeper(EntityCreeper.worldObj);
			 creeper.worldObj.spawnEntityInWorld(creeper);
		//creeper.worldObj.spawnEntityInWorld(entityliving);
		}
	}

}
