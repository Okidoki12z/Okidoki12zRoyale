
package net.mcreator.quarrycraft.itemgroup;

@QuarrycraftModElements.ModElement.Tag
public class WTFItemGroup extends QuarrycraftModElements.ModElement {

	public WTFItemGroup(QuarrycraftModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabwtf") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AlchemyStone1Item.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
