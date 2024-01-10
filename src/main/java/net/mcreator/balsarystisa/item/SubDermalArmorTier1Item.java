
package net.mcreator.balsarystisa.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SubDermalArmorTier1Item extends Item {
	public SubDermalArmorTier1Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A72SubDermal_Armor : Tier 1"));
		list.add(Component.literal("\u00A74Resitance : \u00A76+5Armor"));
	}
}