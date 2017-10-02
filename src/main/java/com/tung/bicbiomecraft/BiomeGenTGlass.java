package com.tung.bicbiomecraft;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS;

import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BiomeGenTGlass extends BiomeGenBase{

	public BiomeGenTGlass(int id){
		super(id);
		
		this.setEnableSnow();
		this.setHeight(height_LowHills);
		
		this.topBlock = Blocks.glass;
		this.fillerBlock = Blocks.ice;
		
	}
	
	public void decorate(World world, Random random, int chunk_X, int chunk_Z)
    {
        super.decorate(world, random, chunk_X, chunk_Z);
        int k = chunk_X + random.nextInt(16) + 8;
        int l = chunk_Z + random.nextInt(16) + 8;
        int height = world.getHeightValue(k, l) * 2; //This was the original input for the nextInt below.  But it could == 0, which crashes nextInt
        if (height < 1) height = 1;
        int i1 = random.nextInt(height);
        
    }
	
}