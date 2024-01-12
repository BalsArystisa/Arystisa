package net.mcreator.balsarystisa.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.balsarystisa.network.BalsArystisaModVariables;
import net.mcreator.balsarystisa.init.BalsArystisaModItems;

import java.util.function.Supplier;
import java.util.Map;

public class MedaillonGUIkeepInventoryProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (true == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Fall_Damage_Medaillon) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(BalsArystisaModItems.FALL_DAMAGE_MEDAILLON.get());
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (true == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Health_Boost_Medaillon) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(BalsArystisaModItems.HEALTH_BOOST_MEDAILLON.get());
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (true == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Hunger_Medaillon) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(BalsArystisaModItems.HUNGER_MEDAILLON.get());
				_setstack.setCount(1);
				((Slot) _slots.get(2)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (true == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Night_Vision_Medaillon) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(BalsArystisaModItems.NIGHT_VISION_MEDAILLON.get());
				_setstack.setCount(1);
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (true == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Respiration_Medaillon) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(BalsArystisaModItems.RESPIRATION_MEDAILLON.get());
				_setstack.setCount(1);
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
