package dev.itsLarss.arcanewilds.datagen;

import dev.itsLarss.arcanewilds.ArcaneWilds;
import dev.itsLarss.arcanewilds.block.ModBlockClass;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ArcaneWilds.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        /**
         * blockWithItem(ModBlockClass.TEST_BLOCK);
         **/

        blockWithItem(ModBlockClass.AMETHYST_ORE);
        blockWithItem(ModBlockClass.JADEIT_ORE);
        blockWithItem(ModBlockClass.IGNIUM_ORE);

        blockWithItem(ModBlockClass.AMETHYST_DEEPSLATE_ORE);
        blockWithItem(ModBlockClass.JADEIT_DEEPSLATE_ORE);

        blockWithItem(ModBlockClass.AMETHYST_BLOCK);
        blockWithItem(ModBlockClass.JADE_BLOCK);
        blockWithItem(ModBlockClass.IGNIUM_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
