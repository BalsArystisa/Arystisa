package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EnderEyeCyberwareUseProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if (==true) {if (==1) {{
Entity _ent = entity;
_ent.teleportTo((entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(30)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(30)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()+1),(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(30)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(30)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(30)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()+1), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(30)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), _ent.getYRot(), _ent.getXRot());
}}else if (==2) {{
Entity _ent = entity;
_ent.teleportTo((entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(40)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(40)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()+1),(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(40)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(40)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(40)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()+1), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(40)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), _ent.getYRot(), _ent.getXRot());
}}else if (==3) {{
Entity _ent = entity;
_ent.teleportTo((entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(50)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(50)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()+1),(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(50)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(50)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(50)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()+1), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(50)), ClipContext.Block.VISUAL,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), _ent.getYRot(), _ent.getXRot());
}}}
}
}
