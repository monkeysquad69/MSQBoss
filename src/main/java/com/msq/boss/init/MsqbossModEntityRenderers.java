
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.msq.boss.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.msq.boss.client.renderer.SergentFrostRenderer;
import com.msq.boss.client.renderer.IceGolemRenderer;
import com.msq.boss.client.renderer.IceCubesRenderer;
import com.msq.boss.client.renderer.FirebookRenderer;
import com.msq.boss.client.renderer.BombRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MsqbossModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MsqbossModEntities.ICE_GOLEM.get(), IceGolemRenderer::new);
		event.registerEntityRenderer(MsqbossModEntities.ICE_CUBES.get(), IceCubesRenderer::new);
		event.registerEntityRenderer(MsqbossModEntities.BOMBS.get(), BombRenderer::new);
		event.registerEntityRenderer(MsqbossModEntities.SERGEANT_FROST.get(), SergentFrostRenderer::new);
		event.registerEntityRenderer(MsqbossModEntities.FIREBOOK.get(), FirebookRenderer::new);
	}
}
