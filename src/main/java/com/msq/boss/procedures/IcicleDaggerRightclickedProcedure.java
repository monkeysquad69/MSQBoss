package com.msq.boss.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import com.msq.boss.init.MsqbossModEntities;
import com.msq.boss.entity.IceCubesEntity;

public class IcicleDaggerRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new IceCubesEntity(MsqbossModEntities.ICE_CUBES.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 5, 1);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(1, 1, 1, 1, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
	}
}
