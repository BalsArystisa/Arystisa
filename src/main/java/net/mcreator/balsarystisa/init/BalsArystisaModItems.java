
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
	public static final RegistryObject<Item> HOGIRITE = block(BalsArystisaModBlocks.HOGIRITE);
	public static final RegistryObject<Item> ARYSTING_PLANKS = block(BalsArystisaModBlocks.ARYSTING_PLANKS);
	public static final RegistryObject<Item> ARYSTING_STAIRS = block(BalsArystisaModBlocks.ARYSTING_STAIRS);
	public static final RegistryObject<Item> ARYSTING_SLAB = block(BalsArystisaModBlocks.ARYSTING_SLAB);
	public static final RegistryObject<Item> ARYSTING_FENCE = block(BalsArystisaModBlocks.ARYSTING_FENCE);
	public static final RegistryObject<Item> ARYSTING_FENCE_GATE = block(BalsArystisaModBlocks.ARYSTING_FENCE_GATE);
	public static final RegistryObject<Item> ARYSTING_PRESSURE_PLATE = block(BalsArystisaModBlocks.ARYSTING_PRESSURE_PLATE);
	public static final RegistryObject<Item> ARYSTING_BUTTON = block(BalsArystisaModBlocks.ARYSTING_BUTTON);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
