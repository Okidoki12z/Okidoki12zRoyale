
package net.mcreator.quarrycraft.item;

@QuarrycraftModElements.ModElement.Tag
public class PinkCrystalShardItem extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:pink_crystal_shard")
	public static final Item block = null;

	public PinkCrystalShardItem(QuarrycraftModElements instance) {
		super(instance, 35);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(WTFItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("pink_crystal_shard");
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
