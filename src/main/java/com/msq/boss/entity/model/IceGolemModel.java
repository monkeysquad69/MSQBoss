package com.msq.boss.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.msq.boss.entity.IceGolemEntity;

public class IceGolemModel extends GeoModel<IceGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(IceGolemEntity entity) {
		return new ResourceLocation("msqboss", "animations/ice_golem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IceGolemEntity entity) {
		return new ResourceLocation("msqboss", "geo/ice_golem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IceGolemEntity entity) {
		return new ResourceLocation("msqboss", "textures/entities/" + entity.getTexture() + ".png");
	}

}
