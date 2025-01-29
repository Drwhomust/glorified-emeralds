package xyz.drwhomust.emeraldripoff.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.drwhomust.emeraldripoff.GlorifiedEmeralds;

public class Moditems {
    public static final Item ruby = registerItem("ruby", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(GlorifiedEmeralds.MOD_ID, name), item);
}

    public static void registerModItems() {
        GlorifiedEmeralds.LOGGER.info("Registering Mod Items for " + GlorifiedEmeralds.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ruby);
        });
    }
}
