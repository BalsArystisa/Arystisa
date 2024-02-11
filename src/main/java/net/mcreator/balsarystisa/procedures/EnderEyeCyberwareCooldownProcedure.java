package net.mcreator.balsarystisa.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.balsarystisa.network.BalsArystisaModVariables;
import net.mcreator.balsarystisa.BalsArystisaMod;

public class EnderEyeCyberwareCooldownProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_tier == 1) {
			{
				boolean _setval = true;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Invisible_Camo = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			BalsArystisaMod.queueServerWork(1200, () -> {
				{
					boolean _setval = false;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		} else if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_tier == 2) {
			{
				boolean _setval = true;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Invisible_Camo = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			BalsArystisaMod.queueServerWork(800, () -> {
				{
					boolean _setval = false;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		} else if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_tier == 3) {
			{
				boolean _setval = true;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Invisible_Camo = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			BalsArystisaMod.queueServerWork(600, () -> {
				{
					boolean _setval = false;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
	}
}
