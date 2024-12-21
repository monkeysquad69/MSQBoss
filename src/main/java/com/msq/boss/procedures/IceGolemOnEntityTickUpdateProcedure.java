package com.msq.boss.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingChangeTargetEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class IceGolemOnEntityTickUpdateProcedure {
	@SubscribeEvent
	public static void onEntitySetsAttackTarget(LivingChangeTargetEvent event) {
		execute(event, event.getOriginalTarget(), event.getEntity());
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity instanceof Player)) {
			entity.setSprinting(false);
		} else {
			entity.setSprinting(true);
		}
	}
}
