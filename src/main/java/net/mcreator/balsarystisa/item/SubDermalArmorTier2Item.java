
package net.mcreator.balsarystisa.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SubDermalArmorTier2Item extends Item {
	public SubDermalArmorTier2Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cSubDermal_Armor : Tier 2"));
		list.add(Component.literal("\u00A74Resitance : \u00A76+7Armor"));
	}
}