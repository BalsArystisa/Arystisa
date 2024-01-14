package net.mcreator.balsarystisa.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.balsarystisa.network.BalsArystisaModVariables;

public class SelectionUseProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (0 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Selection_Use) {
			InvisibleCamoUseProcedure.execute(world, entity);
		}
		if (1 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Selection_Use) {
			EnderEyeCyberwareUseProcedure.execute(entity);
		}
	}
}
