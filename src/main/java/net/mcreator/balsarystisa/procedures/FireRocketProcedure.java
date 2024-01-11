package net.mcreator.balsarystisa.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.balsarystisa.BalsArystisaMod;

public class FireRocketProcedure {
	public static void execute(LevelAccessor world) {
		BalsArystisaMod.queueServerWork(20, () -> {
		});
	}
}
