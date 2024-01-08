package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GUI_Cyberware_General_UIProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo==true) {if (==1) {if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get());
_setstack.setCount(1);
((Slot) _slots.get(0)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}else if (==2) {if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_setstack.setCount(1);
((Slot) _slots.get(0)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}else if (==3) {if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_setstack.setCount(1);
((Slot) _slots.get(0)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}}
}
}
