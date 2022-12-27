
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.celebration.christmas.init;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.celebration.christmas.ChristmasMod;

public class ChristmasModPaintings {
	public static void load() {
		Registry.register(Registry.PAINTING_VARIANT, new ResourceLocation(ChristmasMod.MODID, "christmas_wither"), new PaintingVariant(32, 32));
		Registry.register(Registry.PAINTING_VARIANT, new ResourceLocation(ChristmasMod.MODID, "christmas_skulland_roses"),
				new PaintingVariant(32, 32));
		Registry.register(Registry.PAINTING_VARIANT, new ResourceLocation(ChristmasMod.MODID, "christmas_skeleton_picture"),
				new PaintingVariant(64, 48));
		Registry.register(Registry.PAINTING_VARIANT, new ResourceLocation(ChristmasMod.MODID, "christmas_pointer"), new PaintingVariant(64, 64));
		Registry.register(Registry.PAINTING_VARIANT, new ResourceLocation(ChristmasMod.MODID, "christmas_pigscene"), new PaintingVariant(64, 64));
		Registry.register(Registry.PAINTING_VARIANT, new ResourceLocation(ChristmasMod.MODID, "christmas_match"), new PaintingVariant(32, 32));
	}
}
