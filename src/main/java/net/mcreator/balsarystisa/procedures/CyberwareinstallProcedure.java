package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import net.mcreator.balsarystisa.network.BalsArystisaModVariables;
import net.mcreator.balsarystisa.init.BalsArystisaModItems;
import net.mcreator.balsarystisa.BalsArystisaMod;

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
			if (BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_1.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_1.get()));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_1.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					boolean _setval = true;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SubDermal_Armor = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (1 <= (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
					if (1 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "attribute @s minecraft:generic.armor base set 0");
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_1.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (2 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "attribute @s minecraft:generic.armor base set 0");
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_2.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (3 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "attribute @s minecraft:generic.armor base set 0");
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_3.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
				{
					double _setval = 1;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SubDermal_Armor_Tier = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				BalsArystisaMod.queueServerWork(1, () -> {
					SubDermalArmorProcedure.execute(entity);
				});
			} else if (BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_2.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_2.get()));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_2.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					boolean _setval = true;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SubDermal_Armor = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (1 <= (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
					if (1 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "attribute @s minecraft:generic.armor base set 0");
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_1.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (2 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "attribute @s minecraft:generic.armor base set 0");
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_2.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (3 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "attribute @s minecraft:generic.armor base set 0");
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_3.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
				{
					double _setval = 2;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SubDermal_Armor_Tier = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				BalsArystisaMod.queueServerWork(1, () -> {
					SubDermalArmorProcedure.execute(entity);
				});
			} else if (BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_3.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_3.get()));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_3.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					boolean _setval = true;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SubDermal_Armor = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (1 <= (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
					if (1 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "attribute @s minecraft:generic.armor base set 0");
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_1.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (2 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "attribute @s minecraft:generic.armor base set 0");
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_2.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (3 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).SubDermal_Armor_Tier) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "attribute @s minecraft:generic.armor base set 0");
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.SUB_DERMAL_ARMOR_TIER_3.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
				{
					double _setval = 3;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SubDermal_Armor_Tier = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				BalsArystisaMod.queueServerWork(1, () -> {
					SubDermalArmorProcedure.execute(entity);
				});
			}
			if (BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_1.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_1.get()));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_1.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					boolean _setval = true;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Ender_Eye_Cyberware = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (1 <= (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
					if (1 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_1.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (2 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_2.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (3 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_3.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
				{
					double _setval = 1;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Ender_Eye_Cyberware_Tier = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_2.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_2.get()));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_2.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					boolean _setval = true;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Ender_Eye_Cyberware = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (1 <= (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
					if (1 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_1.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (2 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_2.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (3 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_3.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
				{
					double _setval = 2;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Ender_Eye_Cyberware_Tier = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_3.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_3.get()));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_3.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					boolean _setval = true;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Ender_Eye_Cyberware = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (1 <= (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
					if (1 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_1.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (2 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_2.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (3 == (entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BalsArystisaModVariables.PlayerVariables())).Ender_Eye_Cyberware_Tier) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(BalsArystisaModItems.ENDER_EYE_CYBERWARE_TIER_3.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
				{
					double _setval = 3;
					entity.getCapability(BalsArystisaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Ender_Eye_Cyberware_Tier = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
