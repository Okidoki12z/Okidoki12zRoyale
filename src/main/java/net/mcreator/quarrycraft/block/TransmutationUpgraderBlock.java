
package net.mcreator.quarrycraft.block;

import net.minecraft.block.material.Material;

@QuarrycraftModElements.ModElement.Tag
public class TransmutationUpgraderBlock extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:transmutation_upgrader")
	public static final Block block = null;

	public TransmutationUpgraderBlock(QuarrycraftModElements instance) {
		super(instance, 6);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).lightValue(0));

			setRegistryName("transmutation_upgrader");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
