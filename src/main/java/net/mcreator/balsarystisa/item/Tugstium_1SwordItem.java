
package net.mcreator.balsarystisa.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class Tugstium_1SwordItem extends SwordItem {
	public Tugstium_1SwordItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BalsArystisaModItems.TUGSTIUM_ARMOR_ARMOR_HELMET.get()));
			}
		}, 3, -3f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
