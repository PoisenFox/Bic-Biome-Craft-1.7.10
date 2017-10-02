package com.tung.bicbiomecraft;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.Height;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void mainRegsitry(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biometung;
	public static BiomeGenBase BiomeGenTWhiteJungle;
	public static BiomeGenBase BiomeGenTNether;
	public static BiomeGenBase BiomeGenTGlass;
	public static BiomeGenBase BiomeGenTYellow;
	public static BiomeGenBase BiomeGenTWhite;
	public static BiomeGenBase BiomeGenColdJungle;
	public static BiomeGenBase BiomeGenTNetherM;
	
	public static BiomeGenBase BiomeGenTungM;
	public static BiomeGenBase BiomeGenTDesert;
	public static BiomeGenBase BiomeGenTBluegrass;
	public static BiomeGenBase BiomeGenTOrangegrass;//not added TODO add to biome layer
	public static BiomeGenBase BiomeGenTJungle;
	public static BiomeGenBase BiomeGenTSland;
	public static BiomeGenBase BiomeGenTPurple;
	public static BiomeGenBase BiomeGenTPurpleJungle;
	public static BiomeGenBase BiomeGenTBlueJungle;
	public static BiomeGenBase BiomeGenTGlassM;
	
	public static BiomeGenBase BiomeGenTMeadow;
	public static BiomeGenBase BiomeGenTRedJungle;
	public static BiomeGenBase BiomeGenTAllTrees;
	public static BiomeGenBase BiomeGenTNetherJungle;
	public static BiomeGenBase BiomeGenTHills;
	public static BiomeGenBase BiomeGenTRedForest;
	public static BiomeGenBase BiomeGenSBigJungle;
	public static BiomeGenBase BiomeGenTungGSwamp;
	public static BiomeGenBase BiomeGenTungDMountain;
	public static BiomeGenBase BiomeGenSWinter;
	public static BiomeGenBase BiomeGenTungWland;
	public static BiomeGenBase BiomeGenWhitePillar;
	public static BiomeGenBase BiomeGenTungPillar;
	public static BiomeGenBase BiomeGenGlassPillar;
	public static BiomeGenBase BiomeGenGlassTriangle;
	public static BiomeGenBase BiomeGenNetherPillar;
	public static BiomeGenBase BiomeGenPurplePillar;
	
	public static void initializeBiome(){
		
		biometung = new BiomeGenTung(148).setBiomeName("tung").setTemperatureRainfall(1.2F, 0.9F);
		BiomeGenTYellow = new BiomeGenTYellow(141).setBiomeName("BiomeGenTYellow").setTemperatureRainfall(1.2F, 0.9F);
		BiomeGenTWhite = new BiomeGenTWhite(142).setBiomeName("BiomeGenTWhite").setTemperatureRainfall(-0.5F, 0.4F);
		BiomeGenTWhiteJungle = new BiomeGenTWhiteJungle(149).setBiomeName("BiomeGenTWhiteJungle").setTemperatureRainfall(-0.5F, 0.4F);
		BiomeGenTGlass = new BiomeGenTGlass(146).setBiomeName("BiomeGenTGlass").setTemperatureRainfall(-0.5F, 0.4F);
		BiomeGenTNether = new BiomeGenTNether(147).setBiomeName("BiomeGenTNether").setDisableRain().setTemperatureRainfall(2.0F, 0.0F);
		BiomeGenTNetherM = new BiomeGenTNetherM(150).setBiomeName("BiomeGenTNetherM").setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setHeight(new Height (0.7F,1.2F));
		BiomeGenColdJungle = new BiomeGenColdJungle(143).setBiomeName("BiomeGenColdJungle").setTemperatureRainfall(-0.5F, 0.4F);
		
		BiomeGenTungM = new BiomeGenTungM(151).setBiomeName("BiomeGenTungM").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTDesert = new BiomeGenTDesert(152).setBiomeName("BiomeGenTDesert").setColor(16421912).setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setHeight(new Height (0.7F,1.2F));
		BiomeGenTBluegrass = new BiomeGenTBluegrass(153).setBiomeName("BiomeGenTBluegrass").setTemperatureRainfall(1.2F, 0.9F);
		BiomeGenTOrangegrass = new BiomeGenTOrangegrass(154).setBiomeName("BiomeGenTOrangegrass").setTemperatureRainfall(1.2F, 0.9F);
		BiomeGenTJungle = new BiomeGenTJungle(155).setBiomeName("BiomeGenTJungle").setTemperatureRainfall(1.2F, 0.9F);
		BiomeGenTSland = new BiomeGenTSland(156).setBiomeName("BiomeGenTSland").setDisableRain().setTemperatureRainfall(2.0F, 0.0F);
		BiomeGenTPurple = new BiomeGenTPurple(157).setBiomeName("BiomeGenTPurple").setTemperatureRainfall(2.0F, 0.0F);
		BiomeGenTBlueJungle = new BiomeGenTBlueJungle(158).setBiomeName("BiomeGenTBlueJungle").setTemperatureRainfall(1.2F, 0.9F);
		BiomeGenTGlassM = new BiomeGenTGlassM(159).setBiomeName("BiomeGenTGlassM").setTemperatureRainfall(-0.5F, 0.4F).setHeight(new Height (0.7F,1.2F));
		//new
		
		BiomeGenTMeadow = new BiomeGenTMeadow(160).setBiomeName("BiomeGenTMeadow").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTRedJungle = new BiomeGenTRedJungle(161).setBiomeName("BiomeGenTRedJungle").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTAllTrees = new BiomeGenTAllTrees(162).setBiomeName("BiomeGenTAllTrees").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTNetherJungle = new BiomeGenTNetherJungle(163).setBiomeName("BiomeGenTNetherJungle").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTHills = new BiomeGenTHills(164).setBiomeName("BiomeGenTHills").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTRedForest = new BiomeGenTRedForest(165).setBiomeName("BiomeGenTRedForest").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		
		
		//TODO remove .height 
		//TODO add flowers to all
				//double biomes curreently there are 25
	//witchs and magma slimes spawn in all biomes?
		
		//new height remeber to register
		BiomeGenSBigJungle = new BiomeGenSBigJungle(166).setBiomeName("BiomeGenSBigJungle").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTungGSwamp = new BiomeGenTungGSwamp(167).setBiomeName("BiomeGenTungGSwamp").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTungDMountain = new BiomeGenTungDMountain(168).setBiomeName("BiomeGenTungDMountain").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenSWinter = new BiomeGenSWinter(169).setBiomeName("BiomeGenSWinter").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTungWland = new BiomeGenTungWland(170).setBiomeName("BiomeGenTungWland").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
/*
		BiomeGenWhitePillar = new BiomeGenWhitePillar(171).setBiomeName("BiomeGenWhitePillar").setTemperatureRainfall(-0.5F, 0.4F);
		BiomeGenTungPillar = new BiomeGenTungPillar(172).setBiomeName("BiomeGenTungPillar").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenGlassPillar = new BiomeGenGlassPillar(173).setBiomeName("BiomeGenGlassPillar").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenGlassTriangle = new BiomeGenGlassTriangle(174).setBiomeName("BiomeGenGlassTriangle").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenNetherPillar = new BiomeGenNetherPillar(175).setBiomeName("BiomeGenNetherPillar").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenPurplePillar = new BiomeGenPurplePillar(176).setBiomeName("BiomeGenPurplePillar").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		
		BiomeGenRedGrass = new BiomeGenRedGrass(171).setBiomeName("BiomeGenRedGrass").setTemperatureRainfall(-0.5F, 0.4F);
		BiomeGenRedTriangle = new BiomeGenRedTriangle(171).setBiomeName("BiomeGenRedTriangle").setTemperatureRainfall(-0.5F, 0.4F);
		BiomeGenRedPillar = new BiomeGenRedPillar(171).setBiomeName("BiomeGenRedPillar").setTemperatureRainfall(-0.5F, 0.4F);
		BiomeGenOrangeJungle = new BiomeGenOrangeJungle(171).setBiomeName("BiomeGenOrangeJungle").setTemperatureRainfall(-0.5F, 0.4F);
		BiomeGenYellowPillar = new BiomeGenYellowPillar(172).setBiomeName("BiomeGenYellowPillar").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenYellowTriangle = new BiomeGenYellowTriangle(172).setBiomeName("BiomeGenYellowTriangle").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenYellowJungle= new BiomeGenYellowJungle(172).setBiomeName("BiomeGenYellowJungle").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTungTriangle= new BiomeGenTungTriangle(172).setBiomeName("BiomeGenTungTriangle").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTGlassJungle= new BiomeGenTGlassJungle(172).setBiomeName("BiomeGenTGlassJungle").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenSSnowBigJungle= new BiomeGenSSnowBigJungle(172).setBiomeName("BiomeGenSSnowBigJungle").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTPurpleJungle= new BiomeGenTPurpleJungle(172).setBiomeName("BiomeGenTPurpleJungle").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTFHills= new BiomeGenTungFHills(172).setBiomeName("BiomeGenTungFHills").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTungRainforest= new BiomeGenTungRainforest(172).setBiomeName("BiomeGenTungRainforest").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTungFIsland= new BiomeGenTungFIsland(172).setBiomeName("BiomeGenTungFIsland").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		BiomeGenTungDeath= new BiomeGenTungDeath(172).setBiomeName("BiomeGenTungDeath").setTemperatureRainfall(1.2F, 0.9F).setHeight(new Height (0.7F,1.5F));
		//2 more
		*/
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biometung, Type.FOREST);
		BiomeManager.addSpawnBiome(biometung);
		BiomeManager.addVillageBiome(biometung, true);

		BiomeDictionary.registerBiomeType(BiomeGenTWhiteJungle, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTWhiteJungle);
		BiomeManager.addVillageBiome(BiomeGenTWhiteJungle, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTNether, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTNether);
		
		BiomeDictionary.registerBiomeType(BiomeGenTGlass, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTGlass);
		BiomeManager.addVillageBiome(BiomeGenTGlass, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTWhite, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTWhite);
		BiomeManager.addVillageBiome(BiomeGenTWhite, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTYellow, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTYellow);
		BiomeManager.addVillageBiome(BiomeGenTYellow, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenColdJungle, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenColdJungle);
		BiomeManager.addVillageBiome(BiomeGenColdJungle, true);
		
		//new
	
		BiomeDictionary.registerBiomeType(BiomeGenTungM, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTungM);
		BiomeManager.addVillageBiome(BiomeGenTungM, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTDesert, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTDesert);
		BiomeManager.addVillageBiome(BiomeGenTDesert, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTBluegrass, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTBluegrass);
		BiomeManager.addVillageBiome(BiomeGenTBluegrass, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTJungle, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTJungle);
		BiomeManager.addVillageBiome(BiomeGenTJungle, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTSland, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTSland);
		BiomeManager.addVillageBiome(BiomeGenTSland, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTPurple, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTPurple);
		BiomeManager.addVillageBiome(BiomeGenTPurple, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTBlueJungle, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTBlueJungle);
		BiomeManager.addVillageBiome(BiomeGenTBlueJungle, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTGlassM, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTGlassM);
		BiomeManager.addVillageBiome(BiomeGenTGlassM, true);
	
		BiomeDictionary.registerBiomeType(BiomeGenTMeadow, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTMeadow);
		BiomeManager.addVillageBiome(BiomeGenTMeadow, true);

		BiomeDictionary.registerBiomeType(BiomeGenTRedJungle, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTRedJungle);
		BiomeManager.addVillageBiome(BiomeGenTRedJungle, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTAllTrees, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTAllTrees);
		BiomeManager.addVillageBiome(BiomeGenTAllTrees, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTNetherJungle, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTNetherJungle);
		BiomeManager.addVillageBiome(BiomeGenTNetherJungle, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTHills, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTHills);
		BiomeManager.addVillageBiome(BiomeGenTHills, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTRedForest, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTRedForest);
		BiomeManager.addVillageBiome(BiomeGenTRedForest, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTNetherM, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTNetherM);
		BiomeManager.addVillageBiome(BiomeGenTNetherM, true);
		
		BiomeDictionary.registerBiomeType(BiomeGenTOrangegrass, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenTOrangegrass);
		BiomeManager.addVillageBiome(BiomeGenTOrangegrass, true);
	}

}