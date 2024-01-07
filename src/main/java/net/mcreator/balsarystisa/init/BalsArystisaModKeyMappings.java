
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.balsarystisa.network.TriggerCyberwareGUIMessage;
import net.mcreator.balsarystisa.BalsArystisaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BalsArystisaModKeyMappings {
	public static final KeyMapping TRIGGER_CYBERWARE_GUI = new KeyMapping("key.bals_arystisa.trigger_cyberware_gui", GLFW.GLFW_KEY_KP_0, "key.categories.arystisia") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new TriggerCyberwareGUIMessage(0, 0));
				TriggerCyberwareGUIMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(TRIGGER_CYBERWARE_GUI);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				TRIGGER_CYBERWARE_GUI.consumeClick();
			}
		}
	}
}
