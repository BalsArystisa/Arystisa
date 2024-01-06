
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.balsarystisa.block.RunnedStoneBricksBlock;
import net.mcreator.balsarystisa.block.ArystingLogBlock;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BalsArystisaMod.MODID);
	public static final RegistryObject<Block> ARYSTING_LOG = REGISTRY.register("arysting_log", () -> new ArystingLogBlock());
	public static final RegistryObject<Block> RUNNED_STONE_BRICKS = REGISTRY.register("runned_stone_bricks", () -> new RunnedStoneBricksBlock());
}
