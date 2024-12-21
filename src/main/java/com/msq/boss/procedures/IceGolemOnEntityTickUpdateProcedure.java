package com.msq.boss.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import com.msq.boss.entity.IceGolemEntity;

public class IceGolemOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 5) {
			if (entity instanceof IceGolemEntity animatable)
				animatable.setTexture("angry_ice_golem");
			if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity2.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(7.5);
		} else {
			if (entity instanceof IceGolemEntity animatable)
				animatable.setTexture("ice_golem");
			if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity4.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(5);
		}
	}
}
