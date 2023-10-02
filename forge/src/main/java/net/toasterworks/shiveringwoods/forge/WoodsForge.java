package net.toasterworks.shiveringwoods.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.toasterworks.shiveringwoods.WoodsCommon;

@Mod(WoodsCommon.MOD_ID)
public class WoodsForge {
    public WoodsForge() {
        EventBuses.registerModEventBus(WoodsCommon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        WoodsCommon.init();
    }
}
