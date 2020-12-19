
package net.mcreator.quarrycraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.quarrycraft.QuarrycraftModElements;

@QuarrycraftModElements.ModElement.Tag
public class CupperhoeItem extends QuarrycraftModElements.ModElement {
	@ObjectHolder("quarrycraft:cupperhoe")
	public static final Item block = null;
	public CupperhoeItem(QuarrycraftModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 40;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CopperingotItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("cupperhoe"));
	}
}
