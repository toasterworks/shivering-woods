package net.toasterworks.shiveringwoods.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.toasterworks.shiveringwoods.WoodsCommon;
import net.toasterworks.shiveringwoods.config.WoodsCommonConfig;

@Mod(WoodsCommon.MOD_ID)
public class WoodsForge {
    public WoodsForge() {
        EventBuses.registerModEventBus(WoodsCommon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        WoodsCommon.init();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, WoodsCommonConfig.SPEC);
    }
}
