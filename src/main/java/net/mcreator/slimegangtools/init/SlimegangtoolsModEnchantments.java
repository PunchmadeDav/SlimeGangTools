
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slimegangtools.init;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.slimegangtools.enchantment.SuperLuckEnchantment;
import net.mcreator.slimegangtools.enchantment.GuillotineEnchantment;
import net.mcreator.slimegangtools.enchantment.FatalHitEnchantment;
import net.mcreator.slimegangtools.enchantment.ExsanguinateEnchantment;
import net.mcreator.slimegangtools.SlimegangtoolsMod;

public class SlimegangtoolsModEnchantments {
	public static Enchantment FATAL_HIT;
	public static Enchantment SUPER_LUCK;
	public static Enchantment GUILLOTINE;
	public static Enchantment EXSANGUINATE;

	public static void load() {
		FATAL_HIT = Registry.register(Registry.ENCHANTMENT, new ResourceLocation(SlimegangtoolsMod.MODID, "fatal_hit"), new FatalHitEnchantment());
		SUPER_LUCK = Registry.register(Registry.ENCHANTMENT, new ResourceLocation(SlimegangtoolsMod.MODID, "super_luck"), new SuperLuckEnchantment());
		GUILLOTINE = Registry.register(Registry.ENCHANTMENT, new ResourceLocation(SlimegangtoolsMod.MODID, "guillotine"), new GuillotineEnchantment());
		EXSANGUINATE = Registry.register(Registry.ENCHANTMENT, new ResourceLocation(SlimegangtoolsMod.MODID, "exsanguinate"), new ExsanguinateEnchantment());
	}
}
