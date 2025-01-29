package xyz.drwhomust.emeraldripoff.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import xyz.drwhomust.emeraldripoff.GlorifiedEmeralds;

public class ModBlocks {
        public static final Block ruby_ore = registerBlock("ruby_ore",
                new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block) {
      registerBlockItem(name, block);
      return Registry.register(Registries.BLOCK, Identifier.of(GlorifiedEmeralds.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GlorifiedEmeralds.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GlorifiedEmeralds.LOGGER.info("Registering Mod Blocks for " + GlorifiedEmeralds.MOD_ID);

    }
}
