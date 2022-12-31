
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.celebration.christmas.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.celebration.christmas.item.SweetCandyItem;
import net.celebration.christmas.item.SantaTotemItem;
import net.celebration.christmas.item.SantaDiscFragmentItem;
import net.celebration.christmas.item.SantaDayItem;
import net.celebration.christmas.item.MortalPestleItem;
import net.celebration.christmas.item.MilkBottleItem;
import net.celebration.christmas.item.JamOnBreadItem;
import net.celebration.christmas.item.JamBottleItem;
import net.celebration.christmas.item.IronBottleItem;
import net.celebration.christmas.item.HotMilkItem;
import net.celebration.christmas.item.HotMilkBottleSmall1Item;
import net.celebration.christmas.item.HotGingerMilkItem;
import net.celebration.christmas.item.GingerBreadCookieItem;
import net.celebration.christmas.item.ChristmasFunDiscItem;
import net.celebration.christmas.item.ChristmasArmorItem;
import net.celebration.christmas.item.ChocoMilkBottleItem;
import net.celebration.christmas.item.CandyCaneItem;
import net.celebration.christmas.item.AppleJuiceBottleItem;
import net.celebration.christmas.ChristmasMod;

public class ChristmasModItems {
	public static Item SANTA_TOTEM;
	public static Item GINGER_BREAD_COOKIE;
	public static Item SWEET_HOT_MILK;
	public static Item HOT_COFFEE_MILK;
	public static Item MILK_BOTTLE;
	public static Item SWEET_CANDY;
	public static Item CANDY_CANE;
	public static Item CHRISTMAS_ARMOR_HELMET;
	public static Item CHRISTMAS_ARMOR_CHESTPLATE;
	public static Item CHRISTMAS_ARMOR_LEGGINGS;
	public static Item CHRISTMAS_ARMOR_BOOTS;
	public static Item CHRISTMASFUN_DISC;
	public static Item SANTA_DAY;
	public static Item SANTA_DISC_FRAGMENT;
	public static Item MORTAL_PESTLE;
	public static Item APPLE_JUICE_BOTTLE;
	public static Item IRON_BOTTLE;
	public static Item CHOCO_MILK_BOTTLE;
	public static Item JAM_BOTTLE;
	public static Item JAM_ON_BREAD;
	public static Item HOT_MILK_BOTTLE_SMALL;

	public static void load() {
		SANTA_TOTEM = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "santa_totem"), new SantaTotemItem());
		GINGER_BREAD_COOKIE = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "ginger_bread_cookie"),
				new GingerBreadCookieItem());
		SWEET_HOT_MILK = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "sweet_hot_milk"), new HotMilkItem());
		HOT_COFFEE_MILK = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "hot_coffee_milk"), new HotGingerMilkItem());
		MILK_BOTTLE = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "milk_bottle"), new MilkBottleItem());
		SWEET_CANDY = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "sweet_candy"), new SweetCandyItem());
		CANDY_CANE = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "candy_cane"), new CandyCaneItem());
		CHRISTMAS_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "christmas_armor_helmet"),
				new ChristmasArmorItem.Helmet());
		CHRISTMAS_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "christmas_armor_chestplate"),
				new ChristmasArmorItem.Chestplate());
		CHRISTMAS_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "christmas_armor_leggings"),
				new ChristmasArmorItem.Leggings());
		CHRISTMAS_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "christmas_armor_boots"),
				new ChristmasArmorItem.Boots());
		CHRISTMASFUN_DISC = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "christmasfun_disc"),
				new ChristmasFunDiscItem());
		SANTA_DAY = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "santa_day"), new SantaDayItem());
		SANTA_DISC_FRAGMENT = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "santa_disc_fragment"),
				new SantaDiscFragmentItem());
		MORTAL_PESTLE = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "mortal_pestle"), new MortalPestleItem());
		APPLE_JUICE_BOTTLE = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "apple_juice_bottle"),
				new AppleJuiceBottleItem());
		IRON_BOTTLE = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "iron_bottle"), new IronBottleItem());
		CHOCO_MILK_BOTTLE = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "choco_milk_bottle"),
				new ChocoMilkBottleItem());
		JAM_BOTTLE = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "jam_bottle"), new JamBottleItem());
		JAM_ON_BREAD = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "jam_on_bread"), new JamOnBreadItem());
		HOT_MILK_BOTTLE_SMALL = Registry.register(Registry.ITEM, new ResourceLocation(ChristmasMod.MODID, "hot_milk_bottle_small"),
				new HotMilkBottleSmall1Item());
	}
}
