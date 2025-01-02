package com.msq.boss.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.msq.boss.entity.SergentFrostEntity;

public class SergentFrostModel extends GeoModel<SergentFrostEntity> {
	@Override
	public ResourceLocation getAnimationResource(SergentFrostEntity entity) {
		return new ResourceLocation("msqboss", "animations/big_snowman.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SergentFrostEntity entity) {
		return new ResourceLocation("msqboss", "geo/big_snowman.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SergentFrostEntity entity) {
		return new ResourceLocation("msqboss", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(SergentFrostEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
