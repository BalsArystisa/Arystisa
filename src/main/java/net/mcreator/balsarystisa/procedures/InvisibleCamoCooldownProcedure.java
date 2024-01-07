package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InvisibleCamoCooldownProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Invisible_Camo_Cooldown = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		BalsArystisaMod.queueServerWork(1360, () -> {
			{
				boolean _setval = false;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Invisible_Camo_Cooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		});
	}
}
