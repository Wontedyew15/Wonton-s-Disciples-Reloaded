
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wontonsdisciples.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.wontonsdisciples.block.WontoniumoreBlock;
import net.mcreator.wontonsdisciples.block.WieldiriumBlock;
import net.mcreator.wontonsdisciples.WontonsDisciplesMod;

public class WontonsDisciplesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WontonsDisciplesMod.MODID);
	public static final RegistryObject<Block> WONTONIUMORE = REGISTRY.register("wontoniumore", () -> new WontoniumoreBlock());
	public static final RegistryObject<Block> WIELDIRIUM = REGISTRY.register("wieldirium", () -> new WieldiriumBlock());
}
