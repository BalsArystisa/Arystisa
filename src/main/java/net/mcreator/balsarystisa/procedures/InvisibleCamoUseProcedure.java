package net.mcreator.balsarystisa.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.balsarystisa.network.BalsArystisaModVariables;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class InvisibleCamoUseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo == true && !entity.isInvisible()) {
			entity.setInvisible(true);
			BalsArystisaMod.queueServerWork(160, () -> {
				entity.setInvisible(false);
			});
		}
	}
}
