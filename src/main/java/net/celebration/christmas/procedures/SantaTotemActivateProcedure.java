package net.celebration.christmas.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;

import net.celebration.christmas.init.ChristmasModItems;
import net.celebration.christmas.ChristmasMod;

import java.util.Map;
import java.util.HashMap;

public class SantaTotemActivateProcedure {
	public SantaTotemActivateProcedure() {
		ServerLivingEntityEvents.ALLOW_DEATH.register((entity, damageSource, amount) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("entity", entity);
			dependencies.put("x", entity.getX());
			dependencies.put("y", entity.getY());
			dependencies.put("z", entity.getZ());
			dependencies.put("world", entity.level);
			dependencies.put("sourceentity", damageSource.getEntity());
			execute(dependencies);
			return true;
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ChristmasMod.LOGGER.warn("Failed to load dependency world for procedure SantaTotemActivate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ChristmasMod.LOGGER.warn("Failed to load dependency x for procedure SantaTotemActivate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ChristmasMod.LOGGER.warn("Failed to load dependency y for procedure SantaTotemActivate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ChristmasMod.LOGGER.warn("Failed to load dependency z for procedure SantaTotemActivate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChristmasMod.LOGGER.warn("Failed to load dependency entity for procedure SantaTotemActivate!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ChristmasModItems.SANTA_TOTEM) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 240, 8));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 220, 7));
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(ChristmasModItems.SANTA_TOTEM));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600, 4));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600, 4));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), SoundEvents.TOTEM_USE, SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, SoundEvents.TOTEM_USE, SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 14, 0, 2, 0, 1);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(ChristmasModItems.GINGER_BREAD_COOKIE);
					_setstack.setCount(8);
					_player.getInventory().add(_setstack);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Gave 8 Gingerbread Cookies to you!"), (false));
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getItem() == ChristmasModItems.SANTA_TOTEM) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 240, 8));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 220, 6));
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(ChristmasModItems.SANTA_TOTEM));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600, 3));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600, 2));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), SoundEvents.TOTEM_USE, SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, SoundEvents.TOTEM_USE, SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 14, 0, 2, 0, 1);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(ChristmasModItems.GINGER_BREAD_COOKIE);
					_setstack.setCount(8);
					_player.getInventory().add(_setstack);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Gave 8 Gingerbread Cookies to you!"), (false));
			}
		}
	}
}
