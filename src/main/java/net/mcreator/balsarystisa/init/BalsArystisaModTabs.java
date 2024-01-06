
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.balsarystisa.BalsArystisaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
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
				tabData.accept(BalsArystisaModBlocks.ARYSTING_PLANKS.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_STAIRS.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_SLAB.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_FENCE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_FENCE_GATE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_PRESSURE_PLATE.get().asItem());
				tabData.accept(BalsArystisaModBlocks.ARYSTING_BUTTON.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(BalsArystisaModBlocks.HOGIRIT_ORE.get().asItem());
			tabData.accept(BalsArystisaModBlocks.HOGIRIT_BLOCK.get().asItem());
			tabData.accept(BalsArystisaModBlocks.SAND_WOOD_WOOD.get().asItem());
			tabData.accept(BalsArystisaModBlocks.SAND_WOOD_LOG.get().asItem());
			tabData.accept(BalsArystisaModBlocks.SAND_WOOD_PLANKS.get().asItem());
			tabData.accept(BalsArystisaModBlocks.SAND_WOOD_STAIRS.get().asItem());
			tabData.accept(BalsArystisaModBlocks.SAND_WOOD_SLAB.get().asItem());
			tabData.accept(BalsArystisaModBlocks.SAND_WOOD_FENCE.get().asItem());
			tabData.accept(BalsArystisaModBlocks.SAND_WOOD_FENCE_GATE.get().asItem());
			tabData.accept(BalsArystisaModBlocks.SAND_WOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(BalsArystisaModBlocks.SAND_WOOD_BUTTON.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BalsArystisaModItems.HOGIRIT_SWORD.get());
			tabData.accept(BalsArystisaModItems.HOGIRIT_ARMOR_HELMET.get());
			tabData.accept(BalsArystisaModItems.HOGIRIT_ARMOR_CHESTPLATE.get());
			tabData.accept(BalsArystisaModItems.HOGIRIT_ARMOR_LEGGINGS.get());
			tabData.accept(BalsArystisaModItems.HOGIRIT_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(BalsArystisaModItems.HOGIRIT_INGOT.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(BalsArystisaModBlocks.SAND_WOOD_LEAVES.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BalsArystisaModItems.HOGIRIT_AXE.get());
			tabData.accept(BalsArystisaModItems.HOGIRIT_PICKAXE.get());
			tabData.accept(BalsArystisaModItems.HOGIRIT_SHOVEL.get());
			tabData.accept(BalsArystisaModItems.HOGIRIT_HOE.get());
		}
	}
}
