
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.celebration.christmas.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import net.celebration.christmas.world.features.TreeFeature;
import net.celebration.christmas.ChristmasMod;

import java.util.function.Predicate;

public class ChristmasModFeatures {
	public static void load() {
		register("tree", TreeFeature.feature(), TreeFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(ChristmasMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep,
				ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(ChristmasMod.MODID, registryName)));
	}
}
