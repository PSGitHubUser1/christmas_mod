
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.celebration.christmas.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class ChristmasModTabs {
	public static CreativeModeTab TAB_INFOY_CHRISTMAS;

	public static void load() {
		TAB_INFOY_CHRISTMAS = FabricItemGroupBuilder.create(new ResourceLocation("christmas", "infoy_christmas"))
				.icon(() -> new ItemStack(ChristmasModItems.CHRISTMAS_ARMOR_HELMET)).build();
	}
}
