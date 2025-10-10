package dev.itsLarss.arcanewilds.datagen;

import dev.itsLarss.arcanewilds.ArcaneWilds;
import dev.itsLarss.arcanewilds.item.ModItemClass;
import dev.itsLarss.arcanewilds.utils.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                              CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, ArcaneWilds.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItemClass.AMETHYST_HELMET.get())
                .add(ModItemClass.AMETHYST_CHESTPLATE.get())
                .add(ModItemClass.AMETHYST_LEGGINGS.get())
                .add(ModItemClass.AMETHYST_BOOTS.get())
                .add(ModItemClass.JADE_HELMET.get())
                .add(ModItemClass.JADE_CHESTPLATE.get())
                .add(ModItemClass.JADE_LEGGINGS.get())
                .add(ModItemClass.JADE_BOOTS.get())
                .add(ModItemClass.IGNIUM_HELMET.get())
                .add(ModItemClass.IGNIUM_CHESTPLATE.get())
                .add(ModItemClass.IGNIUM_LEGGINGS.get())
                .add(ModItemClass.IGNIUM_BOOTS.get());
    }
}
