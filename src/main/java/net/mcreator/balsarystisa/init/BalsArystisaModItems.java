
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

import net.mcreator.balsarystisa.item.HogiriteingotItem;
import net.mcreator.balsarystisa.item.HogiritearmorArmorItem;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BalsArystisaMod.MODID);
	public static final RegistryObject<Item> RUNNED_STONE_BRICKS = block(BalsArystisaModBlocks.RUNNED_STONE_BRICKS);
	public static final RegistryObject<Item> ARYSTING_LOG = block(BalsArystisaModBlocks.ARYSTING_LOG);
	public static final RegistryObject<Item> AMBER_ORE_ARYSTING_LOG = block(BalsArystisaModBlocks.AMBER_ORE_ARYSTING_LOG);
	public static final RegistryObject<Item> ARYSTING_LEAVES = block(BalsArystisaModBlocks.ARYSTING_LEAVES);
	public static final RegistryObject<Item> ARYSTIS_SPAWNER = block(BalsArystisaModBlocks.ARYSTIS_SPAWNER);
	public static final RegistryObject<Item> ARYSTIS_SPAWNER_NO_ACTIVETED = block(BalsArystisaModBlocks.ARYSTIS_SPAWNER_NO_ACTIVETED);
	public static final RegistryObject<Item> HOGIRITE = block(BalsArystisaModBlocks.HOGIRITE);
	public static final RegistryObject<Item> HOGIRITEINGOT = REGISTRY.register("hogiriteingot", () -> new HogiriteingotItem());
	public static final RegistryObject<Item> HOGIRITEARMOR_ARMOR_HELMET = REGISTRY.register("hogiritearmor_armor_helmet", () -> new HogiritearmorArmorItem.Helmet());
	public static final RegistryObject<Item> HOGIRITEARMOR_ARMOR_CHESTPLATE = REGISTRY.register("hogiritearmor_armor_chestplate", () -> new HogiritearmorArmorItem.Chestplate());
	public static final RegistryObject<Item> HOGIRITEARMOR_ARMOR_LEGGINGS = REGISTRY.register("hogiritearmor_armor_leggings", () -> new HogiritearmorArmorItem.Leggings());
	public static final RegistryObject<Item> HOGIRITEARMOR_ARMOR_BOOTS = REGISTRY.register("hogiritearmor_armor_boots", () -> new HogiritearmorArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
