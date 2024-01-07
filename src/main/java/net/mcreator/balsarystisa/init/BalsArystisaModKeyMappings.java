
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
import net.mcreator.balsarystisa.network.SelectionUseMessage;
import net.mcreator.balsarystisa.network.OpenArystisaEmotesKeyBindMessage;
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
	public static final KeyMapping SELECTION_USE = new KeyMapping("key.bals_arystisa.selection_use", GLFW.GLFW_KEY_KP_2, "key.categories.arystisia") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SelectionUseMessage(0, 0));
				SelectionUseMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_ARYSTISA_EMOTES_KEY_BIND = new KeyMapping("key.bals_arystisa.open_arystisa_emotes_key_bind", GLFW.GLFW_KEY_8, "key.categories.arystisa") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new OpenArystisaEmotesKeyBindMessage(0, 0));
				OpenArystisaEmotesKeyBindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(TRIGGER_CYBERWARE_GUI);
		event.register(SELECTION_USE);
		event.register(OPEN_ARYSTISA_EMOTES_KEY_BIND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				TRIGGER_CYBERWARE_GUI.consumeClick();
				SELECTION_USE.consumeClick();
				OPEN_ARYSTISA_EMOTES_KEY_BIND.consumeClick();
			}
		}
	}
}
