package xyz.drwhomust.emeraldripoff.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import xyz.drwhomust.emeraldripoff.GlorifiedEmeralds;

// adds item ruby
public class Moditems {
    public static final Item ruby = registerItem("ruby", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GlorifiedEmeralds.MOD_ID,"ruby")))));
    /* dear who ever works on this mod
    please write down however many hours to find this bug (yes this is from Coding with Lewis video)

    hours wasted: 1
     */

    //this does something with adding it to minecraft. idk i forgot
    private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(GlorifiedEmeralds.MOD_ID, name), item);
}

    // it Register the item
    public static void registerModItems() {
        GlorifiedEmeralds.LOGGER.info("Registering Mod Items for " + GlorifiedEmeralds.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ruby);
        });
    }
}
