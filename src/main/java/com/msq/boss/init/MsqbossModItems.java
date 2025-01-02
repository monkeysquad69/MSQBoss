
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.msq.boss.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import com.msq.boss.item.IcicleDaggerItem;
import com.msq.boss.item.IceSwordItem;
import com.msq.boss.item.IceEssenceItem;
import com.msq.boss.item.BombsItem;
import com.msq.boss.MsqbossMod;

public class MsqbossModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MsqbossMod.MODID);
	public static final RegistryObject<Item> ICE_GOLEM_SPAWN_EGG = REGISTRY.register("ice_golem_spawn_egg", () -> new ForgeSpawnEggItem(MsqbossModEntities.ICE_GOLEM, -13395457, -16750849, new Item.Properties()));
	public static final RegistryObject<Item> ICE_ESSENCE = REGISTRY.register("ice_essence", () -> new IceEssenceItem());
	public static final RegistryObject<Item> ICE_SWORD = REGISTRY.register("ice_sword", () -> new IceSwordItem());
	public static final RegistryObject<Item> ICICLE_DAGGER = REGISTRY.register("icicle_dagger", () -> new IcicleDaggerItem());
	public static final RegistryObject<Item> BOMBS = REGISTRY.register("bombs", () -> new BombsItem());
	public static final RegistryObject<Item> SERGEANT_FROST_SPAWN_EGG = REGISTRY.register("sergeant_frost_spawn_egg", () -> new ForgeSpawnEggItem(MsqbossModEntities.SERGEANT_FROST, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> FIREBOOK_SPAWN_EGG = REGISTRY.register("firebook_spawn_egg", () -> new ForgeSpawnEggItem(MsqbossModEntities.FIREBOOK, -1, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
