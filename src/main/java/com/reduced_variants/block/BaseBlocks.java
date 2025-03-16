package com.reduced_variants.block;

import com.reduced_variants.ReducedVariants;
import com.reduced_variants.util.WoodenBlockSet;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BaseBlocks {

    public static final Block WOODEN_BUTTON = register(
            new ButtonBlock(
                    WoodenBlockSet.WOODEN,
                    3,
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(0.5f, 0.5f)
            ),
            "wooden_button",
            true
    );

    public static void registerModItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register((itemGroup) -> {
            itemGroup.add(BaseBlocks.WOODEN_BUTTON.asItem());
        });
    }

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(ReducedVariants.MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }
    public static void initialize() {}
}