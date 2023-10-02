package net.toasterworks.shiveringwoods.item;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import net.toasterworks.shiveringwoods.api.registry.Registration;
import net.toasterworks.shiveringwoods.tabs.WoodsTabs;

public class WoodsItems {
    public static void registerModItems() { }

    public static final RegistrySupplier<Item> TOOTH = Registration.registerItem("tooth", () -> new Item(new Item.Properties().arch$tab(WoodsTabs.MAIN_TAB)));
    //public static final RegistrySupplier<Item> TOOTH = Registration.ITEMS.register("tooth", () -> new Item(new Item.Properties().arch$tab(WoodsTabs.MAIN_TAB.get())));
}
