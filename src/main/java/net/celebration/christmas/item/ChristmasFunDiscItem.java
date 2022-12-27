
package net.celebration.christmas.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.celebration.christmas.init.ChristmasModTabs;
import net.celebration.christmas.init.ChristmasModSounds;

public class ChristmasFunDiscItem extends RecordItem {
	public ChristmasFunDiscItem() {
		super(2, ChristmasModSounds.CHRISTMAS_FUN, new Item.Properties().tab(ChristmasModTabs.TAB_INFOY_CHRISTMAS).stacksTo(1).rarity(Rarity.RARE),
				1680);
	}
}
