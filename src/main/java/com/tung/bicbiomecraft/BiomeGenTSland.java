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

public class BiomeGenTSland extends BiomeGenBase {

	public BiomeGenTSland(int id) {
		super(id);

		// this.spawnableMonsterList.clear();
		// this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		// this.spawnableCaveCreatureList.clear();
		this.theBiomeDecorator.treesPerChunk = -999;
		this.theBiomeDecorator.grassPerChunk = -999;
		this.theBiomeDecorator.reedsPerChunk = 50;
		this.theBiomeDecorator.cactiPerChunk = 10;
		this.topBlock = Blocks.sand;
		this.fillerBlock = Blocks.sandstone;

	}

	public void decorate(World world, Random random, int chunk_X, int chunk_Z) {
		super.decorate(world, random, chunk_X, chunk_Z);

	}

}