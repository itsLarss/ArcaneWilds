package dev.itsLarss.arcanewilds.utils;

import dev.itsLarss.arcanewilds.ArcaneWilds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_JADE_TOOL = createTag("needs_jade_tool");
        public static final TagKey<Block> INCORRECT_FOR_JADE_TOOL = createTag("incorrect_for_jade_tool");
        public static final TagKey<Block> NEEDS_AMETHYST_TOOL = createTag("needs_amethyst_tool");
        public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TOOL = createTag("incorrect_for_amethyst_tool");
        public static final TagKey<Block> NEEDS_IGNIUM_TOOL = createTag("needs_ignium_tool");
        public static final TagKey<Block> INCORRECT_FOR_IGNIUM_TOOL = createTag("incorrect_for_ignium_tool");



        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ArcaneWilds.MOD_ID, name));
        }
    }

    public static class Items {

    public static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ArcaneWilds.MOD_ID, name));
        }
    }
}
