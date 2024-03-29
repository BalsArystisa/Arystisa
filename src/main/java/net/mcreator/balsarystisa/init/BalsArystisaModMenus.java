
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
import net.mcreator.balsarystisa.world.inventory.SoundBoardGUIMenu;
import net.mcreator.balsarystisa.world.inventory.NanoCraftingTableGUIMenu;
import net.mcreator.balsarystisa.world.inventory.MedaillonGUIMenu;
import net.mcreator.balsarystisa.world.inventory.IgnisiumSmelterGUIMenu;
import net.mcreator.balsarystisa.world.inventory.IgnisiumCraftingTableGUIMenu;
import net.mcreator.balsarystisa.world.inventory.GUICyberwareGeneralMenu;
import net.mcreator.balsarystisa.world.inventory.ArystisiaGUIMenu;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BalsArystisaMod.MODID);
	public static final RegistryObject<MenuType<GUICyberwareGeneralMenu>> GUI_CYBERWARE_GENERAL = REGISTRY.register("gui_cyberware_general", () -> IForgeMenuType.create(GUICyberwareGeneralMenu::new));
	public static final RegistryObject<MenuType<WorkStationGUIMenu>> WORK_STATION_GUI = REGISTRY.register("work_station_gui", () -> IForgeMenuType.create(WorkStationGUIMenu::new));
	public static final RegistryObject<MenuType<ArystisiaGUIMenu>> ARYSTISIA_GUI = REGISTRY.register("arystisia_gui", () -> IForgeMenuType.create(ArystisiaGUIMenu::new));
	public static final RegistryObject<MenuType<NanoCraftingTableGUIMenu>> NANO_CRAFTING_TABLE_GUI = REGISTRY.register("nano_crafting_table_gui", () -> IForgeMenuType.create(NanoCraftingTableGUIMenu::new));
	public static final RegistryObject<MenuType<IgnisiumCraftingTableGUIMenu>> IGNISIUM_CRAFTING_TABLE_GUI = REGISTRY.register("ignisium_crafting_table_gui", () -> IForgeMenuType.create(IgnisiumCraftingTableGUIMenu::new));
	public static final RegistryObject<MenuType<MedaillonGUIMenu>> MEDAILLON_GUI = REGISTRY.register("medaillon_gui", () -> IForgeMenuType.create(MedaillonGUIMenu::new));
	public static final RegistryObject<MenuType<SoundBoardGUIMenu>> SOUND_BOARD_GUI = REGISTRY.register("sound_board_gui", () -> IForgeMenuType.create(SoundBoardGUIMenu::new));
	public static final RegistryObject<MenuType<IgnisiumSmelterGUIMenu>> IGNISIUM_SMELTER_GUI = REGISTRY.register("ignisium_smelter_gui", () -> IForgeMenuType.create(IgnisiumSmelterGUIMenu::new));
}
