package io.github.nl32.ultimate_ui;

import net.fabricmc.fabric.mixin.client.rendering.InGameHudMixin;
import net.minecraft.client.MinecraftClient;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class UltimateUI implements ClientModInitializer {

	@Override
	public void onInitializeClient(ModContainer mod) {
		MinecraftClient client = MinecraftClient.getInstance();
		client.inGameHud.renderExperienceBar();
	}
}
