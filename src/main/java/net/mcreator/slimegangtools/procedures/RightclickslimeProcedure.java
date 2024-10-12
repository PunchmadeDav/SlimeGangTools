package net.mcreator.slimegangtools.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;

import net.mcreator.slimegangtools.init.SlimegangtoolsModItems;
import net.mcreator.slimegangtools.SlimegangtoolsMod;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;

import java.util.Map;
import java.util.HashMap;

public class RightclickslimeProcedure {
	public RightclickslimeProcedure() {
		UseEntityCallback.EVENT.register((player, level, hand, entity, hitResult) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("world", level);
			dependencies.put("sourceentity", player);
			dependencies.put("entity", entity);
			dependencies.put("x", player.getX());
			dependencies.put("y", player.getY());
			dependencies.put("z", player.getZ());
			execute(dependencies);
			return InteractionResult.PASS;
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SlimegangtoolsMod.LOGGER.warn("Failed to load dependency world for procedure Rightclickslime!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SlimegangtoolsMod.LOGGER.warn("Failed to load dependency x for procedure Rightclickslime!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SlimegangtoolsMod.LOGGER.warn("Failed to load dependency y for procedure Rightclickslime!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SlimegangtoolsMod.LOGGER.warn("Failed to load dependency z for procedure Rightclickslime!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SlimegangtoolsMod.LOGGER.warn("Failed to load dependency entity for procedure Rightclickslime!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				SlimegangtoolsMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Rightclickslime!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof Player && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET
				|| sourceentity instanceof LivingEntity && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET) {
			if (!world.getEntitiesOfClass(Slime.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).isEmpty()) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.BUCKET);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SlimegangtoolsModItems.BUCKET_OF_SLIME);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
