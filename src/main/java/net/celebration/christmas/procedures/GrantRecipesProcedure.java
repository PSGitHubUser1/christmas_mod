package net.celebration.christmas.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import net.celebration.christmas.ChristmasMod;

import java.util.Map;
import java.util.HashMap;

import io.github.fabricators_of_create.porting_lib.event.common.EntityEvents;

public class GrantRecipesProcedure {
	public GrantRecipesProcedure() {
		EntityEvents.ON_JOIN_WORLD.register((entity, world, loadedFromDisk) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("entity", entity);
			dependencies.put("x", entity.getX());
			dependencies.put("y", entity.getY());
			dependencies.put("z", entity.getZ());
			dependencies.put("world", world);
			execute(dependencies);
			return true;
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChristmasMod.LOGGER.warn("Failed to load dependency entity for procedure GrantRecipes!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("christmas:gingerbread_make")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("christmas:santa_totem_make")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("christmas:hot_gingermilk_make")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("christmas:hotmilk_make")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("christmas:milkbottle_make")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("christmas:candy_make")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("christmas:candycane_make")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("christmas:christmas_leggi_make")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("christmas:christmas_chestplate_make")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("christmas:christmas_helmet_make")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("christmas:christmas_boots_make")});
		}
	}
}
