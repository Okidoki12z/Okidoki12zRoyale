
package net.mcreator.alchemaigica.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.alchemaigica.itemgroup.WTFItemGroup;
import net.mcreator.alchemaigica.AlchemaigicaModElements;

@AlchemaigicaModElements.ModElement.Tag
public class AlchemyStoneBroken2Item extends AlchemaigicaModElements.ModElement {
	@ObjectHolder("alchemaigica:alchemy_stone_broken_2")
	public static final Item block = null;
	public AlchemyStoneBroken2Item(AlchemaigicaModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(WTFItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("alchemy_stone_broken_2");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}