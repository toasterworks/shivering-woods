package net.toasterworks.shiveringwoods.block;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.toasterworks.shiveringwoods.api.block.HollowBlock;
import net.toasterworks.shiveringwoods.api.registry.Registration;

public class WoodsBlocks {
    public static void registerModBlocks() { }

    public static final RegistrySupplier<Block> OAK_LOG_HOLLOW = Registration.registerBlock("oak_log_hollow", () -> new HollowBlock(
            BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .strength(2.0F)
                    .instrument(NoteBlockInstrument.BASS)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
    ));
}