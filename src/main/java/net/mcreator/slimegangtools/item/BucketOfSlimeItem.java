
package net.mcreator.slimegangtools.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.slimegangtools.init.SlimegangtoolsModTabs;

public class BucketOfSlimeItem extends Item {
	public BucketOfSlimeItem() {
		super(new Item.Properties().tab(SlimegangtoolsModTabs.TAB_SLIME_GANG_TOOLS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
