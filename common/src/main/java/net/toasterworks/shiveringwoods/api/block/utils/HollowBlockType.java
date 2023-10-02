package net.toasterworks.shiveringwoods.api.block.utils;

import net.minecraft.util.StringRepresentable;

public enum HollowBlockType implements StringRepresentable {
    UNTOUCHED("untouched"),
    HOSTILE("hostile"),
    MERCHANT("merchant"),
    EMPTY("empty");

    private final String name;

    private HollowBlockType(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }
}
