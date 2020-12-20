
package net.mcreator.quarrycraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.quarrycraft.QuarrycraftModElements;

@QuarrycraftModElements.ModElement.Tag
public class CopperswordItem extends QuarrycraftModElements.ModElement {
	@ObjectHolder("quarrycraft:coppersword")
	public static final Item block = null;
	public CopperswordItem(QuarrycraftModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 40;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CopperingotItem.block, (int) (1)));
			}
		}, 3, -2.5999999999999999f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("coppersword"));
	}
}
