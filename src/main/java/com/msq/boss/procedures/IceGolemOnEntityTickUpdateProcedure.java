package com.msq.boss.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class IceGolemOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
			entity.setSprinting(true);
			entity.setMaxUpStep(1);
		} else {
			entity.setSprinting(false);
			entity.setMaxUpStep((float) 0.3);
		}
	}
}
