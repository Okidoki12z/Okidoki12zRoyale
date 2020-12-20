
package net.mcreator.quarrycraft.block;

import net.minecraft.block.material.Material;

@QuarrycraftModElements.ModElement.Tag
public class TinoreBlock extends QuarrycraftModElements.ModElement {

	@ObjectHolder("quarrycraft:tinore")
	public static final Block block = null;

	public TinoreBlock(QuarrycraftModElements instance) {
		super(instance, 32);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(WTFItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.1999999999999997f, 10f).lightValue(0)
							.harvestLevel(1).harvestTool(ToolType.PICKAXE));

			setRegistryName("tinore");
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
