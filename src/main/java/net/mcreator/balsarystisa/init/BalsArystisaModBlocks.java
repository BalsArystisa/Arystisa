
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.balsarystisa.block.WorkStationBlock;
import net.mcreator.balsarystisa.block.TugstiumoreBlock;
import net.mcreator.balsarystisa.block.RunnedStoneBricksBlock;
import net.mcreator.balsarystisa.block.HogiritOreBlock;
import net.mcreator.balsarystisa.block.HogiritBlockBlock;
import net.mcreator.balsarystisa.block.FormerGravelBlock;
import net.mcreator.balsarystisa.block.EnchantWoodBlock;
import net.mcreator.balsarystisa.block.EnchantLogBlock;
import net.mcreator.balsarystisa.block.EnchantLeavesBlock;
import net.mcreator.balsarystisa.block.CobaltoreBlock;
import net.mcreator.balsarystisa.block.BloctugstiumBlock;
import net.mcreator.balsarystisa.block.ArystisaWorldPortalBlock;
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
	public static final RegistryObject<Block> ARYSTIS_SPAWNER = REGISTRY.register("arystis_spawner", () -> new ArystisSpawnerBlock());
	public static final RegistryObject<Block> ARYSTIS_SPAWNER_NO_ACTIVETED = REGISTRY.register("arystis_spawner_no_activeted", () -> new ArystisSpawnerNoActivetedBlock());
	public static final RegistryObject<Block> FORMER_GRAVEL = REGISTRY.register("former_gravel", () -> new FormerGravelBlock());
	public static final RegistryObject<Block> HOGIRIT_ORE = REGISTRY.register("hogirit_ore", () -> new HogiritOreBlock());
	public static final RegistryObject<Block> HOGIRIT_BLOCK = REGISTRY.register("hogirit_block", () -> new HogiritBlockBlock());
	public static final RegistryObject<Block> ARYSTING_LEAVES = REGISTRY.register("arysting_leaves", () -> new ArystingLeavesBlock());
	public static final RegistryObject<Block> ARYSTING_WOOD = REGISTRY.register("arysting_wood", () -> new ArystingWoodBlock());
	public static final RegistryObject<Block> ENCHANT_LEAVES = REGISTRY.register("enchant_leaves", () -> new EnchantLeavesBlock());
	public static final RegistryObject<Block> ARYSTING_LOG = REGISTRY.register("arysting_log", () -> new ArystingLogBlock());
	public static final RegistryObject<Block> AMBER_ORE_ARYSTING_LOG = REGISTRY.register("amber_ore_arysting_log", () -> new AmberOreArystingLogBlock());
	public static final RegistryObject<Block> ENCHANT_WOOD = REGISTRY.register("enchant_wood", () -> new EnchantWoodBlock());
	public static final RegistryObject<Block> ARYSTING_PLANKS = REGISTRY.register("arysting_planks", () -> new ArystingPlanksBlock());
	public static final RegistryObject<Block> ARYSTING_STAIRS = REGISTRY.register("arysting_stairs", () -> new ArystingStairsBlock());
	public static final RegistryObject<Block> ARYSTING_SLAB = REGISTRY.register("arysting_slab", () -> new ArystingSlabBlock());
	public static final RegistryObject<Block> ENCHANT_LOG = REGISTRY.register("enchant_log", () -> new EnchantLogBlock());
	public static final RegistryObject<Block> ARYSTING_FENCE = REGISTRY.register("arysting_fence", () -> new ArystingFenceBlock());
	public static final RegistryObject<Block> ARYSTING_FENCE_GATE = REGISTRY.register("arysting_fence_gate", () -> new ArystingFenceGateBlock());
	public static final RegistryObject<Block> ARYSTING_PRESSURE_PLATE = REGISTRY.register("arysting_pressure_plate", () -> new ArystingPressurePlateBlock());
	public static final RegistryObject<Block> ARYSTING_BUTTON = REGISTRY.register("arysting_button", () -> new ArystingButtonBlock());
	public static final RegistryObject<Block> ARYSTISA_WORLD_PORTAL = REGISTRY.register("arystisa_world_portal", () -> new ArystisaWorldPortalBlock());
	public static final RegistryObject<Block> WORK_STATION = REGISTRY.register("work_station", () -> new WorkStationBlock());
	public static final RegistryObject<Block> TUGSTIUMORE = REGISTRY.register("tugstiumore", () -> new TugstiumoreBlock());
	public static final RegistryObject<Block> BLOCTUGSTIUM = REGISTRY.register("bloctugstium", () -> new BloctugstiumBlock());
	public static final RegistryObject<Block> COBALTORE = REGISTRY.register("cobaltore", () -> new CobaltoreBlock());
}
