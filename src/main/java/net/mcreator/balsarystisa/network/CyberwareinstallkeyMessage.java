
package net.mcreator.balsarystisa.network;

import net.mcreator.balsarystisa.BalsArystisaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CyberwareinstallkeyMessage {

	int type, pressedms;

	public CyberwareinstallkeyMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public CyberwareinstallkeyMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(CyberwareinstallkeyMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(CyberwareinstallkeyMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			CyberwareinstallProcedure.execute(world, entity);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		BalsArystisaMod.addNetworkMessage(CyberwareinstallkeyMessage.class, CyberwareinstallkeyMessage::buffer, CyberwareinstallkeyMessage::new, CyberwareinstallkeyMessage::handler);
	}

}
