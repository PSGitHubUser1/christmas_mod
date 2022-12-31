package net.celebration.christmas.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.celebration.christmas.ChristmasMod;

import java.util.Map;

public class SantaTotemEntitySwingsItemProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChristmasMod.LOGGER.warn("Failed to load dependency entity for procedure SantaTotemEntitySwingsItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new WitherSkull(EntityType.WITHER_SKULL, projectileLevel);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
