package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CyberwareinstallProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if (==true) {if (BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem()) {if(world.isClientSide())
Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get()));if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}{
boolean _setval = true;
entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.Invisible_Camo = _setval;
capability.syncPlayerVariables(entity);
});
}if (1<=) {if (1==) {if (entity instanceof Player _player) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get());
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}}else if (2==) {if (entity instanceof Player _player) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}}else if (3==) {if (entity instanceof Player _player) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}}}}else if (BalsArystisaModItems.DELETED_MOD_ELEMENT.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem()) {if(world.isClientSide())
Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get()));if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}{
boolean _setval = true;
entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.Invisible_Camo = _setval;
capability.syncPlayerVariables(entity);
});
}if (1<=) {if (1==) {if (entity instanceof Player _player) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get());
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}}else if (2==) {if (entity instanceof Player _player) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}}else if (3==) {if (entity instanceof Player _player) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}}}}else if (BalsArystisaModItems.DELETED_MOD_ELEMENT.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem()) {if(world.isClientSide())
Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get()));if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}{
boolean _setval = true;
entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.Invisible_Camo = _setval;
capability.syncPlayerVariables(entity);
});
}if (1<=) {if (1==) {if (entity instanceof Player _player) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get());
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}}else if (2==) {if (entity instanceof Player _player) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}}else if (3==) {if (entity instanceof Player _player) {
ItemStack _setstack = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_setstack.setCount(1);
ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
}}}}if (BalsArystisaModItems.DELETED_MOD_ELEMENT.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem()) {if(world.isClientSide())
Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get()));if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}}
}
}
