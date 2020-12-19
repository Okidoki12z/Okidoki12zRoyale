
package net.mcreator.quarrycraft.item;

@QuarrycraftModElements.ModElement.Tag
public class CoppershovelItem extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:coppershovel")
	public static final Item block = null;

	public CoppershovelItem(QuarrycraftModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 40;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 1f;
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("coppershovel"));
	}

}
