package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InvisibleCamoUseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers == 1
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Cooldown == false
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo == true && !entity.isInvisible()) {
			entity.setInvisible(true);
			InvisibleCamoCooldownProcedure.execute(world, entity);
			BalsArystisaMod.queueServerWork(80, () -> {
				entity.setInvisible(false);
			});
		} else if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers == 2
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Cooldown == false
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo == true && !entity.isInvisible()) {
			entity.setInvisible(true);
			InvisibleCamoCooldownProcedure.execute(world, entity);
			BalsArystisaMod.queueServerWork(120, () -> {
				entity.setInvisible(false);
			});
		} else if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers == 3
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Cooldown == false
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo == true && !entity.isInvisible()) {
			entity.setInvisible(true);
			InvisibleCamoCooldownProcedure.execute(world, entity);
			BalsArystisaMod.queueServerWork(160, () -> {
				entity.setInvisible(false);
			});
		}
	}
}
