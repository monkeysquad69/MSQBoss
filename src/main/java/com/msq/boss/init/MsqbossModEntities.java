
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.msq.boss.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.msq.boss.entity.IceGolemEntity;
import com.msq.boss.entity.IceCubesEntity;
import com.msq.boss.entity.BombEntity;
import com.msq.boss.MsqbossMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MsqbossModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MsqbossMod.MODID);
	public static final RegistryObject<EntityType<IceGolemEntity>> ICE_GOLEM = register("ice_golem",
			EntityType.Builder.<IceGolemEntity>of(IceGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IceGolemEntity::new)

					.sized(1f, 1.5f));
	public static final RegistryObject<EntityType<IceCubesEntity>> ICE_CUBES = register("ice_cubes",
			EntityType.Builder.<IceCubesEntity>of(IceCubesEntity::new, MobCategory.MISC).setCustomClientFactory(IceCubesEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BombEntity>> BOMBS = register("bombs",
			EntityType.Builder.<BombEntity>of(BombEntity::new, MobCategory.MISC).setCustomClientFactory(BombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.8f, 0.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			IceGolemEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ICE_GOLEM.get(), IceGolemEntity.createAttributes().build());
	}
}
