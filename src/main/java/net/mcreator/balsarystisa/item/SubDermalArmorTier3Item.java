
package net.mcreator.balsarystisa.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SubDermalArmorTier3Item extends Item {
	public SubDermalArmorTier3Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7bSubDermal_Armor : Tier 3"));
		list.add(Component.literal("\u00A74Resitance : \u00A76+9Armor"));
	}
}
