
package net.mcreator.quarrycraft.item;

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

	}

}
