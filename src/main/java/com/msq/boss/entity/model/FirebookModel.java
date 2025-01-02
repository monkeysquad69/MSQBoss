package com.msq.boss.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.msq.boss.entity.FirebookEntity;

public class FirebookModel extends GeoModel<FirebookEntity> {
	@Override
	public ResourceLocation getAnimationResource(FirebookEntity entity) {
		return new ResourceLocation("msqboss", "animations/fire_book.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FirebookEntity entity) {
		return new ResourceLocation("msqboss", "geo/fire_book.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FirebookEntity entity) {
		return new ResourceLocation("msqboss", "textures/entities/" + entity.getTexture() + ".png");
	}

}
