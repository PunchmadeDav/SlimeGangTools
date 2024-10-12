
package net.mcreator.slimegangtools.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.slimegangtools.init.SlimegangtoolsModItems;

public class SlimeSwordItem extends SwordItem {
	public SlimeSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 8.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 8;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SlimegangtoolsModItems.SLIME_INFUSED_NETHERITE_INGOT));
			}
		}, 3, 6.5f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}
}
