
package net.mcreator.quarrycraft.item;

@QuarrycraftModElements.ModElement.Tag
public class CopperpickaxeItem extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:copperpickaxe")
	public static final Item block = null;

	public CopperpickaxeItem(QuarrycraftModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("copperpickaxe"));
	}

}
