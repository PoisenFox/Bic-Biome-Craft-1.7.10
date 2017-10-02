package com.tung.bicbiomecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="bicbiome", name="BicBiomeCraft", version="1.0")

public class Bicbiome
{
	//ingots
	public static Item skinkiumcrystal;
	public static Item tungingot;
	public static Item wakadewiaingot;
	public static Item bicboiniumingot;
	public static Item whlopmoreingot;
	public static Item crevburacrystal;
	public static Item penoiumingot;
	public static Item harmuraingot;
	
	//staff
	public static Item bongikastaff;
	public static Item omegabongikastaff;
	public static Item warsongbongikastaff;
	public static Item firerarstaff;
	public static Item warsongfirerarstaff;
	public static Item glassiumstaff;
	public static Item teleporiumstaff;
	public static Item warsongteleporiumstaff;
	public static Item legendarywarsongteleporiumstaff;
	public static Item forbiddenstaff;
	public static Item warsongforbiddenstaff;
	public static Item legendarywarsongforbiddenstaff;
	
	//tools
	public static Item skinkiumsword;
	public static Item skinkiumpick;
	public static Item skinkiumshovel;
	public static Item skinkiumaxe;
	public static Item skinkiumhoe;
	
	public static Item tungsword;
	public static Item tungpick;
	public static Item tungshovel;
	public static Item tungaxe;
	public static Item tunghoe;
	
	public static Item wakadewiasword;
	public static Item wakadewiapick;
	public static Item wakadewiashovel;
	public static Item wakadewiaaxe;
	public static Item wakadewiahoe;
	
	public static Item bicboiniumsword;
	public static Item bicboiniumpick;
	public static Item bicboiniumshovel;
	public static Item bicboiniumaxe;
	public static Item bicboiniumhoe;
	
	public static Item whlopmoresword;
	public static Item whlopmorepick;
	public static Item whlopmoreshovel;
	public static Item whlopmoreaxe;
	public static Item whlopmorehoe;
	
	public static Item crevburasword;
	public static Item crevburapick;
	public static Item crevburashovel;
	public static Item crevburaaxe;
	public static Item crevburahoe;
	
	public static Item penoiumsword;
	public static Item penoiumpick;
	public static Item penoiumshovel;
	public static Item penoiumaxe;
	public static Item penoiumhoe;
	
	public static Item harmurasword;
	public static Item harmurapick;
	public static Item harmurashovel;
	public static Item harmuraaxe;
	public static Item harmurahoe;
	
	//armor
	public static Item skinkiumhelmet;
	public static Item skinkiumchest;
	public static Item skinkiumlegs;
	public static Item skinkiumboots;
	
	public static Item tunghelmet;
	public static Item tungchest;
	public static Item tunglegs;
	public static Item tungboots;

	public static Item wakadewiahelmet;
	public static Item wakadewiachest;
	public static Item wakadewialegs;
	public static Item wakadewiaboots;
	
	public static Item bicboiniumhelmet;
	public static Item bicboiniumchest;
	public static Item bicboiniumlegs;
	public static Item bicboiniumboots;

	public static Item whlopmorehelmet;
	public static Item whlopmorechest;
	public static Item whlopmorelegs;
	public static Item whlopmoreboots;
	
	public static Item crevburahelmet;
	public static Item crevburachest;
	public static Item crevburalegs;
	public static Item crevburaboots;
	
	public static Item penoiumhelmet;
	public static Item penoiumchest;
	public static Item penoiumlegs;
	public static Item penoiumboots;
	
	public static Item harmurahelmet;
	public static Item harmurachest;
	public static Item harmuralegs;
	public static Item harmuraboots;
	
	public static Item bicbiomeblue;


	//TODO 
	public static final Item.ToolMaterial skinkiumToolMaterial = EnumHelper.addToolMaterial("skinkiumToolMaterial", 3, 500, 7.0F, 2.0F, 5);
	public static final Item.ToolMaterial tungToolMaterial = EnumHelper.addToolMaterial("tungToolMaterial", 20, 5000, 20.0F, 5.0F, 5);
	public static final Item.ToolMaterial wakadewiaToolMaterial = EnumHelper.addToolMaterial("wakadewiaToolMaterial", 2, 500, 12.0F, 4.0F, 7);
	public static final Item.ToolMaterial bicboiniumToolMaterial = EnumHelper.addToolMaterial("bicboiniumToolMaterial", 2, 300, 10.0F, 3.0F, 5);
	public static final Item.ToolMaterial whlopmoreToolMaterial = EnumHelper.addToolMaterial("whlopmoreToolMaterial", 2, 3000, 19.0F, 4.5F, 5);
	public static final Item.ToolMaterial crevburaToolMaterial = EnumHelper.addToolMaterial("crevburaToolMaterial", 2, 2500, 18.0F, 4.5F, 5);
	public static final Item.ToolMaterial penoiumToolMaterial = EnumHelper.addToolMaterial("penoiumToolMaterial", 2, 2500, 15.0F, 4.0F, 5);
	public static final Item.ToolMaterial harmuraToolMaterial = EnumHelper.addToolMaterial("harmuraToolMaterial", 2, 232, 5.0F, 2.0F, 5);
	//armor
	public static final ItemArmor.ArmorMaterial skinkiumArmorMaterial = EnumHelper.addArmorMaterial("skinkiumArmorMaterial", 300, new int[]{3,5,4,2}, 5);
	//Make less op and make another type of tung or make harder to craft
	//public static final ItemArmor.ArmorMaterial tungArmorMaterial = EnumHelper.addArmorMaterial("tungArmorMaterial", 1000,new int[]{4,10,8,4}, 7);//26
	public static final ItemArmor.ArmorMaterial tungArmorMaterial = EnumHelper.addArmorMaterial("tungArmorMaterial", 1000,new int[]{4,7,5,4}, 7);
	public static final ItemArmor.ArmorMaterial wakadewiaArmorMaterial = EnumHelper.addArmorMaterial("wakadewiaArmorMaterial", 800, new int[]{6,10,4,4}, 4);//24
	public static final ItemArmor.ArmorMaterial bicboiniumArmorMaterial = EnumHelper.addArmorMaterial("bicboiniumArmorMaterial", 400, new int[]{3,7,6,2}, 5);
	public static final ItemArmor.ArmorMaterial whlopmoreArmorMaterial = EnumHelper.addArmorMaterial("whlopmoreArmorMaterial", 700, new int[]{4,9,9,4}, 8);
	public static final ItemArmor.ArmorMaterial crevburaArmorMaterial = EnumHelper.addArmorMaterial("crevburaArmorMaterial", 750, new int[]{4,9,8,4}, 6);
	public static final ItemArmor.ArmorMaterial penoiumArmorMaterial = EnumHelper.addArmorMaterial("penoiumArmorMaterial", 700, new int[]{6,9,7,4}, 6);
	public static final ItemArmor.ArmorMaterial harmuraArmorMaterial = EnumHelper.addArmorMaterial("harmuraArmorMaterial", 200, new int[]{2,3,3,2}, 9);
	
	
	public static Item tungchops;
	public static Item cookedtungchops;
	
	//blocks
	public static Block  blockskinkium;
	public static Block  blocktung;
	public static Block  blockwakadewia;
	public static Block  blockbicboinium;
	public static Block  blockwhlopmore;
	public static Block  blockpenoium;
	public static Block  blockharmura;
	public static Block  blockcrevbura;
	
	public static Block cloud;
	public static Block cloudred;
	public static Block cloudpendulum;
	
	public static Block cloudhuge;
	public static Block cloudredhuge;
	//tree stuff
	public static Block yellowlog;
	public static Block whitelog;
	public static Block purplelog;
	public static Block tunglog;
	public static Block netherlog;
	public static Block glasslog;
	
	public static Block yellowleaf;
	public static Block whiteleaf;
	public static Block purpleleaf;
	public static Block tungleaf;
	public static Block netherleaf;
	public static Block glassleaf;
	
	public static Block purplegrass;
	public static Block bluegrass;
	public static Block yellowgrass;
	public static Block orangegrass;
	public static Block redgrass;
	public static Block greengrass;
	public static Block peniumgrass;
	
	public static Block hugeyellowsapling;
	
	//TODO Biomes
		//public static BiomeGenBase biomeGenTYellow;
		TreeManager treemanager = new TreeManager();
	
	//Flowers
	public static Block yamariki;
	public static Block hamuraika;
	public static Block sajamila;
	public static Block reyuki;
	
	@EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
		//Item/Block init and registering
		//config
		bicbiomeblue = new BicBiomeBlue().setUnlocalizedName("bicbiomeblue").setTextureName("bicbiome:bicbiomeblue").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bicbiomeblue, bicbiomeblue.getUnlocalizedName().substring(5));
	
		skinkiumcrystal = new SkinkiumCrystal().setUnlocalizedName("skinkiumcrystal").setTextureName("bicbiome:skinkiumcrystal").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(skinkiumcrystal, skinkiumcrystal.getUnlocalizedName().substring(5));
		
		tungingot = new TungIngot().setUnlocalizedName("tungingot").setTextureName("bicbiome:tungingot").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(tungingot, tungingot.getUnlocalizedName().substring(5));
		
		wakadewiaingot = new WakadewiaIngot().setUnlocalizedName("wakadewiaingot").setTextureName("bicbiome:wakadewiaingot").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(wakadewiaingot, wakadewiaingot.getUnlocalizedName().substring(5));

		bicboiniumingot = new BicboiniumIngot().setUnlocalizedName("bicboiniumingot").setTextureName("bicbiome:bicboiniumingot").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bicboiniumingot, bicboiniumingot.getUnlocalizedName().substring(5));

		whlopmoreingot = new WhlopmoreIngot().setUnlocalizedName("whlopmoreingot").setTextureName("bicbiome:whlopmoreingot").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(whlopmoreingot, whlopmoreingot.getUnlocalizedName().substring(5));

		crevburacrystal = new CrevburaCrystal().setUnlocalizedName("crevburacrystal").setTextureName("bicbiome:crevburacrystal").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(crevburacrystal, crevburacrystal.getUnlocalizedName().substring(5));

		penoiumingot = new PenoiumIngot().setUnlocalizedName("penoiumingot").setTextureName("bicbiome:penoiumingot").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(penoiumingot, penoiumingot.getUnlocalizedName().substring(5));

		harmuraingot = new HarmuraIngot().setUnlocalizedName("harmuraingot").setTextureName("bicbiome:harmuraingot").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(harmuraingot, harmuraingot.getUnlocalizedName().substring(5));

		//TODO food
		tungchops = new ItemFood(8,0.4F,true).setUnlocalizedName("tungchops").setTextureName("bicbiome:tungchops").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(tungchops, tungchops.getUnlocalizedName().substring(5));
		
		cookedtungchops = new ItemFood(12,0.8F,true).setUnlocalizedName("cookedtungchops").setTextureName("bicbiome:cookedtungchops").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(cookedtungchops, cookedtungchops.getUnlocalizedName().substring(5));
		
		blockskinkium = new BlockSkinkium(Material.rock).setBlockName("blockskinkium").setBlockTextureName("bicbiome:blockskinkium").setResistance(5.0F).setHardness(2.3F).setCreativeTab(tabbicbiome).setLightLevel(1.0F);
		GameRegistry.registerBlock(blockskinkium, blockskinkium.getUnlocalizedName().substring(5));
		
		blocktung = new BlockTung(Material.rock).setBlockName("blocktung").setBlockTextureName("bicbiome:blocktung").setResistance(5.0F).setHardness(1.3F).setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(blocktung, blocktung.getUnlocalizedName().substring(5));
		
		blockwakadewia = new BlockWakadewia(Material.rock).setBlockName("blockwakadewia").setBlockTextureName("bicbiome:blockwakadewia").setResistance(5.0F).setHardness(60.0F).setLightLevel(1.0F).setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(blockwakadewia, blockwakadewia.getUnlocalizedName().substring(5));
		
		blockbicboinium = new BlockBicboinium(Material.rock).setBlockName("blockbicboinium").setBlockTextureName("bicbiome:blockbicboinium").setResistance(5.0F).setHardness(20.0F).setCreativeTab(tabbicbiome).setLightLevel(1.0F);
		GameRegistry.registerBlock(blockbicboinium, blockbicboinium.getUnlocalizedName().substring(5));
		
		blockwhlopmore = new BlockWhlopmore(Material.rock).setBlockName("blockwhlopmore").setBlockTextureName("bicbiome:blockwhlopmore").setResistance(5.0F).setHardness(60.0F).setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(blockwhlopmore, blockwhlopmore.getUnlocalizedName().substring(5));
		
		blockpenoium = new BlockPenoium(Material.rock).setBlockName("blockpenoium").setBlockTextureName("bicbiome:blockpenoium").setResistance(5.0F).setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(blockpenoium, blockpenoium.getUnlocalizedName().substring(5));
		
		blockharmura = new BlockHarmura(Material.rock).setBlockName("blockharmura").setBlockTextureName("bicbiome:blockharmura").setResistance(5.0F).setHardness(1.3F).setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(blockharmura, blockharmura.getUnlocalizedName().substring(5));
		
		blockcrevbura = new BlockCrevbura(Material.rock).setBlockName("blockcrevbura").setBlockTextureName("bicbiome:blockcrevbura").setResistance(5.0F).setHardness(50.0F).setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(blockcrevbura, blockcrevbura.getUnlocalizedName().substring(5));
		
		//clouds
		cloud = new Cloud(Material.cloth).setBlockName("cloud").setBlockTextureName("bicbiome:cloud").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(cloud, cloud.getUnlocalizedName().substring(5));

		cloudred = new CloudRed(Material.cloth).setBlockName("cloudred").setBlockTextureName("bicbiome:cloudred").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(cloudred, cloudred.getUnlocalizedName().substring(5));
		
		cloudpendulum = new CloudPendulum(Material.cloth).setBlockName("cloudpendulum").setBlockTextureName("bicbiome:cloudpendulum").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(cloudpendulum, cloudpendulum.getUnlocalizedName().substring(5));
		
		cloudhuge = new CloudHuge(Material.cloth).setBlockName("cloudhuge").setBlockTextureName("bicbiome:cloud").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(cloudhuge, cloudhuge.getUnlocalizedName().substring(5));

		cloudredhuge = new CloudRedHuge(Material.cloth).setBlockName("cloudredhuge").setBlockTextureName("bicbiome:cloudred").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(cloudredhuge, cloudredhuge.getUnlocalizedName().substring(5));
		
		/*	public static Block yellowleaf;
	public static Block whiteleaf;
	public static Block purpleleaf;
	public static Block tungleaf;
	public static Block netherleaf;
	public static Block glassleaf;*/
		
		yellowleaf = new YellowLeaf(Material.leaves).setBlockName("yellowleaf").setBlockTextureName("bicbiome:yellowleaf").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(yellowleaf, yellowleaf.getUnlocalizedName().substring(5));
		//TODO change texture
		whiteleaf = new WhiteLeaf(Material.leaves).setBlockName("whiteleaf").setBlockTextureName("bicbiome:leafwhite").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(whiteleaf, whiteleaf.getUnlocalizedName().substring(5));

		purpleleaf = new PurpleLeaf(Material.leaves).setBlockName("purpleleaf").setBlockTextureName("bicbiome:purpleleaf").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(purpleleaf, purpleleaf.getUnlocalizedName().substring(5));
		
		tungleaf = new TungLeaf(Material.leaves).setBlockName("tungleaf").setBlockTextureName("bicbiome:tungleaf").setCreativeTab(tabbicbiome).setLightLevel(1.0F);
		GameRegistry.registerBlock(tungleaf, tungleaf.getUnlocalizedName().substring(5));
		
		netherleaf = new NetherLeaf(Material.leaves).setBlockName("netherleaf").setBlockTextureName("bicbiome:netherleaf").setCreativeTab(tabbicbiome).setLightLevel(1.0F);
		GameRegistry.registerBlock(netherleaf, netherleaf.getUnlocalizedName().substring(5));
		
		glassleaf = new GlassLeaf(Material.leaves.glass).setBlockName("glassleaf").setBlockTextureName("bicbiome:glassleaf").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(glassleaf, glassleaf.getUnlocalizedName().substring(5));
		
		yellowlog = new Yellowlog(Material.wood).setBlockName("yellowlog").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(yellowlog, yellowlog.getUnlocalizedName().substring(5));
		
		whitelog = new Whitelog(Material.wood).setBlockName("whitelog").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(whitelog, whitelog.getUnlocalizedName().substring(5));
		
		tunglog = new Tunglog(Material.wood).setBlockName("tunglog").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(tunglog, tunglog.getUnlocalizedName().substring(5));
		
		netherlog = new Netherlog(Material.wood).setBlockName("netherlog").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(netherlog, netherlog.getUnlocalizedName().substring(5));
		
		glasslog = new Glasslog(Material.glass).setBlockName("glasslog").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(glasslog, glasslog.getUnlocalizedName().substring(5));
		//
		yellowgrass = new YellowGrass(Material.leaves).setBlockName("yellowgrass").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(yellowgrass, yellowgrass.getUnlocalizedName().substring(5));
		
		bluegrass = new BlueGrass(Material.leaves).setBlockName("bluegrass").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(bluegrass, bluegrass.getUnlocalizedName().substring(5));
		
		orangegrass = new OrangeGrass(Material.leaves).setBlockName("orangegrass").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(orangegrass, orangegrass.getUnlocalizedName().substring(5));
		
		purplegrass = new PurpleGrass(Material.leaves).setBlockName("purplegrass").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(purplegrass, purplegrass.getUnlocalizedName().substring(5));

		redgrass = new RedGrass(Material.leaves).setBlockName("redgrass").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(redgrass, redgrass.getUnlocalizedName().substring(5));
		
		hugeyellowsapling = new HugeYellowSapling().setBlockName("hugeyellowsapling").setCreativeTab(tabbicbiome);
		GameRegistry.registerBlock(hugeyellowsapling, hugeyellowsapling.getUnlocalizedName().substring(5));

		//biome settings
		//BiomeGenTYellowJungle = new BiomeGenTYellowJungle(257).setBiomeName("BiomeGenTYellowJungle").setMinMaxHeight(0.4F,0.5F);
		
		//TODO ADD FLOWER
		/*
		public static Block Yamariki;
		public static Block hamuraika;
		public static Block sajamila;
		public static Block reyuki;*/
		yamariki = new Yamariki().setBlockName("yamariki").setBlockTextureName("bicbiome:yamariki").setHardness(0.0F).setCreativeTab(tabbicbiome).setStepSound(Block.soundTypeGrass);
		GameRegistry.registerBlock(yamariki, yamariki.getUnlocalizedName().substring(5));
		
		hamuraika = new Hamuraika().setBlockName("hamuraika").setBlockTextureName("bicbiome:hamuraika").setHardness(0.0F).setCreativeTab(tabbicbiome).setStepSound(Block.soundTypeGrass);
		GameRegistry.registerBlock(hamuraika, hamuraika.getUnlocalizedName().substring(5));
		
		sajamila = new Sajamila().setBlockName("sajamila").setBlockTextureName("bicbiome:sajamila").setHardness(0.0F).setCreativeTab(tabbicbiome).setStepSound(Block.soundTypeGrass);
		GameRegistry.registerBlock(sajamila, sajamila.getUnlocalizedName().substring(5));
		
		reyuki = new Reyuki().setBlockName("reyuki").setBlockTextureName("bicbiome:reyuki").setHardness(0.0F).setCreativeTab(tabbicbiome).setStepSound(Block.soundTypeGrass);
		GameRegistry.registerBlock(reyuki, reyuki.getUnlocalizedName().substring(5));
		
		//TODO Tools
		skinkiumsword = new SkinkiumSword(skinkiumToolMaterial).setUnlocalizedName("skinkiumsword").setTextureName("bicbiome:skinkiumsword").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(skinkiumsword, skinkiumsword.getUnlocalizedName().substring(5));

		skinkiumpick = new SkinkiumPick(skinkiumToolMaterial).setUnlocalizedName("skinkiumpick").setTextureName("bicbiome:skinkiumpick").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(skinkiumpick, skinkiumpick.getUnlocalizedName().substring(5));
		
		skinkiumshovel = new SkinkiumShovel(skinkiumToolMaterial).setUnlocalizedName("skinkiumshovel").setTextureName("bicbiome:skinkiumshovel").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(skinkiumshovel, skinkiumshovel.getUnlocalizedName().substring(5));
		
		skinkiumaxe = new SkinkiumAxe(skinkiumToolMaterial).setUnlocalizedName("skinkiumaxe").setTextureName("bicbiome:skinkiumaxe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(skinkiumaxe, skinkiumaxe.getUnlocalizedName().substring(5));
		
		skinkiumhoe = new SkinkiumHoe(skinkiumToolMaterial).setUnlocalizedName("skinkiumhoe").setTextureName("bicbiome:skinkiumhoe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(skinkiumhoe, skinkiumhoe.getUnlocalizedName().substring(5));
		
		//Tung
		tungsword = new TungSword(tungToolMaterial).setUnlocalizedName("tungsword").setTextureName("bicbiome:tungsword").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(tungsword, tungsword.getUnlocalizedName().substring(5));

		tungpick = new TungPick(tungToolMaterial).setUnlocalizedName("tungpick").setTextureName("bicbiome:tungpick").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(tungpick, tungpick.getUnlocalizedName().substring(5));
		
		tungshovel = new TungShovel(tungToolMaterial).setUnlocalizedName("tungshovel").setTextureName("bicbiome:tungshovel").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(tungshovel, tungshovel.getUnlocalizedName().substring(5));
		
		tungaxe = new TungAxe(tungToolMaterial).setUnlocalizedName("tungaxe").setTextureName("bicbiome:tungaxe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(tungaxe, tungaxe.getUnlocalizedName().substring(5));
		
		tunghoe = new TungHoe(tungToolMaterial).setUnlocalizedName("tunghoe").setTextureName("bicbiome:tunghoe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(tunghoe, tunghoe.getUnlocalizedName().substring(5));
		
		//wakadewia
		wakadewiasword = new WakadewiaSword(wakadewiaToolMaterial).setUnlocalizedName("wakadewiasword").setTextureName("bicbiome:wakadewiasword").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(wakadewiasword, wakadewiasword.getUnlocalizedName().substring(5));

		wakadewiapick = new WakadewiaPick(wakadewiaToolMaterial).setUnlocalizedName("wakadewiapick").setTextureName("bicbiome:wakadewiapick").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(wakadewiapick, wakadewiapick.getUnlocalizedName().substring(5));
		
		wakadewiashovel = new WakadewiaShovel(wakadewiaToolMaterial).setUnlocalizedName("wakadewiashovel").setTextureName("bicbiome:wakadewiashovel").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(wakadewiashovel, wakadewiashovel.getUnlocalizedName().substring(5));
		
		wakadewiaaxe = new WakadewiaAxe(wakadewiaToolMaterial).setUnlocalizedName("wakadewiaaxe").setTextureName("bicbiome:wakadewiaaxe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(wakadewiaaxe, wakadewiaaxe.getUnlocalizedName().substring(5));
		
		wakadewiahoe = new WakadewiaHoe(wakadewiaToolMaterial).setUnlocalizedName("wakadewiahoe").setTextureName("bicbiome:wakadewiahoe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(wakadewiahoe, wakadewiahoe.getUnlocalizedName().substring(5));
		
		//bicbiome
		bicboiniumsword = new BicboiniumSword(bicboiniumToolMaterial).setUnlocalizedName("bicboiniumsword").setTextureName("bicbiome:bicboiniumsword").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bicboiniumsword, bicboiniumsword.getUnlocalizedName().substring(5));

		bicboiniumpick = new BicboiniumPick(bicboiniumToolMaterial).setUnlocalizedName("bicboiniumpick").setTextureName("bicbiome:bicboiniumpick").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bicboiniumpick, bicboiniumpick.getUnlocalizedName().substring(5));
		
		bicboiniumshovel = new BicboiniumShovel(bicboiniumToolMaterial).setUnlocalizedName("bicboiniumshovel").setTextureName("bicbiome:bicboiniumshovel").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bicboiniumshovel, bicboiniumshovel.getUnlocalizedName().substring(5));
		
		bicboiniumaxe = new BicboiniumAxe(bicboiniumToolMaterial).setUnlocalizedName("bicboiniumaxe").setTextureName("bicbiome:bicboiniumaxe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bicboiniumaxe, bicboiniumaxe.getUnlocalizedName().substring(5));
		
		bicboiniumhoe = new BicboiniumHoe(bicboiniumToolMaterial).setUnlocalizedName("bicboiniumhoe").setTextureName("bicbiome:bicboiniumhoe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bicboiniumhoe, bicboiniumhoe.getUnlocalizedName().substring(5));
		//whlopmore
		whlopmoresword = new WhlopmoreSword(whlopmoreToolMaterial).setUnlocalizedName("whlopmoresword").setTextureName("bicbiome:whlopmoresword").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(whlopmoresword, whlopmoresword.getUnlocalizedName().substring(5));

		whlopmorepick = new WhlopmorePick(whlopmoreToolMaterial).setUnlocalizedName("whlopmorepick").setTextureName("bicbiome:whlopmorepick").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(whlopmorepick, whlopmorepick.getUnlocalizedName().substring(5));
		
		whlopmoreshovel = new WhlopmoreShovel(whlopmoreToolMaterial).setUnlocalizedName("whlopmoreshovel").setTextureName("bicbiome:whlopmoreshovel").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(whlopmoreshovel, whlopmoreshovel.getUnlocalizedName().substring(5));
		
		whlopmoreaxe = new WhlopmoreAxe(whlopmoreToolMaterial).setUnlocalizedName("whlopmoreaxe").setTextureName("bicbiome:whlopmoreaxe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(whlopmoreaxe, whlopmoreaxe.getUnlocalizedName().substring(5));
		
		whlopmorehoe = new WhlopmoreHoe(whlopmoreToolMaterial).setUnlocalizedName("whlopmorehoe").setTextureName("bicbiome:whlopmorehoe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(whlopmorehoe, whlopmorehoe.getUnlocalizedName().substring(5));
		//crevbura
		crevburasword = new CrevburaSword(crevburaToolMaterial).setUnlocalizedName("crevburasword").setTextureName("bicbiome:crevburasword").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(crevburasword, crevburasword.getUnlocalizedName().substring(5));

		crevburapick = new CrevburaPick(crevburaToolMaterial).setUnlocalizedName("crevburapick").setTextureName("bicbiome:crevburapick").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(crevburapick, crevburapick.getUnlocalizedName().substring(5));
		
		crevburashovel = new CrevburaShovel(crevburaToolMaterial).setUnlocalizedName("crevburashovel").setTextureName("bicbiome:crevburashovel").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(crevburashovel, crevburashovel.getUnlocalizedName().substring(5));
		
		crevburaaxe = new CrevburaAxe(crevburaToolMaterial).setUnlocalizedName("crevburaaxe").setTextureName("bicbiome:crevburaaxe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(crevburaaxe, crevburaaxe.getUnlocalizedName().substring(5));
		
		crevburahoe = new CrevburaHoe(crevburaToolMaterial).setUnlocalizedName("crevburahoe").setTextureName("bicbiome:crevburahoe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(crevburahoe, crevburahoe.getUnlocalizedName().substring(5));
		//penoium
		penoiumsword = new PenoiumSword(penoiumToolMaterial).setUnlocalizedName("penoiumsword").setTextureName("bicbiome:penoiumsword").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(penoiumsword, penoiumsword.getUnlocalizedName().substring(5));

		penoiumpick = new PenoiumPick(penoiumToolMaterial).setUnlocalizedName("penoiumpick").setTextureName("bicbiome:penoiumpick").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(penoiumpick, penoiumpick.getUnlocalizedName().substring(5));
		
		penoiumshovel = new PenoiumShovel(penoiumToolMaterial).setUnlocalizedName("penoiumshovel").setTextureName("bicbiome:penoiumshovel").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(penoiumshovel, penoiumshovel.getUnlocalizedName().substring(5));
		
		penoiumaxe = new PenoiumAxe(penoiumToolMaterial).setUnlocalizedName("penoiumaxe").setTextureName("bicbiome:penoiumaxe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(penoiumaxe, penoiumaxe.getUnlocalizedName().substring(5));
		
		penoiumhoe = new PenoiumHoe(penoiumToolMaterial).setUnlocalizedName("penoiumhoe").setTextureName("bicbiome:penoiumhoe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(penoiumhoe, penoiumhoe.getUnlocalizedName().substring(5));
		//harmura
		harmurasword = new HarmuraSword(harmuraToolMaterial).setUnlocalizedName("harmurasword").setTextureName("bicbiome:harmurasword").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(harmurasword, harmurasword.getUnlocalizedName().substring(5));

		harmurapick = new HarmuraPick(harmuraToolMaterial).setUnlocalizedName("harmurapick").setTextureName("bicbiome:harmurapick").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(harmurapick, harmurapick.getUnlocalizedName().substring(5));
		
		harmurashovel = new HarmuraShovel(harmuraToolMaterial).setUnlocalizedName("harmurashovel").setTextureName("bicbiome:harmurashovel").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(harmurashovel, harmurashovel.getUnlocalizedName().substring(5));
		
		harmuraaxe = new HarmuraAxe(harmuraToolMaterial).setUnlocalizedName("harmuraaxe").setTextureName("bicbiome:harmuraaxe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(harmuraaxe, harmuraaxe.getUnlocalizedName().substring(5));
		
		harmurahoe = new HarmuraHoe(harmuraToolMaterial).setUnlocalizedName("harmurahoe").setTextureName("bicbiome:harmurahoe").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(harmurahoe, harmurahoe.getUnlocalizedName().substring(5));
		
		//TODO armor
		skinkiumhelmet = new ItemSkinkiumArmor(skinkiumArmorMaterial, 0, 0).setUnlocalizedName("skinkiumhelmet").setTextureName("bicbiome:skinkiumhelmet").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(skinkiumhelmet, skinkiumhelmet.getUnlocalizedName().substring(5));
		skinkiumchest = new ItemSkinkiumArmor(skinkiumArmorMaterial, 0, 1).setUnlocalizedName("skinkiumchest").setTextureName("bicbiome:skinkiumchest").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(skinkiumchest, skinkiumchest.getUnlocalizedName().substring(5));
		skinkiumlegs = new ItemSkinkiumArmor(skinkiumArmorMaterial, 0, 2).setUnlocalizedName("skinkiumlegs").setTextureName("bicbiome:skinkiumlegs").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(skinkiumlegs, skinkiumlegs.getUnlocalizedName().substring(5));
		skinkiumboots = new ItemSkinkiumArmor(skinkiumArmorMaterial, 0, 3).setUnlocalizedName("skinkiumboots").setTextureName("bicbiome:skinkiumboots").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(skinkiumboots, skinkiumboots.getUnlocalizedName().substring(5));
		
		tunghelmet = new ItemTungArmor(tungArmorMaterial, 0, 0).setUnlocalizedName("tunghelmet").setTextureName("bicbiome:tunghelmet").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(tunghelmet, tunghelmet.getUnlocalizedName().substring(5));
		tungchest = new ItemTungArmor(tungArmorMaterial, 0, 1).setUnlocalizedName("tungchest").setTextureName("bicbiome:tungchest").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(tungchest, tungchest.getUnlocalizedName().substring(5));
		tunglegs = new ItemTungArmor(tungArmorMaterial, 0, 2).setUnlocalizedName("tunglegs").setTextureName("bicbiome:tunglegs").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(tunglegs, tunglegs.getUnlocalizedName().substring(5));
		tungboots = new ItemTungArmor(tungArmorMaterial, 0, 3).setUnlocalizedName("tungboots").setTextureName("bicbiome:tungboots").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(tungboots, tungboots.getUnlocalizedName().substring(5));
		
		wakadewiahelmet = new ItemWakadewiaArmor(wakadewiaArmorMaterial, 0, 0).setUnlocalizedName("wakadewiahelmet").setTextureName("bicbiome:wakadewiahelmet").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(wakadewiahelmet, wakadewiahelmet.getUnlocalizedName().substring(5));
		wakadewiachest = new ItemWakadewiaArmor(wakadewiaArmorMaterial, 0, 1).setUnlocalizedName("wakadewiachest").setTextureName("bicbiome:wakadewiachest").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(wakadewiachest, wakadewiachest.getUnlocalizedName().substring(5));
		wakadewialegs = new ItemWakadewiaArmor(wakadewiaArmorMaterial, 0, 2).setUnlocalizedName("wakadewialegs").setTextureName("bicbiome:wakadewialegs").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(wakadewialegs, wakadewialegs.getUnlocalizedName().substring(5));
		wakadewiaboots = new ItemWakadewiaArmor(wakadewiaArmorMaterial, 0, 3).setUnlocalizedName("wakadewiaboots").setTextureName("bicbiome:wakadewiaboots").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(wakadewiaboots, wakadewiaboots.getUnlocalizedName().substring(5));
		
		bicboiniumhelmet = new ItemBicboiniumArmor(bicboiniumArmorMaterial, 0, 0).setUnlocalizedName("bicboiniumhelmet").setTextureName("bicbiome:bicboiniumhelmet").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bicboiniumhelmet, bicboiniumhelmet.getUnlocalizedName().substring(5));
		bicboiniumchest = new ItemBicboiniumArmor(bicboiniumArmorMaterial, 0, 1).setUnlocalizedName("bicboiniumchest").setTextureName("bicbiome:bicboiniumchest").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bicboiniumchest, bicboiniumchest.getUnlocalizedName().substring(5));
		bicboiniumlegs = new ItemBicboiniumArmor(bicboiniumArmorMaterial, 0, 2).setUnlocalizedName("bicboiniumlegs").setTextureName("bicbiome:bicboiniumlegs").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bicboiniumlegs, bicboiniumlegs.getUnlocalizedName().substring(5));
		bicboiniumboots = new ItemBicboiniumArmor(bicboiniumArmorMaterial, 0, 3).setUnlocalizedName("bicboiniumboots").setTextureName("bicbiome:bicboiniumboots").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bicboiniumboots, bicboiniumboots.getUnlocalizedName().substring(5));
		
		whlopmorehelmet = new ItemWhlopmoreArmor(whlopmoreArmorMaterial, 0, 0).setUnlocalizedName("whlopmorehelmet").setTextureName("bicbiome:whlopmorehelmet").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(whlopmorehelmet, whlopmorehelmet.getUnlocalizedName().substring(5));
		whlopmorechest = new ItemWhlopmoreArmor(whlopmoreArmorMaterial, 0, 1).setUnlocalizedName("whlopmorechest").setTextureName("bicbiome:whlopmorechest").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(whlopmorechest, whlopmorechest.getUnlocalizedName().substring(5));
		whlopmorelegs = new ItemWhlopmoreArmor(whlopmoreArmorMaterial, 0, 2).setUnlocalizedName("whlopmorelegs").setTextureName("bicbiome:whlopmorelegs").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(whlopmorelegs, whlopmorelegs.getUnlocalizedName().substring(5));
		whlopmoreboots = new ItemWhlopmoreArmor(whlopmoreArmorMaterial, 0, 3).setUnlocalizedName("whlopmoreboots").setTextureName("bicbiome:whlopmoreboots").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(whlopmoreboots, whlopmoreboots.getUnlocalizedName().substring(5));
		
		crevburahelmet = new ItemCrevburaArmor(crevburaArmorMaterial, 0, 0).setUnlocalizedName("crevburahelmet").setTextureName("bicbiome:crevburahelmet").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(crevburahelmet, crevburahelmet.getUnlocalizedName().substring(5));
		crevburachest = new ItemCrevburaArmor(crevburaArmorMaterial, 0, 1).setUnlocalizedName("crevburachest").setTextureName("bicbiome:crevburachest").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(crevburachest, crevburachest.getUnlocalizedName().substring(5));
		crevburalegs = new ItemCrevburaArmor(crevburaArmorMaterial, 0, 2).setUnlocalizedName("crevburalegs").setTextureName("bicbiome:crevburalegs").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(crevburalegs, crevburalegs.getUnlocalizedName().substring(5));
		crevburaboots = new ItemCrevburaArmor(crevburaArmorMaterial, 0, 3).setUnlocalizedName("crevburaboots").setTextureName("bicbiome:crevburaboots").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(crevburaboots, crevburaboots.getUnlocalizedName().substring(5));
		
		penoiumhelmet = new ItemPenoiumArmor(penoiumArmorMaterial, 0, 0).setUnlocalizedName("penoiumhelmet").setTextureName("bicbiome:penoiumhelmet").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(penoiumhelmet, penoiumhelmet.getUnlocalizedName().substring(5));
		penoiumchest = new ItemPenoiumArmor(penoiumArmorMaterial, 0, 1).setUnlocalizedName("penoiumchest").setTextureName("bicbiome:penoiumchest").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(penoiumchest, penoiumchest.getUnlocalizedName().substring(5));
		penoiumlegs = new ItemPenoiumArmor(penoiumArmorMaterial, 0, 2).setUnlocalizedName("penoiumlegs").setTextureName("bicbiome:penoiumlegs").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(penoiumlegs, penoiumlegs.getUnlocalizedName().substring(5));
		penoiumboots = new ItemPenoiumArmor(penoiumArmorMaterial, 0, 3).setUnlocalizedName("penoiumboots").setTextureName("bicbiome:penoiumboots").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(penoiumboots, penoiumboots.getUnlocalizedName().substring(5));

		harmurahelmet = new ItemHarmuraArmor(harmuraArmorMaterial, 0, 0).setUnlocalizedName("harmurahelmet").setTextureName("bicbiome:harmurahelmet").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(harmurahelmet, harmurahelmet.getUnlocalizedName().substring(5));
		harmurachest = new ItemHarmuraArmor(harmuraArmorMaterial, 0, 1).setUnlocalizedName("harmurachest").setTextureName("bicbiome:harmurachest").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(harmurachest, harmurachest.getUnlocalizedName().substring(5));
		harmuralegs = new ItemHarmuraArmor(harmuraArmorMaterial, 0, 2).setUnlocalizedName("harmuralegs").setTextureName("bicbiome:harmuralegs").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(harmuralegs, harmuralegs.getUnlocalizedName().substring(5));
		harmuraboots = new ItemHarmuraArmor(harmuraArmorMaterial, 0, 3).setUnlocalizedName("harmuraboots").setTextureName("bicbiome:harmuraboots").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(harmuraboots, harmuraboots.getUnlocalizedName().substring(5));
		
		//TODO Staff
		
		firerarstaff = new FirerarStaff().setUnlocalizedName("FirerarStaff").setTextureName("bicbiome:firerarstaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(firerarstaff, firerarstaff.getUnlocalizedName().substring(5));
		
		warsongfirerarstaff = new WarsongFirerarStaff().setUnlocalizedName("warsongfirerarstaff").setTextureName("bicbiome:firerarstaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(warsongfirerarstaff, warsongfirerarstaff.getUnlocalizedName().substring(5));
		
		bongikastaff = new BongikaStaff().setUnlocalizedName("bongikastaff").setTextureName("bicbiome:bongikastaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(bongikastaff, bongikastaff.getUnlocalizedName().substring(5));
		
		omegabongikastaff = new OmegaBongikaStaff().setUnlocalizedName("omegabongikastaff").setTextureName("bicbiome:bongikastaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(omegabongikastaff, omegabongikastaff.getUnlocalizedName().substring(5));
		
		warsongbongikastaff = new WarsongBongikaStaff().setUnlocalizedName("warsongbongikastaff").setTextureName("bicbiome:bongikastaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(warsongbongikastaff, warsongbongikastaff.getUnlocalizedName().substring(5));
		
		glassiumstaff = new GlassiumStaff().setUnlocalizedName("glassiumstaff").setTextureName("bicbiome:glassiumstaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(glassiumstaff, glassiumstaff.getUnlocalizedName().substring(5));
		
		teleporiumstaff = new TeleporiumStaff().setUnlocalizedName("teleporiumstaff").setTextureName("bicbiome:teleporiumstaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(teleporiumstaff, teleporiumstaff.getUnlocalizedName().substring(5));
		
		warsongteleporiumstaff = new WarsongTeleporiumStaff().setUnlocalizedName("warsongteleporiumstaff").setTextureName("bicbiome:teleporiumstaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(warsongteleporiumstaff, warsongteleporiumstaff.getUnlocalizedName().substring(5));
		
		legendarywarsongteleporiumstaff = new LegendaryWarsongTeleporiumStaff().setUnlocalizedName("legendarywarsongteleporiumstaff").setTextureName("bicbiome:teleporiumstaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(legendarywarsongteleporiumstaff, legendarywarsongteleporiumstaff.getUnlocalizedName().substring(5));
		
		forbiddenstaff = new ForbiddenStaff().setUnlocalizedName("forbiddenstaff").setTextureName("bicbiome:forbiddenstaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(forbiddenstaff, forbiddenstaff.getUnlocalizedName().substring(5));
		
		warsongforbiddenstaff = new WarsongForbiddenStaff().setUnlocalizedName("warsongforbiddenstaff").setTextureName("bicbiome:forbiddenstaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(warsongforbiddenstaff, warsongforbiddenstaff.getUnlocalizedName().substring(5));
		
		legendarywarsongforbiddenstaff = new LegendaryWarsongForbiddenStaff().setUnlocalizedName("legendarywarsongforbiddenstaff").setTextureName("bicbiome:forbiddenstaff").setCreativeTab(tabbicbiome);
		GameRegistry.registerItem(legendarywarsongforbiddenstaff, legendarywarsongforbiddenstaff.getUnlocalizedName().substring(5));
		
		
		OreDictionary.registerOre("dyeBlue", new ItemStack(bicbiomeblue, 1));
		OreDictionary.registerOre("dyePurple", new ItemStack(hamuraika, 1));
		
		//TODO Ore Gen biomes
		//BiomeOreGeneration TreeManager = new BiomeOreGeneration();
		GameRegistry.registerWorldGenerator(new BiomeOreGeneration(), 0);
		GameRegistry.registerWorldGenerator(treemanager, 0);
		
		
		BiomeRegistry.mainRegsitry();
		
		
    }
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		
		MinecraftForge.EVENT_BUS.register(new MobEventHandler());
		
		//proxy,tile entity,entity,gui,
		
		GameRegistry.addRecipe(new ItemStack(Items.dye, 1, 4), new Object[]{"X  ","   ","   ", 'X', Bicbiome.reyuki});
		GameRegistry.addRecipe(new ItemStack(Items.dye, 1, 1), new Object[]{" X ","   ","   ", 'X', Bicbiome.reyuki});
		GameRegistry.addRecipe(new ItemStack(Items.dye, 1, 11), new Object[]{"  X","   ","   ", 'X', Bicbiome.reyuki});
		GameRegistry.addRecipe(new ItemStack(Items.dye, 1, 2), new Object[]{"   ","X  ","   ", 'X', Bicbiome.reyuki});
		GameRegistry.addRecipe(new ItemStack(Items.dye, 1, 9), new Object[]{"   "," X ","   ", 'X', Bicbiome.reyuki});

		GameRegistry.addRecipe(new ItemStack(firerarstaff), new Object[]{"  S"," X ","X  ", 'X', Bicbiome.tungingot, 'S', Items.coal});
		GameRegistry.addRecipe(new ItemStack(warsongfirerarstaff), new Object[]{" X ","XSX"," X ", 'X', Bicbiome.tungingot, 'S', Bicbiome.firerarstaff});
		
		
		GameRegistry.addRecipe(new ItemStack(bongikastaff), new Object[]{"  S"," X ","X  ", 'X', Bicbiome.tungingot, 'S', Items.gunpowder});
		GameRegistry.addRecipe(new ItemStack(warsongbongikastaff), new Object[]{" X ","XSX"," X ", 'X', Bicbiome.tungingot, 'S', Bicbiome.bongikastaff});
		GameRegistry.addRecipe(new ItemStack(omegabongikastaff), new Object[]{" X ","XSX"," X ", 'X', Bicbiome.tungingot, 'S', Bicbiome.warsongbongikastaff});
		
		GameRegistry.addRecipe(new ItemStack(glassiumstaff), new Object[]{"  S"," X ","X  ", 'X', Bicbiome.tungingot, 'S', Items.porkchop});
		GameRegistry.addRecipe(new ItemStack(teleporiumstaff), new Object[]{"  S"," X ","X  ", 'X', Bicbiome.tungingot, 'S', Blocks.glass});
		
		GameRegistry.addRecipe(new ItemStack(forbiddenstaff), new Object[]{"  S"," X ","X  ", 'X', Bicbiome.tungingot, 'S', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(warsongforbiddenstaff), new Object[]{" X ","XSX"," X ", 'X', Bicbiome.tungingot, 'S', Bicbiome.forbiddenstaff});
		GameRegistry.addRecipe(new ItemStack(legendarywarsongforbiddenstaff), new Object[]{" X ","XSX"," X ", 'X',Bicbiome.tungingot, 'S', Bicbiome.warsongforbiddenstaff});
		
		
		
		//TODO Crafting Tools
		GameRegistry.addRecipe(new ItemStack(harmurapick), new Object[]{"XXX"," S "," S ", 'X', Bicbiome.harmuraingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(harmuraaxe), new Object[]{"XX ","XS "," S ", 'X', Bicbiome.harmuraingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(harmurasword), new Object[]{" X "," X "," S ", 'X', Bicbiome.harmuraingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(harmurahoe), new Object[]{"XX "," S "," S ", 'X', Bicbiome.harmuraingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(harmurashovel), new Object[]{" X "," S "," S ", 'X', Bicbiome.harmuraingot, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(tungpick), new Object[]{"XXX"," S "," S ", 'X', Bicbiome.tungingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungaxe), new Object[]{"XX ","XS "," S ", 'X', Bicbiome.tungingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungsword), new Object[]{" X "," X "," S ", 'X', Bicbiome.tungingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tunghoe), new Object[]{"XX "," S "," S ", 'X', Bicbiome.tungingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungshovel), new Object[]{" X "," S "," S ", 'X', Bicbiome.tungingot, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(skinkiumpick), new Object[]{"XXX"," S "," S ", 'X', Bicbiome.skinkiumcrystal, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(skinkiumaxe), new Object[]{"XX ","XS "," S ", 'X', Bicbiome.skinkiumcrystal, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(skinkiumsword), new Object[]{" X "," X "," S ", 'X', Bicbiome.skinkiumcrystal, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(skinkiumhoe), new Object[]{"XX "," S "," S ", 'X', Bicbiome.skinkiumcrystal, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(skinkiumshovel), new Object[]{" X "," S "," S ", 'X', Bicbiome.skinkiumcrystal, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(penoiumpick), new Object[]{"XXX"," S "," S ", 'X', Bicbiome.penoiumingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(penoiumaxe), new Object[]{"XX ","XS "," S ", 'X', Bicbiome.penoiumingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(penoiumsword), new Object[]{" X "," X "," S ", 'X', Bicbiome.penoiumingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(penoiumhoe), new Object[]{"XX "," S "," S ", 'X', Bicbiome.penoiumingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(penoiumshovel), new Object[]{" X "," S "," S ", 'X', Bicbiome.penoiumingot, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(whlopmorepick), new Object[]{"XXX"," S "," S ", 'X', Bicbiome.whlopmoreingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(whlopmoreaxe), new Object[]{"XX ","XS "," S ", 'X', Bicbiome.whlopmoreingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(whlopmoresword), new Object[]{" X "," X "," S ", 'X', Bicbiome.whlopmoreingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(whlopmorehoe), new Object[]{"XX "," S "," S ", 'X', Bicbiome.whlopmoreingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(whlopmoreshovel), new Object[]{" X "," S "," S ", 'X', Bicbiome.whlopmoreingot, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(crevburapick), new Object[]{"XXX"," S "," S ", 'X', Bicbiome.crevburacrystal, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(crevburaaxe), new Object[]{"XX ","XS "," S ", 'X', Bicbiome.crevburacrystal, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(crevburasword), new Object[]{" X "," X "," S ", 'X', Bicbiome.crevburacrystal, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(crevburahoe), new Object[]{"XX "," S "," S ", 'X', Bicbiome.crevburacrystal, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(crevburashovel), new Object[]{" X "," S "," S ", 'X', Bicbiome.crevburacrystal, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(wakadewiapick), new Object[]{"XXX"," S "," S ", 'X', Bicbiome.wakadewiaingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(wakadewiaaxe), new Object[]{"XX ","XS "," S ", 'X', Bicbiome.wakadewiaingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(wakadewiasword), new Object[]{" X "," X "," S ", 'X', Bicbiome.wakadewiaingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(wakadewiahoe), new Object[]{"XX "," S "," S ", 'X', Bicbiome.wakadewiaingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(wakadewiashovel), new Object[]{" X "," S "," S ", 'X', Bicbiome.wakadewiaingot, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(bicboiniumpick), new Object[]{"XXX"," S "," S ", 'X', Bicbiome.bicboiniumingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(bicboiniumaxe), new Object[]{"XX ","XS "," S ", 'X', Bicbiome.bicboiniumingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(bicboiniumsword), new Object[]{" X "," X "," S ", 'X', Bicbiome.bicboiniumingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(bicboiniumhoe), new Object[]{"XX "," S "," S ", 'X', Bicbiome.bicboiniumingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(bicboiniumshovel), new Object[]{" X "," S "," S ", 'X', Bicbiome.bicboiniumingot, 'S', Items.stick});
		
		//Armor
		GameRegistry.addRecipe(new ItemStack(harmurahelmet), new Object[]{"XXX","X X", 'X', Bicbiome.harmuraingot});
		GameRegistry.addRecipe(new ItemStack(harmurachest), new Object[]{"X X","XXX","XXX", 'X', Bicbiome.harmuraingot});
		GameRegistry.addRecipe(new ItemStack(harmuralegs), new Object[]{"XXX","X X","X X", 'X', Bicbiome.harmuraingot});
		GameRegistry.addRecipe(new ItemStack(harmuraboots), new Object[]{"X X","X X", 'X', Bicbiome.harmuraingot});
		
		GameRegistry.addRecipe(new ItemStack(tunghelmet), new Object[]{"XXX","X X", 'X', Bicbiome.tungingot});
		GameRegistry.addRecipe(new ItemStack(tungchest), new Object[]{"X X","XXX","XXX", 'X', Bicbiome.tungingot});
		GameRegistry.addRecipe(new ItemStack(tunglegs), new Object[]{"XXX","X X","X X", 'X', Bicbiome.tungingot});
		GameRegistry.addRecipe(new ItemStack(tungboots), new Object[]{"X X","X X", 'X', Bicbiome.tungingot});
		
		GameRegistry.addRecipe(new ItemStack(skinkiumhelmet), new Object[]{"XXX","X X", 'X', Bicbiome.skinkiumcrystal});
		GameRegistry.addRecipe(new ItemStack(skinkiumchest), new Object[]{"X X","XXX","XXX", 'X', Bicbiome.skinkiumcrystal});
		GameRegistry.addRecipe(new ItemStack(skinkiumlegs), new Object[]{"XXX","X X","X X", 'X', Bicbiome.skinkiumcrystal});
		GameRegistry.addRecipe(new ItemStack(skinkiumboots), new Object[]{"X X","X X", 'X', Bicbiome.skinkiumcrystal});
		
		GameRegistry.addRecipe(new ItemStack(wakadewiahelmet), new Object[]{"XXX","X X", 'X', Bicbiome.wakadewiaingot});
		GameRegistry.addRecipe(new ItemStack(wakadewiachest), new Object[]{"X X","XXX","XXX", 'X', Bicbiome.wakadewiaingot});
		GameRegistry.addRecipe(new ItemStack(wakadewialegs), new Object[]{"XXX","X X","X X", 'X', Bicbiome.wakadewiaingot});
		GameRegistry.addRecipe(new ItemStack(wakadewiaboots), new Object[]{"X X","X X", 'X', Bicbiome.wakadewiaingot});
		
		GameRegistry.addRecipe(new ItemStack(whlopmorehelmet), new Object[]{"XXX","X X", 'X', Bicbiome.whlopmoreingot});
		GameRegistry.addRecipe(new ItemStack(whlopmorechest), new Object[]{"X X","XXX","XXX", 'X', Bicbiome.whlopmoreingot});
		GameRegistry.addRecipe(new ItemStack(whlopmorelegs), new Object[]{"XXX","X X","X X", 'X', Bicbiome.whlopmoreingot});
		GameRegistry.addRecipe(new ItemStack(whlopmoreboots), new Object[]{"X X","X X", 'X', Bicbiome.whlopmoreingot});
		
		GameRegistry.addRecipe(new ItemStack(penoiumhelmet), new Object[]{"XXX","X X", 'X', Bicbiome.penoiumingot});
		GameRegistry.addRecipe(new ItemStack(penoiumchest), new Object[]{"X X","XXX","XXX", 'X', Bicbiome.penoiumingot});
		GameRegistry.addRecipe(new ItemStack(penoiumlegs), new Object[]{"XXX","X X","X X", 'X', Bicbiome.penoiumingot});
		GameRegistry.addRecipe(new ItemStack(penoiumboots), new Object[]{"X X","X X", 'X', Bicbiome.penoiumingot});
		
		GameRegistry.addRecipe(new ItemStack(bicboiniumhelmet), new Object[]{"XXX","X X", 'X', Bicbiome.bicboiniumingot});
		GameRegistry.addRecipe(new ItemStack(bicboiniumchest), new Object[]{"X X","XXX","XXX", 'X', Bicbiome.bicboiniumingot});
		GameRegistry.addRecipe(new ItemStack(bicboiniumlegs), new Object[]{"XXX","X X","X X", 'X', Bicbiome.bicboiniumingot});
		GameRegistry.addRecipe(new ItemStack(bicboiniumboots), new Object[]{"X X","X X", 'X', Bicbiome.bicboiniumingot});
		
		GameRegistry.addRecipe(new ItemStack(crevburahelmet), new Object[]{"XXX","X X", 'X', Bicbiome.crevburacrystal});
		GameRegistry.addRecipe(new ItemStack(crevburachest), new Object[]{"X X","XXX","XXX", 'X', Bicbiome.crevburacrystal});
		GameRegistry.addRecipe(new ItemStack(crevburalegs), new Object[]{"XXX","X X","X X", 'X', Bicbiome.crevburacrystal});
		GameRegistry.addRecipe(new ItemStack(crevburaboots), new Object[]{"X X","X X", 'X', Bicbiome.crevburacrystal});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.planks,4), new Object[]{"X", 'X', Bicbiome.tunglog});
		GameRegistry.addRecipe(new ItemStack(Blocks.planks,4), new Object[]{"X", 'X', Bicbiome.yellowlog});
		GameRegistry.addRecipe(new ItemStack(Blocks.planks,4), new Object[]{"X", 'X', Bicbiome.whitelog});
		GameRegistry.addRecipe(new ItemStack(Blocks.planks,4), new Object[]{"X", 'X', Bicbiome.netherlog});
		GameRegistry.addRecipe(new ItemStack(Blocks.glass,4), new Object[]{"X", 'X', Bicbiome.tunglog});
		
		
		GameRegistry.addSmelting(blockbicboinium, new ItemStack(bicboiniumingot), 4.0F);
		GameRegistry.addSmelting(blocktung, new ItemStack(tungingot), 6.0F);
		GameRegistry.addSmelting(blockharmura, new ItemStack(harmuraingot), 2.0F);
		GameRegistry.addSmelting(blockwhlopmore, new ItemStack(whlopmoreingot), 6.0F);
		GameRegistry.addSmelting(blockpenoium, new ItemStack(penoiumingot), 6.0F);
		
		
    }
	@EventHandler
    public void postinit(FMLPostInitializationEvent event)
    { 
		WorldType Tung = new WorldTypeTung(3,"Tung");
    }
	
	public static CreativeTabs tabbicbiome = new CreativeTabs("tabbicbiome")
	{
		@Override
		public Item getTabIconItem(){
			
			return new ItemStack(skinkiumcrystal).getItem();
		}
	};
	
}