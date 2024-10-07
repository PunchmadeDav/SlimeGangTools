
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slimegangtools.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.slimegangtools.item.GrandpasWalkingStickItem;
import net.mcreator.slimegangtools.SlimegangtoolsMod;

public class SlimegangtoolsModItems {
	public static Item GRANDPAS_WALKING_STICK;

	public static void load() {
		GRANDPAS_WALKING_STICK = Registry.register(Registry.ITEM, new ResourceLocation(SlimegangtoolsMod.MODID, "grandpas_walking_stick"), new GrandpasWalkingStickItem());
	}
}
