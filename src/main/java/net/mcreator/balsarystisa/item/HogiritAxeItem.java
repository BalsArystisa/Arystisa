
package net.mcreator.balsarystisa.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.network.chat.Component;

import net.mcreator.balsarystisa.init.BalsArystisaModItems;

import java.util.List;

public class HogiritAxeItem extends AxeItem {
	public HogiritAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 441;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BalsArystisaModItems.HOGIRIT_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
