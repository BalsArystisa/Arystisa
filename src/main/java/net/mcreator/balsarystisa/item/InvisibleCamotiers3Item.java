
package net.mcreator.balsarystisa.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class InvisibleCamotiers3Item extends Item {
	public InvisibleCamotiers3Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Tier 3"));
		list.add(Component.literal("Invisible_Camo"));
		list.add(Component.literal("Duration : 8s"));
		list.add(Component.literal("Cooldown : 60s"));
	}
}