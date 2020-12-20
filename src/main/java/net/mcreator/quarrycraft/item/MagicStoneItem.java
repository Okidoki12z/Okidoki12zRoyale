
package net.mcreator.quarrycraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.quarrycraft.itemgroup.WTFItemGroup;
import net.mcreator.quarrycraft.QuarrycraftModElements;

import java.util.List;

@QuarrycraftModElements.ModElement.Tag
public class MagicStoneItem extends QuarrycraftModElements.ModElement {
	@ObjectHolder("quarrycraft:alchemy_stone")
	public static final Item block = null;
	public MagicStoneItem(QuarrycraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(WTFItemGroup.tab).maxDamage(10).rarity(Rarity.COMMON));
			setRegistryName("alchemy_stone");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\u00A7bTransform cobblestone into coal"));
		}
	}
}
