
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.balsarystisa.item.Tugstium_1SwordItem;
import net.mcreator.balsarystisa.item.Tugstium_1ShovelItem;
import net.mcreator.balsarystisa.item.Tugstium_1PickaxeItem;
import net.mcreator.balsarystisa.item.Tugstium_1HoeItem;
import net.mcreator.balsarystisa.item.Tugstium_1AxeItem;
import net.mcreator.balsarystisa.item.TugstiumItem;
import net.mcreator.balsarystisa.item.TugstiumArmorArmorItem;
import net.mcreator.balsarystisa.item.SapBottleItem;
import net.mcreator.balsarystisa.item.InvisibleCamotiers3Item;
import net.mcreator.balsarystisa.item.InvisibleCamotiers2Item;
import net.mcreator.balsarystisa.item.InvisibleCamoCyberwareItem;
import net.mcreator.balsarystisa.item.IgnisiumIngotItem;
import net.mcreator.balsarystisa.item.HogiritSwordItem;
import net.mcreator.balsarystisa.item.HogiritShovelItem;
import net.mcreator.balsarystisa.item.HogiritPickaxeItem;
import net.mcreator.balsarystisa.item.HogiritIngotItem;
import net.mcreator.balsarystisa.item.HogiritHoeItem;
import net.mcreator.balsarystisa.item.HogiritAxeItem;
import net.mcreator.balsarystisa.item.HogiritArmorItem;
import net.mcreator.balsarystisa.item.DiamondFlintItem;
import net.mcreator.balsarystisa.item.BasondubataillondexplorationItem;
import net.mcreator.balsarystisa.item.BaguetteSwordItem;
import net.mcreator.balsarystisa.item.BaguetteShovelItem;
import net.mcreator.balsarystisa.item.BaguettePickaxeItem;
import net.mcreator.balsarystisa.item.BaguetteItem;
import net.mcreator.balsarystisa.item.BaguetteHoeItem;
import net.mcreator.balsarystisa.item.BaguetteAxeItem;
import net.mcreator.balsarystisa.item.ArystisaWorldItem;
import net.mcreator.balsarystisa.item.AmberItem;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BalsArystisaMod.MODID);
	public static final RegistryObject<Item> RUNNED_STONE_BRICKS = block(BalsArystisaModBlocks.RUNNED_STONE_BRICKS);
	public static final RegistryObject<Item> ARYSTING_WOOD = block(BalsArystisaModBlocks.ARYSTING_WOOD);
	public static final RegistryObject<Item> ARYSTING_LOG = block(BalsArystisaModBlocks.ARYSTING_LOG);
	public static final RegistryObject<Item> AMBER_ORE_ARYSTING_LOG = block(BalsArystisaModBlocks.AMBER_ORE_ARYSTING_LOG);
	public static final RegistryObject<Item> FORMER_GRAVEL = block(BalsArystisaModBlocks.FORMER_GRAVEL);
	public static final RegistryObject<Item> ARYSTING_LEAVES = block(BalsArystisaModBlocks.ARYSTING_LEAVES);
	public static final RegistryObject<Item> ARYSTIS_SPAWNER = block(BalsArystisaModBlocks.ARYSTIS_SPAWNER);
	public static final RegistryObject<Item> ARYSTIS_SPAWNER_NO_ACTIVETED = block(BalsArystisaModBlocks.ARYSTIS_SPAWNER_NO_ACTIVETED);
	public static final RegistryObject<Item> ENCHANT_LEAVES = block(BalsArystisaModBlocks.ENCHANT_LEAVES);
	public static final RegistryObject<Item> BAGUETTE = REGISTRY.register("baguette", () -> new BaguetteItem());
	public static final RegistryObject<Item> ENCHANT_WOOD = block(BalsArystisaModBlocks.ENCHANT_WOOD);
	public static final RegistryObject<Item> ARYSTING_PLANKS = block(BalsArystisaModBlocks.ARYSTING_PLANKS);
	public static final RegistryObject<Item> ARYSTING_STAIRS = block(BalsArystisaModBlocks.ARYSTING_STAIRS);
	public static final RegistryObject<Item> ARYSTING_SLAB = block(BalsArystisaModBlocks.ARYSTING_SLAB);
	public static final RegistryObject<Item> ENCHANT_LOG = block(BalsArystisaModBlocks.ENCHANT_LOG);
	public static final RegistryObject<Item> ARYSTING_FENCE = block(BalsArystisaModBlocks.ARYSTING_FENCE);
	public static final RegistryObject<Item> ARYSTING_FENCE_GATE = block(BalsArystisaModBlocks.ARYSTING_FENCE_GATE);
	public static final RegistryObject<Item> ARYSTING_PRESSURE_PLATE = block(BalsArystisaModBlocks.ARYSTING_PRESSURE_PLATE);
	public static final RegistryObject<Item> ARYSTING_BUTTON = block(BalsArystisaModBlocks.ARYSTING_BUTTON);
	public static final RegistryObject<Item> HOGIRIT_ORE = block(BalsArystisaModBlocks.HOGIRIT_ORE);
	public static final RegistryObject<Item> HOGIRIT_BLOCK = block(BalsArystisaModBlocks.HOGIRIT_BLOCK);
	public static final RegistryObject<Item> INVISIBLE_CAMOTIERS_2 = REGISTRY.register("invisible_camotiers_2", () -> new InvisibleCamotiers2Item());
	public static final RegistryObject<Item> INVISIBLE_CAMOTIERS_3 = REGISTRY.register("invisible_camotiers_3", () -> new InvisibleCamotiers3Item());
	public static final RegistryObject<Item> TUGSTIUM_ARMOR_ARMOR_HELMET = REGISTRY.register("tugstium_armor_armor_helmet", () -> new TugstiumArmorArmorItem.Helmet());
	public static final RegistryObject<Item> TUGSTIUM_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("tugstium_armor_armor_chestplate", () -> new TugstiumArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> TUGSTIUM_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("tugstium_armor_armor_leggings", () -> new TugstiumArmorArmorItem.Leggings());
	public static final RegistryObject<Item> TUGSTIUM_ARMOR_ARMOR_BOOTS = REGISTRY.register("tugstium_armor_armor_boots", () -> new TugstiumArmorArmorItem.Boots());
	public static final RegistryObject<Item> HOGIRIT_AXE = REGISTRY.register("hogirit_axe", () -> new HogiritAxeItem());
	public static final RegistryObject<Item> TUGSTIUM_1_PICKAXE = REGISTRY.register("tugstium_1_pickaxe", () -> new Tugstium_1PickaxeItem());
	public static final RegistryObject<Item> HOGIRIT_PICKAXE = REGISTRY.register("hogirit_pickaxe", () -> new HogiritPickaxeItem());
	public static final RegistryObject<Item> HOGIRIT_SWORD = REGISTRY.register("hogirit_sword", () -> new HogiritSwordItem());
	public static final RegistryObject<Item> HOGIRIT_SHOVEL = REGISTRY.register("hogirit_shovel", () -> new HogiritShovelItem());
	public static final RegistryObject<Item> HOGIRIT_HOE = REGISTRY.register("hogirit_hoe", () -> new HogiritHoeItem());
	public static final RegistryObject<Item> HOGIRIT_INGOT = REGISTRY.register("hogirit_ingot", () -> new HogiritIngotItem());
	public static final RegistryObject<Item> DIAMOND_FLINT = REGISTRY.register("diamond_flint", () -> new DiamondFlintItem());
	public static final RegistryObject<Item> HOGIRIT_ARMOR_HELMET = REGISTRY.register("hogirit_armor_helmet", () -> new HogiritArmorItem.Helmet());
	public static final RegistryObject<Item> HOGIRIT_ARMOR_CHESTPLATE = REGISTRY.register("hogirit_armor_chestplate", () -> new HogiritArmorItem.Chestplate());
	public static final RegistryObject<Item> HOGIRIT_ARMOR_LEGGINGS = REGISTRY.register("hogirit_armor_leggings", () -> new HogiritArmorItem.Leggings());
	public static final RegistryObject<Item> HOGIRIT_ARMOR_BOOTS = REGISTRY.register("hogirit_armor_boots", () -> new HogiritArmorItem.Boots());
	public static final RegistryObject<Item> ARYSTISA_WORLD = REGISTRY.register("arystisa_world", () -> new ArystisaWorldItem());
	public static final RegistryObject<Item> SAP_BOTTLE = REGISTRY.register("sap_bottle", () -> new SapBottleItem());
	public static final RegistryObject<Item> INVISIBLE_CAMO_CYBERWARE = REGISTRY.register("invisible_camo_cyberware", () -> new InvisibleCamoCyberwareItem());
	public static final RegistryObject<Item> BAGUETTE_SWORD = REGISTRY.register("baguette_sword", () -> new BaguetteSwordItem());
	public static final RegistryObject<Item> TUGSTIUM_1_AXE = REGISTRY.register("tugstium_1_axe", () -> new Tugstium_1AxeItem());
	public static final RegistryObject<Item> TUGSTIUM_1_SHOVEL = REGISTRY.register("tugstium_1_shovel", () -> new Tugstium_1ShovelItem());
	public static final RegistryObject<Item> AMBER = REGISTRY.register("amber", () -> new AmberItem());
	public static final RegistryObject<Item> TUGSTIUM_1_HOE = REGISTRY.register("tugstium_1_hoe", () -> new Tugstium_1HoeItem());
	public static final RegistryObject<Item> TUGSTIUM_1_SWORD = REGISTRY.register("tugstium_1_sword", () -> new Tugstium_1SwordItem());
	public static final RegistryObject<Item> ARYSTING_COW_SPAWN_EGG = REGISTRY.register("arysting_cow_spawn_egg", () -> new ForgeSpawnEggItem(BalsArystisaModEntities.ARYSTING_COW, -16764109, -16737895, new Item.Properties()));
	public static final RegistryObject<Item> WORK_STATION = block(BalsArystisaModBlocks.WORK_STATION);
	public static final RegistryObject<Item> TUGSTIUM = REGISTRY.register("tugstium", () -> new TugstiumItem());
	public static final RegistryObject<Item> TUGSTIUMORE = block(BalsArystisaModBlocks.TUGSTIUMORE);
	public static final RegistryObject<Item> BLOCTUGSTIUM = block(BalsArystisaModBlocks.BLOCTUGSTIUM);
	public static final RegistryObject<Item> BAGUETTE_AXE = REGISTRY.register("baguette_axe", () -> new BaguetteAxeItem());
	public static final RegistryObject<Item> BAGUETTE_PICKAXE = REGISTRY.register("baguette_pickaxe", () -> new BaguettePickaxeItem());
	public static final RegistryObject<Item> BAGUETTE_SHOVEL = REGISTRY.register("baguette_shovel", () -> new BaguetteShovelItem());
	public static final RegistryObject<Item> BAGUETTE_HOE = REGISTRY.register("baguette_hoe", () -> new BaguetteHoeItem());
	public static final RegistryObject<Item> COBALTORE = block(BalsArystisaModBlocks.COBALTORE);
	public static final RegistryObject<Item> IGNISIUM_ORE = block(BalsArystisaModBlocks.IGNISIUM_ORE);
	public static final RegistryObject<Item> BLASONDUBATAILLONDEXPLORATION = REGISTRY.register("blasondubataillondexploration", () -> new BasondubataillondexplorationItem());
	public static final RegistryObject<Item> IGNISIUM_INGOT = REGISTRY.register("ignisium_ingot", () -> new IgnisiumIngotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
