
package net.mcreator.balsarystisa.client.renderer;

public class ArystingCowRenderer extends MobRenderer<ArystingCowEntity, CowModel<ArystingCowEntity>> {

	public ArystingCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ArystingCowEntity entity) {
		return new ResourceLocation("bals_arystisa:textures/entities/arysting_cow.png");
	}

}
