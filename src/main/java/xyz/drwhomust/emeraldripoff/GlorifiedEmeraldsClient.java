package xyz.drwhomust.emeraldripoff;

import net.fabricmc.api.ClientModInitializer;
import xyz.drwhomust.emeraldripoff.block.ModBlocks;
import xyz.drwhomust.emeraldripoff.item.Moditems;

public class GlorifiedEmeraldsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Moditems.registerModItems();
        ModBlocks.registerModBlocks();

        // starts to add blocks and items
    }
}
