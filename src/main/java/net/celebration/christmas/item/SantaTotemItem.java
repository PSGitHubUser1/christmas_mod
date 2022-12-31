
package net.celebration.christmas.item;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.celebration.christmas.procedures.SantaTotemRightclickedProcedure;
import net.celebration.christmas.procedures.SantaTotemEntitySwingsItemProcedure;
import net.celebration.christmas.init.ChristmasModTabs;

import java.util.List;

import io.github.fabricators_of_create.porting_lib.item.EntitySwingListenerItem;

public class SantaTotemItem extends Item implements EntitySwingListenerItem {
	public SantaTotemItem() {
		super(new Item.Properties().tab(ChristmasModTabs.TAB_INFOY_CHRISTMAS).stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Totem of Healing"));
		list.add(Component.literal("Right-click to heal yourself!"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SantaTotemRightclickedProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x)
				.put("y", y).put("z", z).put("entity", entity).build());
		return ar;
	}

	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		LevelAccessor world = entity.level;

		SantaTotemEntitySwingsItemProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
		return false;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		SantaTotemRightclickedProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", context.getLevel())
				.put("x", context.getClickedPos().getX()).put("y", context.getClickedPos().getY()).put("z", context.getClickedPos().getZ())
				.put("entity", context.getPlayer()).build());
		return retval;
	}
}
