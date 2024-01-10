
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
		list.add(Component.literal("\u00A7bInvisible_Camo : Tier 3"));
		list.add(Component.literal("\u00A74Duration : \u00A768s"));
		list.add(Component.literal("\u00A74Cooldown : \u00A7660s"));
	}
}