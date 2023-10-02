package net.toasterworks.shiveringwoods.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class WoodsCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.ConfigValue<Integer> WOODS_INHABITANT_EMPTY;
    public static ForgeConfigSpec.ConfigValue<Integer> WOODS_INHABITANT_MERCHANT;
    public static ForgeConfigSpec.ConfigValue<Integer> WOODS_INHABITANT_SURPRISE;

    static {
        BUILDER.push("hollowInhabitants");

            WOODS_INHABITANT_EMPTY = BUILDER.comment("Empty hollow chance").define("emptyHollowChance", 9);
            WOODS_INHABITANT_MERCHANT = BUILDER.comment("Merchant hollow chance").define("merchantHollowChance", 3);
            WOODS_INHABITANT_SURPRISE = BUILDER.comment("\"Surprise\" hollow chance").define("surpriseHollowChance", 1);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
