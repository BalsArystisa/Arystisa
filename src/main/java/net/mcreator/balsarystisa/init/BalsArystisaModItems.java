
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.balsarystisa.item.HogiritSwordItem;
import net.mcreator.balsarystisa.item.HogiritShovelItem;
import net.mcreator.balsarystisa.item.HogiritPickaxeItem;
import net.mcreator.balsarystisa.item.HogiritIngotItem;
import net.mcreator.balsarystisa.item.HogiritHoeItem;
import net.mcreator.balsarystisa.item.HogiritAxeItem;
import net.mcreator.balsarystisa.item.HogiritArmorItem;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BalsArystisaMod.MODID);
	public static final RegistryObject<Item> RUNNED_STONE_BRICKS = block(BalsArystisaModBlocks.RUNNED_STONE_BRICKS);
	public static final RegistryObject<Item> ARYSTING_WOOD = block(BalsArystisaModBlocks.ARYSTING_WOOD);
	public static final RegistryObject<Item> ARYSTING_LOG = block(BalsArystisaModBlocks.ARYSTING_LOG);
	public static final RegistryObject<Item> AMBER_ORE_ARYSTING_LOG = block(BalsArystisaModBlocks.AMBER_ORE_ARYSTING_LOG);
	public static final RegistryObject<Item> ARYSTING_LEAVES = block(BalsArystisaModBlocks.ARYSTING_LEAVES);
	public static final RegistryObject<Item> ARYSTIS_SPAWNER = block(BalsArystisaModBlocks.ARYSTIS_SPAWNER);
	public static final RegistryObject<Item> ARYSTIS_SPAWNER_NO_ACTIVETED = block(BalsArystisaModBlocks.ARYSTIS_SPAWNER_NO_ACTIVETED);
	public static final RegistryObject<Item> ARYSTING_PLANKS = block(BalsArystisaModBlocks.ARYSTING_PLANKS);
	public static final RegistryObject<Item> ARYSTING_STAIRS = block(BalsArystisaModBlocks.ARYSTING_STAIRS);
	public static final RegistryObject<Item> ARYSTING_SLAB = block(BalsArystisaModBlocks.ARYSTING_SLAB);
	public static final RegistryObject<Item> ARYSTING_FENCE = block(BalsArystisaModBlocks.ARYSTING_FENCE);
	public static final RegistryObject<Item> ARYSTING_FENCE_GATE = block(BalsArystisaModBlocks.ARYSTING_FENCE_GATE);
	public static final RegistryObject<Item> ARYSTING_PRESSURE_PLATE = block(BalsArystisaModBlocks.ARYSTING_PRESSURE_PLATE);
	public static final RegistryObject<Item> ARYSTING_BUTTON = block(BalsArystisaModBlocks.ARYSTING_BUTTON);
	public static final RegistryObject<Item> HOGIRIT_ORE = block(BalsArystisaModBlocks.HOGIRIT_ORE);
	public static final RegistryObject<Item> HOGIRIT_BLOCK = block(BalsArystisaModBlocks.HOGIRIT_BLOCK);
	public static final RegistryObject<Item> SAND_WOOD_WOOD = block(BalsArystisaModBlocks.SAND_WOOD_WOOD);
	public static final RegistryObject<Item> SAND_WOOD_LOG = block(BalsArystisaModBlocks.SAND_WOOD_LOG);
	public static final RegistryObject<Item> SAND_WOOD_PLANKS = block(BalsArystisaModBlocks.SAND_WOOD_PLANKS);
	public static final RegistryObject<Item> SAND_WOOD_LEAVES = block(BalsArystisaModBlocks.SAND_WOOD_LEAVES);
	public static final RegistryObject<Item> SAND_WOOD_STAIRS = block(BalsArystisaModBlocks.SAND_WOOD_STAIRS);
	public static final RegistryObject<Item> SAND_WOOD_SLAB = block(BalsArystisaModBlocks.SAND_WOOD_SLAB);
	public static final RegistryObject<Item> SAND_WOOD_FENCE = block(BalsArystisaModBlocks.SAND_WOOD_FENCE);
	public static final RegistryObject<Item> SAND_WOOD_FENCE_GATE = block(BalsArystisaModBlocks.SAND_WOOD_FENCE_GATE);
	public static final RegistryObject<Item> SAND_WOOD_PRESSURE_PLATE = block(BalsArystisaModBlocks.SAND_WOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> SAND_WOOD_BUTTON = block(BalsArystisaModBlocks.SAND_WOOD_BUTTON);
	public static final RegistryObject<Item> HOGIRIT_AXE = REGISTRY.register("hogirit_axe", () -> new HogiritAxeItem());
	public static final RegistryObject<Item> HOGIRIT_PICKAXE = REGISTRY.register("hogirit_pickaxe", () -> new HogiritPickaxeItem());
	public static final RegistryObject<Item> HOGIRIT_SWORD = REGISTRY.register("hogirit_sword", () -> new HogiritSwordItem());
	public static final RegistryObject<Item> HOGIRIT_SHOVEL = REGISTRY.register("hogirit_shovel", () -> new HogiritShovelItem());
	public static final RegistryObject<Item> HOGIRIT_HOE = REGISTRY.register("hogirit_hoe", () -> new HogiritHoeItem());
	public static final RegistryObject<Item> HOGIRIT_INGOT = REGISTRY.register("hogirit_ingot", () -> new HogiritIngotItem());
	public static final RegistryObject<Item> HOGIRIT_ARMOR_HELMET = REGISTRY.register("hogirit_armor_helmet", () -> new HogiritArmorItem.Helmet());
	public static final RegistryObject<Item> HOGIRIT_ARMOR_CHESTPLATE = REGISTRY.register("hogirit_armor_chestplate", () -> new HogiritArmorItem.Chestplate());
	public static final RegistryObject<Item> HOGIRIT_ARMOR_LEGGINGS = REGISTRY.register("hogirit_armor_leggings", () -> new HogiritArmorItem.Leggings());
	public static final RegistryObject<Item> HOGIRIT_ARMOR_BOOTS = REGISTRY.register("hogirit_armor_boots", () -> new HogiritArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
