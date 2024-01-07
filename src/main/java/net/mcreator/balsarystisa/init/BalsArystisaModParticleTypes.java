
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balsarystisa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.balsarystisa.BalsArystisaMod;

public class BalsArystisaModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, BalsArystisaMod.MODID);
	public static final RegistryObject<SimpleParticleType> RUNNED_PORTAL_PARTICLE = REGISTRY.register("runned_portal_particle", () -> new SimpleParticleType(false));
}
