package net.mcreator.balsarystisa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InvisibleCamoUseProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if (==false&&==true&&!entity.isInvisible()) {entity.setInvisible(true);
InvisibleCamoCooldownProcedure.execute(world)
;
BalsArystisaMod.queueServerWork(160, () -> {
entity.setInvisible(false);
});
}
}
}
