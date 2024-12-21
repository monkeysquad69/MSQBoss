
package com.msq.boss.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IceEssenceItem extends Item {
	public IceEssenceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
