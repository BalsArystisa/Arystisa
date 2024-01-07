
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.balsarystisa.world.inventory.WorkStationGUIMenu;
import net.mcreator.balsarystisa.world.inventory.GUICyberwareGeneralMenu;
import net.mcreator.balsarystisa.world.inventory.ArystisaEmotesGUIMenu;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BalsArystisaMod.MODID);
	public static final RegistryObject<MenuType<GUICyberwareGeneralMenu>> GUI_CYBERWARE_GENERAL = REGISTRY.register("gui_cyberware_general", () -> IForgeMenuType.create(GUICyberwareGeneralMenu::new));
	public static final RegistryObject<MenuType<WorkStationGUIMenu>> WORK_STATION_GUI = REGISTRY.register("work_station_gui", () -> IForgeMenuType.create(WorkStationGUIMenu::new));
	public static final RegistryObject<MenuType<ArystisaEmotesGUIMenu>> ARYSTISA_GUI = REGISTRY.register("arystisa_gui", () -> IForgeMenuType.create(ArystisaEmotesGUIMenu::new));
}
