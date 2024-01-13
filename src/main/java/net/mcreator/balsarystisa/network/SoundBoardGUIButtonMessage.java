
package net.mcreator.balsarystisa.network;

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

			FirstCommonSoundboardProcedProcedure.execute();
		}
		if (buttonID == 2) {

			SecondCommonSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ThirdCommonSoundboardProcedProcedure.execute();
		}
		if (buttonID == 4) {

			FourthCommonSoundboardProcedProcedure.execute();
		}
		if (buttonID == 5) {

			FifthCommonSoundboardProcedProcedure.execute();
		}
		if (buttonID == 6) {

			SixthCommonSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			SeventhCommonSoundboardProcedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			FirstRareSoundboardProcedProcedure.execute();
		}
		if (buttonID == 9) {

			SecondRareSoundboardProcedProcedure.execute();
		}
		if (buttonID == 10) {

			ThirdRareSoundboardProcedProcedure.execute();
		}
		if (buttonID == 11) {

			FourthRareSoundboardProcedProcedure.execute();
		}
		if (buttonID == 12) {

			FifthRareSoundboardProcedProcedure.execute();
		}
		if (buttonID == 13) {

			FirstEpicSoundboardProcedProcedure.execute();
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		BalsArystisaMod.addNetworkMessage(SoundBoardGUIButtonMessage.class, SoundBoardGUIButtonMessage::buffer, SoundBoardGUIButtonMessage::new, SoundBoardGUIButtonMessage::handler);
	}

}
