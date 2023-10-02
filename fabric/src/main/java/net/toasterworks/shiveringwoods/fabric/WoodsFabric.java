package net.toasterworks.shiveringwoods.fabric;

import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraftforge.fml.config.ModConfig;
import net.toasterworks.shiveringwoods.WoodsCommon;
import net.toasterworks.shiveringwoods.config.WoodsCommonConfig;

public class WoodsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        WoodsCommon.init();

        ForgeConfigRegistry.INSTANCE.register("shiveringwoods", ModConfig.Type.COMMON, WoodsCommonConfig.SPEC);
    }
}
