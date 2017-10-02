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

public class BiomeGenTRedJungle extends BiomeGenBase{

	public BiomeGenTRedJungle(int id){
		super(id);
		
		
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		this.setHeight(height_MidPlains);
		
		this.topBlock = Bicbiome.redgrass;
		this.fillerBlock = Blocks.stone;
		
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