
package net.celebration.christmas.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.celebration.christmas.init.ChristmasModTabs;

public class CandyCaneItem extends Item {
	public CandyCaneItem() {
		super(new Item.Properties().tab(ChristmasModTabs.TAB_INFOY_CHRISTMAS).stacksTo(16).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(7).saturationMod(0.4f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
