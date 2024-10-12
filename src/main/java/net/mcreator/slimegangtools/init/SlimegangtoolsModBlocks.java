
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.slimegangtools.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.slimegangtools.block.DeconstructionBenchBlock;
import net.mcreator.slimegangtools.SlimegangtoolsMod;

public class SlimegangtoolsModBlocks {
	public static Block DECONSTRUCTION_BENCH;

	public static void load() {
		DECONSTRUCTION_BENCH = Registry.register(Registry.BLOCK, new ResourceLocation(SlimegangtoolsMod.MODID, "deconstruction_bench"), new DeconstructionBenchBlock());
	}

	public static void clientLoad() {
		DeconstructionBenchBlock.clientInit();
	}
}
