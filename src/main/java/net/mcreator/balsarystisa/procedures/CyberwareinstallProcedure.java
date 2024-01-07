package net.mcreator.balsarystisa.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.balsarystisa.network.BalsArystisaModVariables;
import net.mcreator.balsarystisa.init.BalsArystisaModItems;

public class CyberwareinstallProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Cubdoc == true) {
			if (1 <= new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get()).getCount()) {
				{
					boolean _setval = true;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
