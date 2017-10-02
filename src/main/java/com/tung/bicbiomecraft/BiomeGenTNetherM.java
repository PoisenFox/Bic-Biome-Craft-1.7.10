package com.tung.bicbiomecraft;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS;

import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BiomeGenTNetherM extends BiomeGenBase{

	public BiomeGenTNetherM(int id){
		super(id);
		
		
		// this.spawnableMonsterList.clear();
	     //this.spawnableCreatureList.clear();
	     this.spawnableWaterCreatureList.clear();
	   //  this.spawnableCaveCreatureList.clear();
	     this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityPigZombie.class, 100, 4, 4));
	     this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityMagmaCube.class, 1, 4, 4));
	     this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityBlaze.class, 1, 4, 4));
		
		this.topBlock = Blocks.netherrack;
		this.fillerBlock = Blocks.soul_sand;
		
	}
	
	public void decorate(World world, Random random, int chunk_X, int chunk_Z)
    {
        super.decorate(world, random, chunk_X, chunk_Z);
        
        WorldGenFlowers firegen = new WorldGenFlowers(Blocks.fire);
        WorldGenFlowers pendulumcloudgen = new WorldGenFlowers(Bicbiome.cloudred);
        
        boolean doGen = TerrainGen.decorate(world, random, chunk_X, chunk_Z, FLOWERS);
        for (int j = 0; doGen && j < 10; ++j)
        {
            int k = chunk_X + random.nextInt(16) + 8;
            int l = chunk_Z + random.nextInt(16) + 8;
            int i1 = random.nextInt(world.getHeightValue(k, l) + 32);
            //String s = world.func_150572_a(random, k, i1, l);
            //BlockFlower blockflower = BlockFlower.func_149857_e(s);

            //	firegen.func_150550_a(blockflower, BlockFlower.func_149856_f(s));
            	firegen.generate(world, random, k, i1, l);
            
        }
        for (int j = 0; doGen && j < 2; ++j)
        {
            int k = chunk_X + random.nextInt(16) + 8;
            int l = chunk_Z + random.nextInt(16) + 8;
            int i1 = random.nextInt(world.getHeightValue(k, l) + 32);
            //String s = world.func_150572_a(random, k, i1, l);
            //BlockFlower blockflower = BlockFlower.func_149857_e(s);

            //	firegen.func_150550_a(blockflower, BlockFlower.func_149856_f(s));
            pendulumcloudgen.generate(world, random, k, i1, l);
            
        }
        String s = world.getBiomeGenForCoords(chunk_X + 8, chunk_Z + 8).biomeName;
        if (s.startsWith("BiomeGenTNether"))
    	{
            for (int i = 0; i < 50; i++){
                    int Xcoord1 = chunk_X + random.nextInt(16); //where in chuck it generates
                    int Ycoord1 = random.nextInt(100); //how high it generates
                    int Zcoord1 = chunk_Z+ random.nextInt(16); //where in chunk it generates
                   
                    new WorldGenTNetherTree(Bicbiome.netherlog,Bicbiome.netherleaf,0,0,false,4,6,false).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
                   
            }
            }
        
    }
	
}