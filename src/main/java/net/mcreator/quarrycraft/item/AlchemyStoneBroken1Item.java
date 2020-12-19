
package net.mcreator.quarrycraft.item;

@QuarrycraftModElements.ModElement.Tag
public class AlchemyStoneBroken1Item extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:alchemy_stone_broken_1")
	public static final Item block = null;

	public AlchemyStoneBroken1Item(QuarrycraftModElements instance) {
		super(instance, 2);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(WTFItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("alchemy_stone_broken_1");
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
