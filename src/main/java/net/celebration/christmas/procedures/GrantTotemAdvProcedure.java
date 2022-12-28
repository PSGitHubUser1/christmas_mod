package net.celebration.christmas.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.celebration.christmas.init.ChristmasModItems;
import net.celebration.christmas.ChristmasMod;

import java.util.Map;
import java.util.Iterator;

public class GrantTotemAdvProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChristmasMod.LOGGER.warn("Failed to load dependency entity for procedure GrantTotemAdv!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((new ItemStack(ChristmasModItems.SANTA_TOTEM)).getDamageValue() > 0) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("christmas:santa_totem_adv"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
