
package net.mcreator.slimegangtools.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.slimegangtools.init.SlimegangtoolsModTabs;

import java.util.List;

public class SlimeInfusedNetheriteIngotItem extends Item {
	public SlimeInfusedNetheriteIngotItem() {
		super(new Item.Properties().tab(SlimegangtoolsModTabs.TAB_SLIME_GANG_TOOLS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("A Netherite Ingot that has been infused with Slime"));
	}
}
