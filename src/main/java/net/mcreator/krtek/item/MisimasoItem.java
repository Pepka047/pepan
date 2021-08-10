
package net.mcreator.krtek.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.krtek.KrtekModElements;

@KrtekModElements.ModElement.Tag
public class MisimasoItem extends KrtekModElements.ModElement {
	@ObjectHolder("krtek:misimaso")
	public static final Item block = null;
	public MisimasoItem(KrtekModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.RARE)
					.food((new Food.Builder()).hunger(6).saturation(3f).build()));
			setRegistryName("misimaso");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 447;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
