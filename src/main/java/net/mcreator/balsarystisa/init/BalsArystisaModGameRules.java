
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BalsArystisaModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DO_PLAYER_SOUNDBOARD = GameRules.register("doPlayerSoundboard", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
