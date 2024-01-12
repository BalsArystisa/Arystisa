package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireRocketProcedure {
	public static void execute(LevelAccessor world) {
		BalsArystisaMod.queueServerWork(20, () -> {
		});
	}
}
