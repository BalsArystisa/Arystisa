package net.mcreator.balsarystisa.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.balsarystisa.init.BalsArystisaModGameRules;

public class SoundboardRuleProcedProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(BalsArystisaModGameRules.DO_PLAYER_SOUNDBOARD) == true) {
			return true;
		}
		return false;
	}
}
