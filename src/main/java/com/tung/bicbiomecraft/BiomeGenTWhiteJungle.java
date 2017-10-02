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

public class BiomeGenTWhiteJungle extends BiomeGenBase{

	public BiomeGenTWhiteJungle(int id){
		super(id);
		
		
		this.theBiomeDecorator.treesPerChunk = 2;
		this.theBiomeDecorator.grassPerChunk = 3;
		this.theBiomeDecorator.mushroomsPerChunk = 10;
		this.theBiomeDecorator.reedsPerChunk = 10;
		this.theBiomeDecorator.clayPerChunk = 10;
		this.setEnableSnow();
		this.setHeight(height_LowHills);
		
		this.topBlock = Blocks.grass;
		this.fillerBlock = Blocks.stone;
		
	}
	
	public void decorate(World world, Random random, int chunk_X, int chunk_Z)
    {
        super.decorate(world, random, chunk_X, chunk_Z);
        int k = chunk_X + random.nextInt(16) + 8;
        int l = chunk_Z + random.nextInt(16) + 8;
        int height = world.getHeightValue(k, l) * 2; //This was the original input for the nextInt below.  But it could == 0, which crashes nextInt
        if (height < 1) height = 1;
        int i1 = random.nextInt(height);
        
        WorldGenVines worldgenvines = new WorldGenVines();

        for (l = 0; l < 50; ++l)
        {
            i1 = chunk_X + random.nextInt(16) + 8;
            short short1 = 128;
            int j1 = chunk_Z + random.nextInt(16) + 8;
            worldgenvines.generate(world, random, i1, short1, j1);
        }
        String s = world.getBiomeGenForCoords(chunk_X + 8, chunk_Z + 8).biomeName;
    	if (s.startsWith("BiomeGenTWhiteJungle"))
    	{
            for (int i = 0; i < 250; i++){
                    int Xcoord1 = chunk_X + random.nextInt(16); //where in chuck it generates
                    int Ycoord1 = random.nextInt(100); //how high it generates
                    int Zcoord1 = chunk_Z+ random.nextInt(16); //where in chunk it generates
                   
                    new WorldGenTWhiteTree(Bicbiome.whitelog,Bicbiome.whiteleaf,0,0,false,4,6,true).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
                   
            }
            }
    	
    	if (s.startsWith("BiomeGenTWhiteJungle"))
    	{
            for (int i = 0; i < 2000; i++){
                    int Xcoord1 = chunk_X + random.nextInt(16) + 8; //where in chuck it generates
                    int Ycoord1 = random.nextInt(100); //how high it generates
                    int Zcoord1 = chunk_Z+ random.nextInt(16) + 8; //where in chunk it generates
                   
                    new WorldGenTWhiteHugeTrees(Bicbiome.whitelog,Bicbiome.whiteleaf,0,0,false,15,20,true).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
                   
            }
            }
    	

        WorldGenFlowers purpleflowergen = new WorldGenFlowers(Bicbiome.yamariki);
        WorldGenFlowers blueflowergen = new WorldGenFlowers(Bicbiome.hamuraika);
        WorldGenFlowers sajamilaflowergen = new WorldGenFlowers(Bicbiome.sajamila);
        WorldGenFlowers reyukiflowergen = new WorldGenFlowers(Bicbiome.reyuki);
        
        boolean doGen = TerrainGen.decorate(world, random, chunk_X, chunk_Z, FLOWERS);
        for (int j = 0; doGen && j < 10; ++j)
        {
            int Xcoord1 = chunk_X + random.nextInt(16) + 8;
            int Ycoord1 = chunk_Z + random.nextInt(16) + 8;
            int Zcoord1 = random.nextInt(world.getHeightValue(k, l) + 32);
            //String s = world.func_150572_a(random, k, i1, l);
            //BlockFlower blockflower = BlockFlower.func_149857_e(s);

            //	purpleflowergen.func_150550_a(blockflower, BlockFlower.func_149856_f(s));
            	purpleflowergen.generate(world, random, k, i1, l);
            	
        }
        for (int j = 0; doGen && j < 10; ++j)
        {
            int Xcoord1 = chunk_X + random.nextInt(16) + 8;
            int Ycoord1 = chunk_Z + random.nextInt(16) + 8;
            int Zcoord1 = random.nextInt(world.getHeightValue(k, l) + 32);
            //String s = world.func_150572_a(random, k, i1, l);
            //BlockFlower blockflower = BlockFlower.func_149857_e(s);

            //	purpleflowergen.func_150550_a(blockflower, BlockFlower.func_149856_f(s));
            	purpleflowergen.generate(world, random, k, i1, l);
            	
        }
        for (int j = 0; doGen && j < 10; ++j)
        {
            int Xcoord1 = chunk_X + random.nextInt(16) + 8;
            int Ycoord1 = chunk_Z + random.nextInt(16) + 8;
            int Zcoord1 = random.nextInt(world.getHeightValue(k, l) + 32);
            //String s = world.func_150572_a(random, k, i1, l);
            //BlockFlower blockflower = BlockFlower.func_149857_e(s);

            //	purpleflowergen.func_150550_a(blockflower, BlockFlower.func_149856_f(s));
            	sajamilaflowergen.generate(world, random, k, i1, l);
            
        }
        for (int j = 0; doGen && j < 10; ++j)
        {
            int Xcoord1 = chunk_X + random.nextInt(16) + 8;
            int Ycoord1 = chunk_Z + random.nextInt(16) + 8;
            int Zcoord1 = random.nextInt(world.getHeightValue(k, l) + 32);
            //String s = world.func_150572_a(random, k, i1, l);
            //BlockFlower blockflower = BlockFlower.func_149857_e(s);

            //	purpleflowergen.func_150550_a(blockflower, BlockFlower.func_149856_f(s));
            	reyukiflowergen.generate(world, random, k, i1, l);
            
        }
        
    }
	
}