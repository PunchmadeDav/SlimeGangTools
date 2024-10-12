
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slimegangtools.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.slimegangtools.item.SlimyShovelItem;
import net.mcreator.slimegangtools.item.SlimeSwordItem;
import net.mcreator.slimegangtools.item.SlimeInfusedNetheriteIngotItem;
import net.mcreator.slimegangtools.item.BucketOfSlimeItem;
import net.mcreator.slimegangtools.item.BucketOfMagmaCubeItem;
import net.mcreator.slimegangtools.SlimegangtoolsMod;

public class SlimegangtoolsModItems {
	public static Item BUCKET_OF_MAGMA_CUBE;
	public static Item BUCKET_OF_SLIME;
	public static Item SLIMY_SHOVEL;
	public static Item SLIME_INFUSED_NETHERITE_INGOT;
	public static Item SLIME_SWORD;
	public static Item DECONSTRUCTION_BENCH;

	public static void load() {
		BUCKET_OF_MAGMA_CUBE = Registry.register(Registry.ITEM, new ResourceLocation(SlimegangtoolsMod.MODID, "bucket_of_magma_cube"), new BucketOfMagmaCubeItem());
		BUCKET_OF_SLIME = Registry.register(Registry.ITEM, new ResourceLocation(SlimegangtoolsMod.MODID, "bucket_of_slime"), new BucketOfSlimeItem());
		SLIMY_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(SlimegangtoolsMod.MODID, "slimy_shovel"), new SlimyShovelItem());
		SLIME_INFUSED_NETHERITE_INGOT = Registry.register(Registry.ITEM, new ResourceLocation(SlimegangtoolsMod.MODID, "slime_infused_netherite_ingot"), new SlimeInfusedNetheriteIngotItem());
		SLIME_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(SlimegangtoolsMod.MODID, "slime_sword"), new SlimeSwordItem());
		DECONSTRUCTION_BENCH = Registry.register(Registry.ITEM, new ResourceLocation(SlimegangtoolsMod.MODID, "deconstruction_bench"),
				new BlockItem(SlimegangtoolsModBlocks.DECONSTRUCTION_BENCH, new Item.Properties().tab(SlimegangtoolsModTabs.TAB_SLIME_GANG_TOOLS)));
	}
}
