
package net.mcreator.balsarystisa.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.balsarystisa.world.inventory.SoundBoardGUIMenu;
import net.mcreator.balsarystisa.procedures.ThirdRareSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.ThirdCommonSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.SixthCommonSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.SeventhCommonSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.SecondRareSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.SecondCommonSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.FourthRareSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.FourthCommonSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.FirstRareSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.FirstEpicSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.FirstCommonSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.FifthRareSoundboardProcedProcedure;
import net.mcreator.balsarystisa.procedures.FifthCommonSoundboardProcedProcedure;
import net.mcreator.balsarystisa.BalsArystisaMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SoundBoardGUIButtonMessage {
	private final int buttonID, x, y, z;

	public SoundBoardGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SoundBoardGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SoundBoardGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SoundBoardGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = SoundBoardGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 1) {

			FirstCommonSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			SecondCommonSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ThirdCommonSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			FourthCommonSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			FifthCommonSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			SixthCommonSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			SeventhCommonSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			FirstRareSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			SecondRareSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			ThirdRareSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			FourthRareSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 12) {

			FifthRareSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 13) {

			FirstEpicSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		BalsArystisaMod.addNetworkMessage(SoundBoardGUIButtonMessage.class, SoundBoardGUIButtonMessage::buffer, SoundBoardGUIButtonMessage::new, SoundBoardGUIButtonMessage::handler);
	}
}
