package net.mcreator.balsarystisa.client.gui;

public class ArystisiaGUIScreen extends AbstractContainerScreen<ArystisiaGUIMenu> {

	private final static HashMap<String, Object> guistate = ArystisiaGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ArystisiaGUIScreen(ArystisiaGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 350;
		this.imageHeight = 170;
	}

	private static final ResourceLocation texture = new ResourceLocation("bals_arystisa:textures/screens/arystisia_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("bals_arystisa:textures/screens/arystisa_emotes_first_gui.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 350, 170, 350, 170);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.bals_arystisa.arystisia_gui.label_arystisa"), 10, 7, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.bals_arystisa.arystisia_gui.label_comming_soon"), 270, 153, -65536, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

	}

}
