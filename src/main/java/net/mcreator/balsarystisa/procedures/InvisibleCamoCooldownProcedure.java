package net.mcreator.balsarystisa.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.balsarystisa.network.BalsArystisaModVariables;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class InvisibleCamoCooldownProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (1 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
			{
				boolean _setval = true;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Invisible_Camo_Cooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			BalsArystisaMod.queueServerWork(1280, () -> {
				{
					boolean _setval = false;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo_Cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		} else if (2 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
			{
				boolean _setval = true;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Invisible_Camo_Cooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			BalsArystisaMod.queueServerWork(1320, () -> {
				{
					boolean _setval = false;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo_Cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		} else if (3 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
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
}
