
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
				tabData.accept(BalsArystisaModBlocks.FORMER_GRAVEL.get().asItem());
				tabData.accept(BalsArystisaModBlocks.HOGIRIT_ORE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.HOGIRIT_BLOCK.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_LEAVES.get().asItem());
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
				tabData.accept(BalsArystisaModItems.BAGUETTE.get());
				tabData.accept(BalsArystisaModItems.HOGIRIT_SWORD.get());
				tabData.accept(BalsArystisaModItems.HOGIRIT_PICKAXE.get());
				tabData.accept(BalsArystisaModItems.HOGIRIT_AXE.get());
				tabData.accept(BalsArystisaModItems.HOGIRIT_SHOVEL.get());
				tabData.accept(BalsArystisaModItems.HOGIRIT_HOE.get());
				tabData.accept(BalsArystisaModItems.HOGIRIT_ARMOR_HELMET.get());
				tabData.accept(BalsArystisaModItems.HOGIRIT_ARMOR_CHESTPLATE.get());
				tabData.accept(BalsArystisaModItems.HOGIRIT_ARMOR_LEGGINGS.get());
				tabData.accept(BalsArystisaModItems.HOGIRIT_ARMOR_BOOTS.get());
				tabData.accept(BalsArystisaModItems.HOGIRIT_INGOT.get());
				tabData.accept(BalsArystisaModItems.DIAMOND_FLINT.get());
				tabData.accept(BalsArystisaModItems.ARYSTISA_WORLD.get());
				tabData.accept(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get());
				tabData.accept(BalsArystisaModItems.SAP_BOTTLE.get());
				tabData.accept(BalsArystisaModItems.BAGUETTE_SWORD.get());
				tabData.accept(BalsArystisaModItems.AMBER.get());
				tabData.accept(BalsArystisaModBlocks.WORK_STATION.get().asItem());
				tabData.accept(BalsArystisaModItems.ARYSTING_COW_SPAWN_EGG.get());
				tabData.accept(BalsArystisaModItems.TUGSTIUM.get());
				tabData.accept(BalsArystisaModBlocks.TUGSTIUMORE.get().asItem());
			}).withSearchBar().build());
}
