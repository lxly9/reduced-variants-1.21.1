package com.reduced_variants;

import com.reduced_variants.block.BaseBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReducedVariants implements ModInitializer {
	public static final String MOD_ID = "reduced_variants";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BaseBlocks.initialize();
		LOGGER.info("Loaded Reduced Variants!");
	}
}