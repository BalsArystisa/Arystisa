
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
import net.mcreator.balsarystisa.client.gui.GUICyberwareGeneralScreen;
import net.mcreator.balsarystisa.client.gui.CombinateurScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BalsArystisaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BalsArystisaModMenus.GUI_CYBERWARE_GENERAL.get(), GUICyberwareGeneralScreen::new);
			MenuScreens.register(BalsArystisaModMenus.WORK_STATION_GUI.get(), WorkStationGUIScreen::new);
			MenuScreens.register(BalsArystisaModMenus.COMBINATEUR.get(), CombinateurScreen::new);
		});
	}
}
