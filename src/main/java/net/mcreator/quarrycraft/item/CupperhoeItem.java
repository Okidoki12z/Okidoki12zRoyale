
package net.mcreator.quarrycraft.item;

@QuarrycraftModElements.ModElement.Tag
public class CupperhoeItem extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:cupperhoe")
	public static final Item block = null;

	public CupperhoeItem(QuarrycraftModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 40;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return -1f;
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
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("cupperhoe"));
	}

}
