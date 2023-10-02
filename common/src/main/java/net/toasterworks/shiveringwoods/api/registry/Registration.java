package net.toasterworks.shiveringwoods.api.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.toasterworks.shiveringwoods.WoodsCommon;
import net.toasterworks.shiveringwoods.tabs.WoodsTabs;

import java.util.function.Supplier;

public class Registration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(WoodsCommon.MOD_ID, Registries.ITEM);

    public static <T extends Item> RegistrySupplier<T> registerItem(String id, Supplier<T> item) {
        return ITEMS.register(id, item);
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(WoodsCommon.MOD_ID, Registries.BLOCK);

    public static <T extends Block> RegistrySupplier<T> registerBlock(String id, Supplier<T> block) {
        return registerBlock(id, block, true);
    }

    public static <T extends Block> RegistrySupplier<T> registerBlock(String id, Supplier<T> block, boolean createItem) {
        RegistrySupplier<T> return_value = BLOCKS.register(id, block);
        if (createItem) { registerBlockItem(id, return_value, WoodsTabs.MAIN_TAB.get()); }
        return return_value;
    }

    private static <T extends Block> RegistrySupplier<Item> registerBlockItem(String id, RegistrySupplier<T> block, CreativeModeTab tab) {
        return Registration.registerItem(id, () -> new BlockItem(block.get(), new Item.Properties().arch$tab(tab)));
    }

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(WoodsCommon.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static void init() {
        ITEMS.register();
        BLOCKS.register();
        TABS.register();
    }
}
