package net.toasterworks.shiveringwoods.fabric;

import net.fabricmc.api.ModInitializer;
import net.toasterworks.shiveringwoods.WoodsCommon;

public class WoodsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        WoodsCommon.init();
    }
}
