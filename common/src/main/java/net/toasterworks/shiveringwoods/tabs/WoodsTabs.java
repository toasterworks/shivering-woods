package net.toasterworks.shiveringwoods.tabs;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.toasterworks.shiveringwoods.api.registry.Registration;
import net.toasterworks.shiveringwoods.block.WoodsBlocks;
import net.toasterworks.shiveringwoods.item.WoodsItems;

public class WoodsTabs {
    public static void registerModTabs() { }

    public static final RegistrySupplier<CreativeModeTab> MAIN_TAB = Registration.TABS.register("main_tab", () -> CreativeTabRegistry.create(
            Component.translatable("category.shiveringwoods.main_tab"),
            () -> new ItemStack(WoodsItems.TOOTH.get())
    ));
}
