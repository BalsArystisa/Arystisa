
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BalsArystisaMod.MODID);
	public static final RegistryObject<SoundEvent> NEXT_SPAWNER_WAVE = REGISTRY.register("next_spawner_wave", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bals_arystisa", "next_spawner_wave")));
	public static final RegistryObject<SoundEvent> LAUNCH_SPAWNER_WAVE = REGISTRY.register("launch_spawner_wave", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bals_arystisa", "launch_spawner_wave")));
	public static final RegistryObject<SoundEvent> END_SPAWNER_WAVE = REGISTRY.register("end_spawner_wave", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bals_arystisa", "end_spawner_wave")));
}
