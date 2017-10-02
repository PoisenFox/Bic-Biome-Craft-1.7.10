package com.tung.bicbiomecraft;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS;

import java.util.Random;

import net.minecraft.block.Block;
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

public class BiomeGenTungDMountain extends BiomeGenBase{

	public BiomeGenTungDMountain(int id){
		super(id);
		
		
		this.theBiomeDecorator.treesPerChunk = 20;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		this.setHeight(height_MidHills);
		
		this.topBlock = Blocks.sand;
		this.fillerBlock = Blocks.stone;
		
	}
	 public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_)
	    {
	        double d1 = plantNoise.func_151601_a((double)p_150573_5_ * 0.25D, (double)p_150573_6_ * 0.25D);

	        if (d1 > 0.0D)
	        {
	            int k = p_150573_5_ & 15;
	            int l = p_150573_6_ & 15;
	            int i1 = p_150573_3_.length / 256;

	            for (int j1 = 255; j1 >= 0; --j1)
	            {
	                int k1 = (l * 16 + k) * i1 + j1;

	                if (p_150573_3_[k1] == null || p_150573_3_[k1].getMaterial() != Material.air)
	                {
	                    if (j1 == 62 && p_150573_3_[k1] != Blocks.dirt)
	                    {
	                        p_150573_3_[k1] = Blocks.dirt;

	                        if (d1 < 0.12D)
	                        {
	                            p_150573_3_[k1 + 1] = Blocks.dirt;
	                        }
	                    }

	                    break;
	                }
	            }
	        }

	        this.genBiomeTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
	    }

	public void decorate(World world, Random random, int chunk_X, int chunk_Z)
    {
        super.decorate(world, random, chunk_X, chunk_Z);
        
        WorldGenFlowers purpleflowergen = new WorldGenFlowers(Bicbiome.yamariki);
        WorldGenFlowers yellowflowergen = new WorldGenFlowers(Bicbiome.sajamila);
        WorldGenFlowers blueflowergen = new WorldGenFlowers(Bicbiome.hamuraika);
        WorldGenFlowers reyukiflowergen = new WorldGenFlowers(Bicbiome.reyuki);
        
        boolean doGen = TerrainGen.decorate(world, random, chunk_X, chunk_Z, FLOWERS);
        for (int j = 0; doGen && j < 10; ++j)
        {
            int k = chunk_X + random.nextInt(16) + 8;
            int l = chunk_Z + random.nextInt(16) + 8;
            int i1 = random.nextInt(world.getHeightValue(k, l) + 32);
            //String s = world.func_150572_a(random, k, i1, l);
            //BlockFlower blockflower = BlockFlower.func_149857_e(s);

            //	purpleflowergen.func_150550_a(blockflower, BlockFlower.func_149856_f(s));
            	purpleflowergen.generate(world, random, k, i1, l);
            
        }
        for (int j = 0; doGen && j < 10; ++j)
        {
            int k = chunk_X + random.nextInt(16) + 8;
            int l = chunk_Z + random.nextInt(16) + 8;
            int i1 = random.nextInt(world.getHeightValue(k, l) + 32);
            //String s = world.func_150572_a(random, k, i1, l);
            //BlockFlower blockflower = BlockFlower.func_149857_e(s);

            //	purpleflowergen.func_150550_a(blockflower, BlockFlower.func_149856_f(s));
            yellowflowergen.generate(world, random, k, i1, l);
            
        }
        for (int j = 0; doGen && j < 10; ++j)
        {
            int k = chunk_X + random.nextInt(16) + 8;
            int l = chunk_Z + random.nextInt(16) + 8;
            int i1 = random.nextInt(world.getHeightValue(k, l) + 32);
            //String s = world.func_150572_a(random, k, i1, l);
            //BlockFlower blockflower = BlockFlower.func_149857_e(s);

            //	purpleflowergen.func_150550_a(blockflower, BlockFlower.func_149856_f(s));
            blueflowergen.generate(world, random, k, i1, l);
            
        }
        for (int j = 0; doGen && j < 10; ++j)
        {
            int k = chunk_X + random.nextInt(16) + 8;
            int l = chunk_Z + random.nextInt(16) + 8;
            int i1 = random.nextInt(world.getHeightValue(k, l) + 32);
            //String s = world.func_150572_a(random, k, i1, l);
            //BlockFlower blockflower = BlockFlower.func_149857_e(s);

            //	purpleflowergen.func_150550_a(blockflower, BlockFlower.func_149856_f(s));
            reyukiflowergen.generate(world, random, k, i1, l);
            
        }
      
       
        
    }
	
}