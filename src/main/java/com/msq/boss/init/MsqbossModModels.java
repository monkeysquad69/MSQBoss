
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.msq.boss.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.msq.boss.client.model.Modelicicle_dagger;
import com.msq.boss.client.model.Modelbomb;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MsqbossModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbomb.LAYER_LOCATION, Modelbomb::createBodyLayer);
		event.registerLayerDefinition(Modelicicle_dagger.LAYER_LOCATION, Modelicicle_dagger::createBodyLayer);
	}
}
