
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BalsArystisaMod.MODID);
	public static final RegistryObject<CreativeModeTab> ARYSTISA = REGISTRY.register("arystisa",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bals_arystisa.arystisa")).icon(() -> new ItemStack(BalsArystisaModBlocks.RUNNED_STONE_BRICKS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BalsArystisaModBlocks.RUNNED_STONE_BRICKS.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTIS_SPAWNER.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTIS_SPAWNER_NO_ACTIVETED.get().asItem());
				tabData.accept(BalsArystisaModBlocks.BLOCTUGSTIUM.get().asItem());
				tabData.accept(BalsArystisaModBlocks.NANO_BLOCK.get().asItem());
				tabData.accept(BalsArystisaModBlocks.IGNISIUM_ORE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.COBALTORE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.TUGSTIUMORE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.NANO_ORE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.BLACK_PHOSPHORUS_BLOCK.get().asItem());
				tabData.accept(BalsArystisaModBlocks.RED_PHOSPHORUS_BLOCK.get().asItem());
				tabData.accept(BalsArystisaModBlocks.FORMER_GRAVEL.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_LEAVES.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ENCHANT_LEAVES.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_WOOD.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_LOG.get().asItem());
				tabData.accept(BalsArystisaModBlocks.AMBER_ORE_ARYSTING_LOG.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_PLANKS.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_STAIRS.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_SLAB.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_FENCE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_FENCE_GATE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_PRESSURE_PLATE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_BUTTON.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ENCHANT_WOOD.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ENCHANT_LOG.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ENCHANT_PLANKS.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ENCHANT_STAIRS.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ENCHANT_SLAB.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ENCHANT_FENCE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ENCHANT_FENCE_GATE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ENCHANT_PRESSURE_PLATE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ENCHANT_BUTTON.get().asItem());
				tabData.accept(BalsArystisaModItems.IGNISIUM_INGOT.get());
				tabData.accept(BalsArystisaModItems.TUGSTIUM.get());
				tabData.accept(BalsArystisaModItems.NANO_INGOT.get());
				tabData.accept(BalsArystisaModItems.NANO_PLATE.get());
				tabData.accept(BalsArystisaModItems.COMPACT_NANO_INGOT.get());
				tabData.accept(BalsArystisaModItems.TUGSTIUM_ARMOR_ARMOR_HELMET.get());
				tabData.accept(BalsArystisaModItems.TUGSTIUM_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(BalsArystisaModItems.TUGSTIUM_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(BalsArystisaModItems.TUGSTIUM_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(BalsArystisaModItems.NANO_ARMOR_HELMET.get());
				tabData.accept(BalsArystisaModItems.NANO_ARMOR_CHESTPLATE.get());
				tabData.accept(BalsArystisaModItems.NANO_ARMOR_LEGGINGS.get());
				tabData.accept(BalsArystisaModItems.NANO_ARMOR_BOOTS.get());
				tabData.accept(BalsArystisaModItems.BAGUETTE.get());
				tabData.accept(BalsArystisaModItems.BAGUETTE_SWORD.get());
				tabData.accept(BalsArystisaModItems.TUGSTIUM_1_SWORD.get());
				tabData.accept(BalsArystisaModItems.NANO_SWORD.get());
				tabData.accept(BalsArystisaModItems.BAGUETTE_PICKAXE.get());
				tabData.accept(BalsArystisaModItems.TUGSTIUM_1_PICKAXE.get());
				tabData.accept(BalsArystisaModItems.NANO_PICKAXE.get());
				tabData.accept(BalsArystisaModItems.BAGUETTE_AXE.get());
				tabData.accept(BalsArystisaModItems.TUGSTIUM_1_AXE.get());
				tabData.accept(BalsArystisaModItems.NANO_AXE.get());
				tabData.accept(BalsArystisaModItems.BAGUETTE_SHOVEL.get());
				tabData.accept(BalsArystisaModItems.TUGSTIUM_1_SHOVEL.get());
				tabData.accept(BalsArystisaModItems.NANO_SHOVEL.get());
				tabData.accept(BalsArystisaModItems.BAGUETTE_HOE.get());
				tabData.accept(BalsArystisaModItems.TUGSTIUM_1_HOE.get());
				tabData.accept(BalsArystisaModItems.NANO_HOE.get());
				tabData.accept(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get());
				tabData.accept(BalsArystisaModItems.INVISIBLE_CAMOTIERS_2.get());
				tabData.accept(BalsArystisaModItems.INVISIBLE_CAMOTIERS_3.get());
				tabData.accept(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_1.get());
				tabData.accept(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_2.get());
				tabData.accept(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_3.get());
				tabData.accept(BalsArystisaModItems.SAP_BOTTLE.get());
				tabData.accept(BalsArystisaModItems.AMBER.get());
				tabData.accept(BalsArystisaModItems.DIAMOND_FLINT.get());
				tabData.accept(BalsArystisaModItems.ARYSTISA_WORLD.get());
				tabData.accept(BalsArystisaModItems.NANO_CRAFTING_HAMMER.get());
				tabData.accept(BalsArystisaModItems.ARYSTING_COW_SPAWN_EGG.get());
				tabData.accept(BalsArystisaModItems.BLASONDUBATAILLONDEXPLORATION.get());
				tabData.accept(BalsArystisaModBlocks.IGNISIUM_BLOCK.get().asItem());
				tabData.accept(BalsArystisaModBlocks.NANO_CRAFTING_TABLE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.WORK_STATION.get().asItem());
				tabData.accept(BalsArystisaModBlocks.IGNISIUM_CRAFTING_TABLE.get().asItem());
			}).withSearchBar().build());
}
