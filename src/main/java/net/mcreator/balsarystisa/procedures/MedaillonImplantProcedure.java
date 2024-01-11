package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MedaillonImplantProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if (BalsArystisaModItems.HEALTH_BOOST_MEDAILLON.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem()&&==false) {if(world.isClientSide())
Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.HEALTH_BOOST_MEDAILLON.get()));if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.HEALTH_BOOST_MEDAILLON.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}if (BalsArystisaModItems.HUNGER_MEDAILLON.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem()&&==false) {if(world.isClientSide())
Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.HUNGER_MEDAILLON.get()));if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.HUNGER_MEDAILLON.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}if (BalsArystisaModItems.NIGHT_VISION_MEDAILLON.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem()&&==false) {if(world.isClientSide())
Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.NIGHT_VISION_MEDAILLON.get()));if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.NIGHT_VISION_MEDAILLON.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}if (BalsArystisaModItems.DELETED_MOD_ELEMENT.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem()&&==false) {if(world.isClientSide())
Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get()));if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.DELETED_MOD_ELEMENT.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}if (BalsArystisaModItems.FALL_DAMAGE_MEDAILLON.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem()&&==false) {if(world.isClientSide())
Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.FALL_DAMAGE_MEDAILLON.get()));if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
if (entity instanceof Player _player) {
ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.FALL_DAMAGE_MEDAILLON.get());
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}}
}
}
