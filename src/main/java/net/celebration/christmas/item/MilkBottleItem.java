
package net.celebration.christmas.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.celebration.christmas.procedures.MilkBottlePlayerFinishesUsingItemProcedure;
import net.celebration.christmas.init.ChristmasModTabs;

public class MilkBottleItem extends Item {
	public MilkBottleItem() {
		super(new Item.Properties().tab(ChristmasModTabs.TAB_INFOY_CHRISTMAS).stacksTo(1).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.3f).alwaysEat()

						.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Items.GLASS_BOTTLE);
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MilkBottlePlayerFinishesUsingItemProcedure
				.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
