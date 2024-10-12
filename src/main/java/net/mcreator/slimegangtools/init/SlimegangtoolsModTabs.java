
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slimegangtools.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class SlimegangtoolsModTabs {
	public static CreativeModeTab TAB_SLIME_GANG_TOOLS;

	public static void load() {
		TAB_SLIME_GANG_TOOLS = FabricItemGroupBuilder.create(new ResourceLocation("slimegangtools", "slime_gang_tools")).icon(() -> new ItemStack(Blocks.SLIME_BLOCK)).build();
	}
}
