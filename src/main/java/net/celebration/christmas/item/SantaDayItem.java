
package net.celebration.christmas.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.celebration.christmas.init.ChristmasModSounds;

public class SantaDayItem extends RecordItem {
	public SantaDayItem() {
		super(2, ChristmasModSounds.SANTA, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 2420);
	}
}
