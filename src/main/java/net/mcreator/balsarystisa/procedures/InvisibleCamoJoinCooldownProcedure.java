package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InvisibleCamoJoinCooldownProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Invisible_Camo_Cooldown = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		BalsArystisaMod.queueServerWork(1200, () -> {
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
