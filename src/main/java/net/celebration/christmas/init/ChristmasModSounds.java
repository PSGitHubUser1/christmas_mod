
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.celebration.christmas.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class ChristmasModSounds {
	public static SoundEvent CHRISTMAS_FUN = new SoundEvent(new ResourceLocation("christmas", "christmas_fun"));
	public static SoundEvent SANTA = new SoundEvent(new ResourceLocation("christmas", "santa"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("christmas", "christmas_fun"), CHRISTMAS_FUN);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("christmas", "santa"), SANTA);
	}
}
