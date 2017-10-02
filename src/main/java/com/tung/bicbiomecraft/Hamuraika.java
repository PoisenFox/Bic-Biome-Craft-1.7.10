package com.tung.bicbiomecraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.init.Blocks;

public class Hamuraika extends BlockBush{

	/**
     * is the block grass, dirt or farmland
     */
    protected boolean canPlaceBlockOn(Block par1)
    {
        return par1 == Blocks.grass || par1 == Blocks.dirt || par1 == Blocks.farmland || par1 == Bicbiome.yellowgrass || par1 == Bicbiome.orangegrass || par1 == Bicbiome.bluegrass || par1 == Bicbiome.purplegrass;
    }

}
