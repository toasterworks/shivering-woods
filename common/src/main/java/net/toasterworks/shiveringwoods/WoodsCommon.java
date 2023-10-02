package net.toasterworks.shiveringwoods;

import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.minecraftforge.fml.config.ModConfig;
import net.toasterworks.shiveringwoods.api.registry.Registration;
import net.toasterworks.shiveringwoods.block.WoodsBlocks;
import net.toasterworks.shiveringwoods.config.WoodsCommonConfig;
import net.toasterworks.shiveringwoods.item.WoodsItems;
import net.toasterworks.shiveringwoods.tabs.WoodsTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WoodsCommon {
    public static final String MOD_ID = "shiveringwoods";

    public static Logger logger = LogManager.getLogger(MOD_ID);

    public static void init() {
        Registration.init();

        WoodsBlocks.registerModBlocks();
        WoodsItems.registerModItems();
        WoodsTabs.registerModTabs();
    }
}
