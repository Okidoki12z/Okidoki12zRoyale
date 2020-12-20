
package net.mcreator.quarrycraft.item;

@QuarrycraftModElements.ModElement.Tag
public class BronzeIngotItem extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:bronze_ingot")
	public static final Item block = null;

	public BronzeIngotItem(QuarrycraftModElements instance) {
		super(instance, 35);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bronze_ingot");
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
