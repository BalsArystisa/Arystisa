
package net.mcreator.balsarystisa.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.balsarystisa.init.BalsArystisaModItems;

import java.util.List;

public class CombinedswordItem extends SwordItem {
	public CombinedswordItem() {
		super(new Tier() {
			public int getUses() {
				return 160;
			}

			public float getSpeed() {
				return 66.5f;
			}

			public float getAttackDamageBonus() {
				return 998f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 94;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BalsArystisaModItems.COBALTINGOT.get()), new ItemStack(BalsArystisaModItems.HOGIRIT_INGOT.get()));
			}
		}, 3, 5.5f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hasCraftingRemainingItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
