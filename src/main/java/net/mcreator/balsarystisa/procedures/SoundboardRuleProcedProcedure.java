package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SoundboardRuleProcedProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(BalsArystisaModGameRules.DO_PLAYER_SOUNDBOARD) == true) {
			return true;
		}
		return false;
	}
}
