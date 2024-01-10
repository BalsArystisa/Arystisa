package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MedaillonImplantProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (BalsArystisaModItems.HEALTH_BOOST_MEDAILLON.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo == false) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.HEALTH_BOOST_MEDAILLON.get()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.HEALTH_BOOST_MEDAILLON.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			{
				boolean _setval = true;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health_Boost_Medaillon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (BalsArystisaModItems.HUNGER_MEDAILLON.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo == false) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.HUNGER_MEDAILLON.get()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.HUNGER_MEDAILLON.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			{
				boolean _setval = true;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Hunger_Medaillon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (BalsArystisaModItems.NIGHT_VISION_MEDAILLON.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo == false) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.NIGHT_VISION_MEDAILLON.get()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.NIGHT_VISION_MEDAILLON.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			{
				boolean _setval = true;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Night_Vision_Medaillon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (BalsArystisaModItems.RESPIRATION_MEDAILLON.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo == false) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.RESPIRATION_MEDAILLON.get()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.RESPIRATION_MEDAILLON.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			{
				boolean _setval = true;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Respiration_Medaillon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (BalsArystisaModItems.FALL_DAMAGE_MEDAILLON.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
				&& (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo == false) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.FALL_DAMAGE_MEDAILLON.get()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.FALL_DAMAGE_MEDAILLON.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			{
				boolean _setval = true;
				entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Fall_Damage_Medaillon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
