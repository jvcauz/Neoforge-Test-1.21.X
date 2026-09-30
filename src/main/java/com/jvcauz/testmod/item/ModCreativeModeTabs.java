package com.jvcauz.testmod.item;

import com.jvcauz.testmod.TestMod;
import com.jvcauz.testmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MODID);

    public static final Supplier<CreativeModeTab> TESTMOD_GENERAL_TAB = CREATIVE_MODE_TAB.register("testmod_general_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PANCAKES.get()))
                    .title(Component.translatable("creativetab.testmod.testmod_general"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PANCAKES);
                        output.accept(ModBlocks.REPLOON);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
