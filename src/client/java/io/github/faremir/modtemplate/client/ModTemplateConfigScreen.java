package io.github.faremir.modtemplate.client;

import io.github.faremir.modtemplate.ModConstants;
import io.github.faremir.modtemplate.config.ModTemplateConfig;
import io.github.faremir.modtemplate.config.ModTemplateConfigManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.options.OptionsSubScreen;
import net.minecraft.network.chat.Component;


public class ModTemplateConfigScreen extends OptionsSubScreen {

    public ModTemplateConfigScreen(Screen parent) {
        super(parent, Minecraft.getInstance().options, Component.translatable(ModConstants.MOD_ID + ".settings.title"));
    }

    @Override
    protected void addOptions() {
        ModTemplateConfig config = ModTemplateConfigManager.get();

        if (this.list == null) {
            return;
        }
    }

    @Override
    public void removed() {
        ModTemplateConfigManager.save();
    }

}