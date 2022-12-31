package net.celebration.christmas.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.celebration.christmas.ChristmasMod;

import java.util.Map;

public class HotMilkPlayerFinishesUsingItemProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChristmasMod.LOGGER.warn("Failed to load dependency entity for procedure HotMilkPlayerFinishesUsingItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600, 3));
	}
}
