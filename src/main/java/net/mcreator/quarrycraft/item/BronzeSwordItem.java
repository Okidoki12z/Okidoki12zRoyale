
package net.mcreator.quarrycraft.item;

@QuarrycraftModElements.ModElement.Tag
public class BronzeSwordItem extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:bronze_sword")
	public static final Item block = null;

	public BronzeSwordItem(QuarrycraftModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("bronze_sword"));
	}

}
