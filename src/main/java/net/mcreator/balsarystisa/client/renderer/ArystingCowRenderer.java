
package net.mcreator.balsarystisa.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.balsarystisa.entity.ArystingCowEntity;

public class ArystingCowRenderer extends MobRenderer<ArystingCowEntity, CowModel<ArystingCowEntity>> {
	public ArystingCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ArystingCowEntity entity) {
		return new ResourceLocation("bals_arystisa:textures/entities/arysting_cow.png");
	}
}
