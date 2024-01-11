package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.balsarystisa.init.BalsArystisaModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SoundboardRuleProcedProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level());
		}
	}

	public static boolean execute(LevelAccessor world) {
		return execute(null, world);
	}

	private static boolean execute(@Nullable Event event, LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(BalsArystisaModGameRules.DO_PLAYER_SOUNDBOARD)) {
			return true;
		}
		return false;
	}
}
