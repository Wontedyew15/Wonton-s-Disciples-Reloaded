
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wontonsdisciples.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.wontonsdisciples.WontonsDisciplesMod;

public class WontonsDisciplesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WontonsDisciplesMod.MODID);
	public static final RegistryObject<CreativeModeTab> WONTONSCOLLECTIBLES = REGISTRY.register("wontonscollectibles",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.wontons_disciples.wontonscollectibles")).icon(() -> new ItemStack(WontonsDisciplesModBlocks.WONTONIUMORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WontonsDisciplesModBlocks.WONTONIUMORE.get().asItem());
				tabData.accept(WontonsDisciplesModBlocks.WIELDIRIUM.get().asItem());
				tabData.accept(WontonsDisciplesModItems.RAW_WONTONIUM.get());
				tabData.accept(WontonsDisciplesModItems.WIELDERIUM.get());
			})

					.build());
}
