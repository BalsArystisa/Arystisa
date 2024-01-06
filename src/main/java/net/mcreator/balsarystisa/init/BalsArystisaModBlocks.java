
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.balsarystisa.block.RunnedStoneBricksBlock;
import net.mcreator.balsarystisa.block.ArystisSpawnerNoActivetedBlock;
import net.mcreator.balsarystisa.block.ArystisSpawnerBlock;
import net.mcreator.balsarystisa.block.ArystingLogBlock;
import net.mcreator.balsarystisa.block.ArystingLeavesBlock;
import net.mcreator.balsarystisa.block.AmberOreArystingLogBlock;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BalsArystisaMod.MODID);
	public static final RegistryObject<Block> RUNNED_STONE_BRICKS = REGISTRY.register("runned_stone_bricks", () -> new RunnedStoneBricksBlock());
	public static final RegistryObject<Block> ARYSTING_LOG = REGISTRY.register("arysting_log", () -> new ArystingLogBlock());
	public static final RegistryObject<Block> AMBER_ORE_ARYSTING_LOG = REGISTRY.register("amber_ore_arysting_log", () -> new AmberOreArystingLogBlock());
	public static final RegistryObject<Block> ARYSTING_LEAVES = REGISTRY.register("arysting_leaves", () -> new ArystingLeavesBlock());
	public static final RegistryObject<Block> ARYSTIS_SPAWNER = REGISTRY.register("arystis_spawner", () -> new ArystisSpawnerBlock());
	public static final RegistryObject<Block> ARYSTIS_SPAWNER_NO_ACTIVETED = REGISTRY.register("arystis_spawner_no_activeted", () -> new ArystisSpawnerNoActivetedBlock());
}
