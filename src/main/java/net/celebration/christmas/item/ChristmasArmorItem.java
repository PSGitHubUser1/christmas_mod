
package net.celebration.christmas.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.celebration.christmas.init.ChristmasModTabs;
import net.celebration.christmas.init.ChristmasModItems;

public abstract class ChristmasArmorItem extends ArmorItem {
	public ChristmasArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 7, 8, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 8;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.ARMOR_EQUIP_LEATHER;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ChristmasModItems.GINGER_BREAD_COOKIE));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "_finale";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.4f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ChristmasArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ChristmasModTabs.TAB_INFOY_CHRISTMAS));
		}

	}

	public static class Chestplate extends ChristmasArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ChristmasModTabs.TAB_INFOY_CHRISTMAS));
		}

	}

	public static class Leggings extends ChristmasArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ChristmasModTabs.TAB_INFOY_CHRISTMAS));
		}

	}

	public static class Boots extends ChristmasArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ChristmasModTabs.TAB_INFOY_CHRISTMAS));
		}

	}
}
