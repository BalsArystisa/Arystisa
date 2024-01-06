
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.balsarystisa.block.Sand_woodWoodBlock;
import net.mcreator.balsarystisa.block.Sand_woodStairsBlock;
import net.mcreator.balsarystisa.block.Sand_woodSlabBlock;
import net.mcreator.balsarystisa.block.Sand_woodPressurePlateBlock;
import net.mcreator.balsarystisa.block.Sand_woodPlanksBlock;
import net.mcreator.balsarystisa.block.Sand_woodLogBlock;
import net.mcreator.balsarystisa.block.Sand_woodLeavesBlock;
import net.mcreator.balsarystisa.block.Sand_woodFenceGateBlock;
import net.mcreator.balsarystisa.block.Sand_woodFenceBlock;
import net.mcreator.balsarystisa.block.Sand_woodButtonBlock;
import net.mcreator.balsarystisa.block.RunnedStoneBricksBlock;
import net.mcreator.balsarystisa.block.HogiritOreBlock;
import net.mcreator.balsarystisa.block.HogiritBlockBlock;
import net.mcreator.balsarystisa.block.ArystisSpawnerNoActivetedBlock;
import net.mcreator.balsarystisa.block.ArystisSpawnerBlock;
import net.mcreator.balsarystisa.block.ArystingWoodBlock;
import net.mcreator.balsarystisa.block.ArystingStairsBlock;
import net.mcreator.balsarystisa.block.ArystingSlabBlock;
import net.mcreator.balsarystisa.block.ArystingPressurePlateBlock;
import net.mcreator.balsarystisa.block.ArystingPlanksBlock;
import net.mcreator.balsarystisa.block.ArystingLogBlock;
import net.mcreator.balsarystisa.block.ArystingLeavesBlock;
import net.mcreator.balsarystisa.block.ArystingFenceGateBlock;
import net.mcreator.balsarystisa.block.ArystingFenceBlock;
import net.mcreator.balsarystisa.block.ArystingButtonBlock;
import net.mcreator.balsarystisa.block.AmberOreArystingLogBlock;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BalsArystisaMod.MODID);
	public static final RegistryObject<Block> RUNNED_STONE_BRICKS = REGISTRY.register("runned_stone_bricks", () -> new RunnedStoneBricksBlock());
	public static final RegistryObject<Block> ARYSTING_WOOD = REGISTRY.register("arysting_wood", () -> new ArystingWoodBlock());
	public static final RegistryObject<Block> ARYSTING_LOG = REGISTRY.register("arysting_log", () -> new ArystingLogBlock());
	public static final RegistryObject<Block> AMBER_ORE_ARYSTING_LOG = REGISTRY.register("amber_ore_arysting_log", () -> new AmberOreArystingLogBlock());
	public static final RegistryObject<Block> ARYSTING_LEAVES = REGISTRY.register("arysting_leaves", () -> new ArystingLeavesBlock());
	public static final RegistryObject<Block> ARYSTIS_SPAWNER = REGISTRY.register("arystis_spawner", () -> new ArystisSpawnerBlock());
	public static final RegistryObject<Block> ARYSTIS_SPAWNER_NO_ACTIVETED = REGISTRY.register("arystis_spawner_no_activeted", () -> new ArystisSpawnerNoActivetedBlock());
	public static final RegistryObject<Block> ARYSTING_PLANKS = REGISTRY.register("arysting_planks", () -> new ArystingPlanksBlock());
	public static final RegistryObject<Block> ARYSTING_STAIRS = REGISTRY.register("arysting_stairs", () -> new ArystingStairsBlock());
	public static final RegistryObject<Block> ARYSTING_SLAB = REGISTRY.register("arysting_slab", () -> new ArystingSlabBlock());
	public static final RegistryObject<Block> ARYSTING_FENCE = REGISTRY.register("arysting_fence", () -> new ArystingFenceBlock());
	public static final RegistryObject<Block> ARYSTING_FENCE_GATE = REGISTRY.register("arysting_fence_gate", () -> new ArystingFenceGateBlock());
	public static final RegistryObject<Block> ARYSTING_PRESSURE_PLATE = REGISTRY.register("arysting_pressure_plate", () -> new ArystingPressurePlateBlock());
	public static final RegistryObject<Block> ARYSTING_BUTTON = REGISTRY.register("arysting_button", () -> new ArystingButtonBlock());
	public static final RegistryObject<Block> HOGIRIT_ORE = REGISTRY.register("hogirit_ore", () -> new HogiritOreBlock());
	public static final RegistryObject<Block> HOGIRIT_BLOCK = REGISTRY.register("hogirit_block", () -> new HogiritBlockBlock());
	public static final RegistryObject<Block> SAND_WOOD_WOOD = REGISTRY.register("sand_wood_wood", () -> new Sand_woodWoodBlock());
	public static final RegistryObject<Block> SAND_WOOD_LOG = REGISTRY.register("sand_wood_log", () -> new Sand_woodLogBlock());
	public static final RegistryObject<Block> SAND_WOOD_PLANKS = REGISTRY.register("sand_wood_planks", () -> new Sand_woodPlanksBlock());
	public static final RegistryObject<Block> SAND_WOOD_LEAVES = REGISTRY.register("sand_wood_leaves", () -> new Sand_woodLeavesBlock());
	public static final RegistryObject<Block> SAND_WOOD_STAIRS = REGISTRY.register("sand_wood_stairs", () -> new Sand_woodStairsBlock());
	public static final RegistryObject<Block> SAND_WOOD_SLAB = REGISTRY.register("sand_wood_slab", () -> new Sand_woodSlabBlock());
	public static final RegistryObject<Block> SAND_WOOD_FENCE = REGISTRY.register("sand_wood_fence", () -> new Sand_woodFenceBlock());
	public static final RegistryObject<Block> SAND_WOOD_FENCE_GATE = REGISTRY.register("sand_wood_fence_gate", () -> new Sand_woodFenceGateBlock());
	public static final RegistryObject<Block> SAND_WOOD_PRESSURE_PLATE = REGISTRY.register("sand_wood_pressure_plate", () -> new Sand_woodPressurePlateBlock());
	public static final RegistryObject<Block> SAND_WOOD_BUTTON = REGISTRY.register("sand_wood_button", () -> new Sand_woodButtonBlock());
}
