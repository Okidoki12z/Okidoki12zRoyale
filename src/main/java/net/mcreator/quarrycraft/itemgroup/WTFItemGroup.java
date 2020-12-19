
package net.mcreator.quarrycraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.quarrycraft.item.AlchemyStone1Item;
import net.mcreator.quarrycraft.QuarrycraftModElements;

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
