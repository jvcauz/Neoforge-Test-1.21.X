package com.jvcauz.testmod.item;

import com.jvcauz.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // ITEMS
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MODID);

    // CRIANDO O ITEM PANCaKeS
    public static final DeferredItem<Item> PANCAKES = ITEMS.register("pancakes",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
