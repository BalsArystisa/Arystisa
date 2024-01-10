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
		if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier == 1
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor == true) {
			armor = new java.text.DecimalFormat("##.##").format((entity instanceof LivingEntity _livEnt ? _livEnt.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).getBaseValue() : 0) + 5);
			armor_command = "attribute @s minecraft:generic.armor base set (armor)".replace("(armor)", armor);
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), armor_command);
				}
			}
		} else if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier == 2
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor == true) {
			armor = new java.text.DecimalFormat("##.##").format((entity instanceof LivingEntity _livEnt ? _livEnt.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).getBaseValue() : 0) + 7);
			armor_command = "attribute @s minecraft:generic.armor base set (armor)".replace("(armor)", armor);
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), armor_command);
				}
			}
		} else if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier == 3
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor == true) {
			armor = new java.text.DecimalFormat("##.##").format((entity instanceof LivingEntity _livEnt ? _livEnt.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).getBaseValue() : 0) + 9);
			armor_command = "attribute @s minecraft:generic.armor base set (armor)".replace("(armor)", armor);
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
