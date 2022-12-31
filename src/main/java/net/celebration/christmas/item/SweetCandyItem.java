
package net.celebration.christmas.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.celebration.christmas.init.ChristmasModTabs;

public class SweetCandyItem extends Item {
	public SweetCandyItem() {
		super(new Item.Properties().tab(ChristmasModTabs.TAB_INFOY_CHRISTMAS).stacksTo(16).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.5f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
