
package net.mcreator.quarrycraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.quarrycraft.itemgroup.WTFItemGroup;
import net.mcreator.quarrycraft.QuarrycraftModElements;

@QuarrycraftModElements.ModElement.Tag
public class BluecrystalshardItem extends QuarrycraftModElements.ModElement {
	@ObjectHolder("quarrycraft:bluecrystalshard")
	public static final Item block = null;
	public BluecrystalshardItem(QuarrycraftModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(WTFItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bluecrystalshard");
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
