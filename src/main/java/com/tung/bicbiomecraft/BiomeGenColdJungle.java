package com.tung.bicbiomecraft;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS;

import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BiomeGenColdJungle extends BiomeGenBase{
	private boolean field_150614_aC;
	public BiomeGenColdJungle(int id){
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
	
	public WorldGenAbstractTree func_150567_a(Random p_150567_1_)
    {
        return (WorldGenAbstractTree)(p_150567_1_.nextInt(10) == 0 ? this.worldGeneratorBigTree : (p_150567_1_.nextInt(2) == 0 ? new WorldGenShrub(3, 0) : (!this.field_150614_aC && p_150567_1_.nextInt(3) == 0 ? new WorldGenMegaJungle(false, 10, 20, 3, 3) : new WorldGenTrees(false, 4 + p_150567_1_.nextInt(7), 3, 3, true))));
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForGrass(Random p_76730_1_)
    {
        return p_76730_1_.nextInt(4) == 0 ? new WorldGenTallGrass(Blocks.tallgrass, 2) : new WorldGenTallGrass(Blocks.tallgrass, 1);
    }

    public void decorate(World world, Random random, int chunk_X, int chunk_Z)
    {super.decorate(world, random, chunk_X, chunk_Z);
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