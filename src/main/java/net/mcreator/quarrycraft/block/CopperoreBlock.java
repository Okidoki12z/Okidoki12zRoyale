
package net.mcreator.quarrycraft.block;

import net.minecraft.block.material.Material;

@QuarrycraftModElements.ModElement.Tag
public class CopperoreBlock extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:copperore")
	public static final Block block = null;

	public CopperoreBlock(QuarrycraftModElements instance) {
		super(instance, 2);

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

					Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(2.1999999999999997f, 10f).lightValue(0)
							.harvestLevel(1).harvestTool(ToolType.PICKAXE));

			setRegistryName("copperore");
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
