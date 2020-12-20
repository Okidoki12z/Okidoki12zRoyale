
package net.mcreator.quarrycraft.item;

@QuarrycraftModElements.ModElement.Tag
public class BronzeAxeItem extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:bronze_axe")
	public static final Item block = null;

	public BronzeAxeItem(QuarrycraftModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("bronze_axe"));
	}

}
