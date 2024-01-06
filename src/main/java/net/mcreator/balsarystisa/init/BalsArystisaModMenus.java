
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.balsarystisa.world.inventory.GUICyberwareGeneralMenu;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BalsArystisaMod.MODID);
	public static final RegistryObject<MenuType<GUICyberwareGeneralMenu>> GUI_CYBERWARE_GENERAL = REGISTRY.register("gui_cyberware_general", () -> IForgeMenuType.create(GUICyberwareGeneralMenu::new));
}
