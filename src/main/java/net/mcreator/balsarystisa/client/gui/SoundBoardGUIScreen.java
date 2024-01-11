package net.mcreator.balsarystisa.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.balsarystisa.world.inventory.SoundBoardGUIMenu;
import net.mcreator.balsarystisa.procedures.FirstEpicButtonConditionProcedProcedure;
import net.mcreator.balsarystisa.network.SoundBoardGUIButtonMessage;
import net.mcreator.balsarystisa.BalsArystisaMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SoundBoardGUIScreen extends AbstractContainerScreen<SoundBoardGUIMenu> {
	private final static HashMap<String, Object> guistate = SoundBoardGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_soundboardbutton;
	ImageButton imagebutton_commun_finie;
	ImageButton imagebutton_commun_finie1;
	ImageButton imagebutton_commun_finie2;
	ImageButton imagebutton_commun_finie3;
	ImageButton imagebutton_commun_finie4;
	ImageButton imagebutton_commun_finie5;
	ImageButton imagebutton_commun_finie6;
	ImageButton imagebutton_rare_finie;
	ImageButton imagebutton_rare_finie1;
	ImageButton imagebutton_rare_finie2;
	ImageButton imagebutton_rare_finie3;
	ImageButton imagebutton_rare_finie4;
	ImageButton imagebutton_epic_finie;

	public SoundBoardGUIScreen(SoundBoardGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 350;
		this.imageHeight = 170;
	}

	private static final ResourceLocation texture = new ResourceLocation("bals_arystisa:textures/screens/sound_board_gui.png");

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

		guiGraphics.blit(new ResourceLocation("bals_arystisa:textures/screens/no_claim.png"), this.leftPos + 71, this.topPos + 95, 0, 0, 26, 26, 26, 26);

		guiGraphics.blit(new ResourceLocation("bals_arystisa:textures/screens/no_claim.png"), this.leftPos + 101, this.topPos + 95, 0, 0, 26, 26, 26, 26);

		guiGraphics.blit(new ResourceLocation("bals_arystisa:textures/screens/no_claim.png"), this.leftPos + 131, this.topPos + 95, 0, 0, 26, 26, 26, 26);

		guiGraphics.blit(new ResourceLocation("bals_arystisa:textures/screens/no_claim.png"), this.leftPos + 161, this.topPos + 95, 0, 0, 26, 26, 26, 26);

		guiGraphics.blit(new ResourceLocation("bals_arystisa:textures/screens/no_claim.png"), this.leftPos + 191, this.topPos + 95, 0, 0, 26, 26, 26, 26);

		guiGraphics.blit(new ResourceLocation("bals_arystisa:textures/screens/no_claim.png"), this.leftPos + 221, this.topPos + 95, 0, 0, 26, 26, 26, 26);

		guiGraphics.blit(new ResourceLocation("bals_arystisa:textures/screens/no_claim.png"), this.leftPos + 71, this.topPos + 130, 0, 0, 26, 26, 26, 26);

		guiGraphics.blit(new ResourceLocation("bals_arystisa:textures/screens/no_claim.png"), this.leftPos + 101, this.topPos + 130, 0, 0, 26, 26, 26, 26);

		guiGraphics.blit(new ResourceLocation("bals_arystisa:textures/screens/no_claim.png"), this.leftPos + 131, this.topPos + 130, 0, 0, 26, 26, 26, 26);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.bals_arystisa.sound_board_gui.label_arystisa"), 10, 7, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.bals_arystisa.sound_board_gui.label_comming_soon"), 270, 153, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.bals_arystisa.sound_board_gui.label_soundboard_menu"), 71, 7, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_soundboardbutton = new ImageButton(this.leftPos + 18, this.topPos + 25, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_soundboardbutton.png"), 26, 52, e -> {
		});
		guistate.put("button:imagebutton_soundboardbutton", imagebutton_soundboardbutton);
		this.addRenderableWidget(imagebutton_soundboardbutton);
		imagebutton_commun_finie = new ImageButton(this.leftPos + 71, this.topPos + 25, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_commun_finie.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(1, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_commun_finie", imagebutton_commun_finie);
		this.addRenderableWidget(imagebutton_commun_finie);
		imagebutton_commun_finie1 = new ImageButton(this.leftPos + 101, this.topPos + 25, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_commun_finie1.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(2, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_commun_finie1", imagebutton_commun_finie1);
		this.addRenderableWidget(imagebutton_commun_finie1);
		imagebutton_commun_finie2 = new ImageButton(this.leftPos + 131, this.topPos + 25, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_commun_finie2.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(3, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_commun_finie2", imagebutton_commun_finie2);
		this.addRenderableWidget(imagebutton_commun_finie2);
		imagebutton_commun_finie3 = new ImageButton(this.leftPos + 161, this.topPos + 25, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_commun_finie3.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(4, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_commun_finie3", imagebutton_commun_finie3);
		this.addRenderableWidget(imagebutton_commun_finie3);
		imagebutton_commun_finie4 = new ImageButton(this.leftPos + 191, this.topPos + 25, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_commun_finie4.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(5, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_commun_finie4", imagebutton_commun_finie4);
		this.addRenderableWidget(imagebutton_commun_finie4);
		imagebutton_commun_finie5 = new ImageButton(this.leftPos + 221, this.topPos + 25, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_commun_finie5.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(6, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_commun_finie5", imagebutton_commun_finie5);
		this.addRenderableWidget(imagebutton_commun_finie5);
		imagebutton_commun_finie6 = new ImageButton(this.leftPos + 251, this.topPos + 25, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_commun_finie6.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(7, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_commun_finie6", imagebutton_commun_finie6);
		this.addRenderableWidget(imagebutton_commun_finie6);
		imagebutton_rare_finie = new ImageButton(this.leftPos + 71, this.topPos + 60, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_rare_finie.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(8, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rare_finie", imagebutton_rare_finie);
		this.addRenderableWidget(imagebutton_rare_finie);
		imagebutton_rare_finie1 = new ImageButton(this.leftPos + 101, this.topPos + 60, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_rare_finie1.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(9, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rare_finie1", imagebutton_rare_finie1);
		this.addRenderableWidget(imagebutton_rare_finie1);
		imagebutton_rare_finie2 = new ImageButton(this.leftPos + 131, this.topPos + 60, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_rare_finie2.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(10, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rare_finie2", imagebutton_rare_finie2);
		this.addRenderableWidget(imagebutton_rare_finie2);
		imagebutton_rare_finie3 = new ImageButton(this.leftPos + 161, this.topPos + 60, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_rare_finie3.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(11, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rare_finie3", imagebutton_rare_finie3);
		this.addRenderableWidget(imagebutton_rare_finie3);
		imagebutton_rare_finie4 = new ImageButton(this.leftPos + 191, this.topPos + 60, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_rare_finie4.png"), 26, 52, e -> {
			if (true) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(12, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rare_finie4", imagebutton_rare_finie4);
		this.addRenderableWidget(imagebutton_rare_finie4);
		imagebutton_epic_finie = new ImageButton(this.leftPos + 71, this.topPos + 95, 26, 26, 0, 0, 26, new ResourceLocation("bals_arystisa:textures/screens/atlas/imagebutton_epic_finie.png"), 26, 52, e -> {
			if (FirstEpicButtonConditionProcedProcedure.execute()) {
				BalsArystisaMod.PACKET_HANDLER.sendToServer(new SoundBoardGUIButtonMessage(13, x, y, z));
				SoundBoardGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (FirstEpicButtonConditionProcedProcedure.execute())
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_epic_finie", imagebutton_epic_finie);
		this.addRenderableWidget(imagebutton_epic_finie);
	}
}
