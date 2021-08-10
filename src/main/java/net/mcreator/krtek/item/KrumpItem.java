
package net.mcreator.krtek.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.krtek.KrtekModElements;

@KrtekModElements.ModElement.Tag
public class KrumpItem extends KrtekModElements.ModElement {
	@ObjectHolder("krtek:krump")
	public static final Item block = null;
	public KrumpItem(KrtekModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 826;
			}

			public float getEfficiency() {
				return 43f;
			}

			public float getAttackDamage() {
				return 48f;
			}

			public int getHarvestLevel() {
				return 100;
			}

			public int getEnchantability() {
				return 32;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 36f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("krump"));
	}
}
