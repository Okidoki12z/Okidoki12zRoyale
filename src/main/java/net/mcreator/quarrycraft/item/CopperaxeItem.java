
package net.mcreator.quarrycraft.item;

@QuarrycraftModElements.ModElement.Tag
public class CopperaxeItem extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:copperaxe")
	public static final Item block = null;

	public CopperaxeItem(QuarrycraftModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 40;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 6f;
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

		}.setRegistryName("copperaxe"));
	}

}
