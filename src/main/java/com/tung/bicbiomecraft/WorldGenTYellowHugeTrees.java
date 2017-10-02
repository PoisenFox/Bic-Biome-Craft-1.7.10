package com.tung.bicbiomecraft;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;

public class WorldGenTYellowHugeTrees extends WorldGenHugeTrees
{
    private static final String __OBFID = "CL_00000420";

    public WorldGenTYellowHugeTrees(boolean p_i45456_1_, int p_i45456_2_, int p_i45456_3_, int p_i45456_4_, int p_i45456_5_)
    {
        super(p_i45456_1_, p_i45456_2_, p_i45456_3_, p_i45456_4_, p_i45456_5_);
    }

    public boolean generate(World world, Random random, int par3, int par4, int par5)
    {
        int l = this.func_150533_a(random);

        if (!this.func_150537_a(world, random, par3, par4, par5, l))
        {
            return false;
        }
        else
        {
            this.func_150543_c(world, par3, par5, par4 + l, 2, random);

            for (int i1 = par4 + l - 2 - random.nextInt(4); i1 > par4 + l / 2; i1 -= 2 + random.nextInt(4))
            {
                float f = random.nextFloat() * (float)Math.PI * 2.0F;
                int j1 = par3 + (int)(0.5F + MathHelper.cos(f) * 4.0F);
                int k1 = par5 + (int)(0.5F + MathHelper.sin(f) * 4.0F);
                int l1;

                for (l1 = 0; l1 < 5; ++l1)
                {
                    j1 = par3 + (int)(1.5F + MathHelper.cos(f) * (float)l1);
                    k1 = par5 + (int)(1.5F + MathHelper.sin(f) * (float)l1);
                    this.setBlockAndNotifyAdequately(world, j1, i1 - 3 + l1 / 2, k1, Bicbiome.yellowlog, this.woodMetadata);
                }

                l1 = 1 + random.nextInt(2);
                int i2 = i1;

                for (int j2 = i1 - l1; j2 <= i2; ++j2)
                {
                    int k2 = j2 - i2;
                    this.func_150534_b(world, j1, j2, k1, 1 - k2, random);
                }
            }

            for (int l2 = 0; l2 < l; ++l2)
            {
                Block block = world.getBlock(par3, par4 + l2, par5);

                if (block.isAir(world, par3, par4 + l2, par5) || block.isLeaves(world, par3, par4 + l2, par5))
                {
                    this.setBlockAndNotifyAdequately(world, par3, par4 + l2, par5, Bicbiome.yellowlog, this.woodMetadata);

                    if (l2 > 0)
                    {
                        if (random.nextInt(3) > 0 && world.isAirBlock(par3 - 1, par4 + l2, par5))
                        {
                            this.setBlockAndNotifyAdequately(world, par3 - 1, par4 + l2, par5, Blocks.vine, 8);
                        }

                        if (random.nextInt(3) > 0 && world.isAirBlock(par3, par4 + l2, par5 - 1))
                        {
                            this.setBlockAndNotifyAdequately(world, par3, par4 + l2, par5 - 1, Blocks.vine, 1);
                        }
                    }
                }

                if (l2 < l - 1)
                {
                    block = world.getBlock(par3 + 1, par4 + l2, par5);

                    if (block.isAir(world, par3 + 1, par4 + l2, par5) || block.isLeaves(world, par3 + 1, par4 + l2, par5))
                    {
                        this.setBlockAndNotifyAdequately(world, par3 + 1, par4 + l2, par5, Bicbiome.yellowlog, this.woodMetadata);

                        if (l2 > 0)
                        {
                            if (random.nextInt(3) > 0 && world.isAirBlock(par3 + 2, par4 + l2, par5))
                            {
                                this.setBlockAndNotifyAdequately(world, par3 + 2, par4 + l2, par5, Blocks.vine, 2);
                            }

                            if (random.nextInt(3) > 0 && world.isAirBlock(par3 + 1, par4 + l2, par5 - 1))
                            {
                                this.setBlockAndNotifyAdequately(world, par3 + 1, par4 + l2, par5 - 1, Blocks.vine, 1);
                            }
                        }
                    }

                    block = world.getBlock(par3 + 1, par4 + l2, par5 + 1);

                    if (block.isAir(world, par3 + 1, par4 + l2, par5 + 1) || block.isLeaves(world, par3 + 1, par4 + l2, par5 + 1))
                    {
                        this.setBlockAndNotifyAdequately(world, par3 + 1, par4 + l2, par5 + 1, Bicbiome.yellowlog, this.woodMetadata);

                        if (l2 > 0)
                        {
                            if (random.nextInt(3) > 0 && world.isAirBlock(par3 + 2, par4 + l2, par5 + 1))
                            {
                                this.setBlockAndNotifyAdequately(world, par3 + 2, par4 + l2, par5 + 1, Blocks.vine, 2);
                            }

                            if (random.nextInt(3) > 0 && world.isAirBlock(par3 + 1, par4 + l2, par5 + 2))
                            {
                                this.setBlockAndNotifyAdequately(world, par3 + 1, par4 + l2, par5 + 2, Blocks.vine, 4);
                            }
                        }
                    }

                    block = world.getBlock(par3, par4 + l2, par5 + 1);

                    if (block.isAir(world, par3, par4 + l2, par5 + 1) || block.isLeaves(world, par3, par4 + l2, par5 + 1))
                    {
                        this.setBlockAndNotifyAdequately(world, par3, par4 + l2, par5 + 1, Bicbiome.yellowlog, this.woodMetadata);

                        if (l2 > 0)
                        {
                            if (random.nextInt(3) > 0 && world.isAirBlock(par3 - 1, par4 + l2, par5 + 1))
                            {
                                this.setBlockAndNotifyAdequately(world, par3 - 1, par4 + l2, par5 + 1, Blocks.vine, 8);
                            }

                            if (random.nextInt(3) > 0 && world.isAirBlock(par3, par4 + l2, par5 + 2))
                            {
                                this.setBlockAndNotifyAdequately(world, par3, par4 + l2, par5 + 2, Blocks.vine, 4);
                            }
                        }
                    }
                }
            }

            return true;
        }
    }

    private void func_150543_c(World world, int par2, int par3, int par4, int par5, Random random6)
    {
        byte b0 = 2;

        for (int i1 = par4 - b0; i1 <= par4; ++i1)
        {
            int j1 = i1 - par4;
            this.func_150535_a(world, par2, i1, par3, par5 + 1 - j1, random6);
        }
    }
}