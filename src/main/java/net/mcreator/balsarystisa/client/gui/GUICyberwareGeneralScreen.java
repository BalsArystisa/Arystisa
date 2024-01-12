package net.mcreator.balsarystisa.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.balsarystisa.world.inventory.GUICyberwareGeneralMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GUICyberwareGeneralScreen extends AbstractContainerScreen<GUICyberwareGeneralMenu> {
	private final static HashMap<String, Object> guistate = GUICyberwareGeneralMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_left_click;
	ImageButton imagebutton_right_click;

	public GUICyberwareGeneralScreen(GUICyberwareGeneralMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 320;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("bals_arystisa:textures/screens/gui_cyberware_general.png");

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

		guiGraphics.blit(new ResourceLocation("bals_arystisa:textures/screens/gui_cyberware_texture.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 320, 200, 320, 200);

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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_left_click = new ImageButton(this.leftPos + 140, this.topPos + 176, 8, 12, 0, 0, 12, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_left_click.png"), 8, 24, e -> {
		});
		guistate.put("button:imagebutton_left_click", imagebutton_left_click);
		this.addRenderableWidget(imagebutton_left_click);
		imagebutton_right_click = new ImageButton(this.leftPos + 108, this.topPos + 176, 8, 12, 0, 0, 12, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_right_click.png"), 8, 24, e -> {
		});
		guistate.put("button:imagebutton_right_click", imagebutton_right_click);
		this.addRenderableWidget(imagebutton_right_click);
	}
}
