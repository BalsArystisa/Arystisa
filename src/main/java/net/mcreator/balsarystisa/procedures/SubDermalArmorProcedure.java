package net.mcreator.balsarystisa.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.balsarystisa.network.BalsArystisaModVariables;

public class SubDermalArmorProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String armor = "";
		String armor_command = "";
		if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_First_Implant == true
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor == true) {
			{
				boolean _setval = false;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SubDermal_Armor_First_Implant = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			armor = new java.text.DecimalFormat("##.##").format((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) + 5);
			armor_command = "attribute @s minecraft:generic.armor".replace("(armor)", armor);
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), armor_command);
				}
			}
		}
	}
}
