package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.balsarystisa.network.BalsArystisaModVariables;
import net.mcreator.balsarystisa.init.BalsArystisaModItems;

public class CyberwareinstallProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Cubdoc == true) {
			if (BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get()));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					boolean _setval = true;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (1 <= (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
					if (1 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (2 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMOTIERS_2.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (3 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMOTIERS_3.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
				{
					double _setval = 1;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo_Tiers = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (BalsArystisaModItems.INVISIBLE_CAMOTIERS_2.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.INVISIBLE_CAMOTIERS_2.get()));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMOTIERS_2.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					boolean _setval = true;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (1 <= (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
					if (1 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (2 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMOTIERS_2.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (3 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMOTIERS_3.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
				{
					double _setval = 2;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo_Tiers = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (BalsArystisaModItems.INVISIBLE_CAMOTIERS_3.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.INVISIBLE_CAMOTIERS_3.get()));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMOTIERS_3.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					boolean _setval = true;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (1 <= (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
					if (1 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMO_CYBERWARE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (2 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMOTIERS_2.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (3 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Invisible_Camo_Tiers) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.INVISIBLE_CAMOTIERS_3.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
				{
					double _setval = 3;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Invisible_Camo_Tiers = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
