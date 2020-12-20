
package net.mcreator.alchemaigica.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.alchemaigica.AlchemaigicaModElements;

@AlchemaigicaModElements.ModElement.Tag
public class BronzeAxeItem extends AlchemaigicaModElements.ModElement {
	@ObjectHolder("alchemaigica:bronze_axe")
	public static final Item block = null;
	public BronzeAxeItem(AlchemaigicaModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 270;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 7.2f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BronzeIngotItem.block, (int) (1)));
			}
		}, 1, -3.1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("bronze_axe"));
	}
}
