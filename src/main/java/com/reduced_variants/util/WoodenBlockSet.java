package com.reduced_variants.util;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.block.BlockSetType;

public class WoodenBlockSet {
    public static final BlockSetType WOODEN = new BlockSetType(
            "wooden",
            true,
            true,
            true,
            BlockSetType.ActivationRule.EVERYTHING,
            BlockSoundGroup.WOOD,
            null,
            null,
            null,
            null,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON,
            SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON
    );
}
