package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SubDermalArmorProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
String armor = "";String armor_command = "";
if (==true&&(entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor==true) {armor = new java.text.DecimalFormat("##.##").format((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue():0)+5);armor_command = "attribute @s minecraft:generic.armor".replace("(armor)",armor);{
Entity _ent = entity;
if(!_ent.level().isClientSide() && _ent.getServer() != null) {
_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(
CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent
), armor_command);
}
}}
}
}
