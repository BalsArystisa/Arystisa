
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.balsarystisa.client.gui.WorkStationGUIScreen;
import net.mcreator.balsarystisa.client.gui.SoundBoardGUIScreen;
import net.mcreator.balsarystisa.client.gui.NanoCraftingTableGUIScreen;
import net.mcreator.balsarystisa.client.gui.MedaillonGUIScreen;
import net.mcreator.balsarystisa.client.gui.IgnisiumSmelterGUIScreen;
import net.mcreator.balsarystisa.client.gui.IgnisiumCraftingTableGUIScreen;
import net.mcreator.balsarystisa.client.gui.GUICyberwareGeneralScreen;
import net.mcreator.balsarystisa.client.gui.ArystisiaGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BalsArystisaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BalsArystisaModMenus.GUI_CYBERWARE_GENERAL.get(), GUICyberwareGeneralScreen::new);
			MenuScreens.register(BalsArystisaModMenus.WORK_STATION_GUI.get(), WorkStationGUIScreen::new);
			MenuScreens.register(BalsArystisaModMenus.ARYSTISIA_GUI.get(), ArystisiaGUIScreen::new);
			MenuScreens.register(BalsArystisaModMenus.NANO_CRAFTING_TABLE_GUI.get(), NanoCraftingTableGUIScreen::new);
			MenuScreens.register(BalsArystisaModMenus.IGNISIUM_CRAFTING_TABLE_GUI.get(), IgnisiumCraftingTableGUIScreen::new);
			MenuScreens.register(BalsArystisaModMenus.MEDAILLON_GUI.get(), MedaillonGUIScreen::new);
			MenuScreens.register(BalsArystisaModMenus.SOUND_BOARD_GUI.get(), SoundBoardGUIScreen::new);
			MenuScreens.register(BalsArystisaModMenus.IGNISIUM_SMELTER_GUI.get(), IgnisiumSmelterGUIScreen::new);
		});
	}
}
