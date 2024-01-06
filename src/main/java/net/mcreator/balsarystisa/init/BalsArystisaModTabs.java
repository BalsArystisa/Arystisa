
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
				tabData.accept(BalsArystisaModBlocks.ARYSTING_WOOD.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_LOG.get().asItem());
				tabData.accept(BalsArystisaModBlocks.AMBER_ORE_ARYSTING_LOG.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_LEAVES.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTIS_SPAWNER.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTIS_SPAWNER_NO_ACTIVETED.get().asItem());
				tabData.accept(BalsArystisaModBlocks.HOGIRITE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_PLANKS.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_STAIRS.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_SLAB.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_FENCE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_FENCE_GATE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_PRESSURE_PLATE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_BUTTON.get().asItem());
			}).withSearchBar().build());
}
