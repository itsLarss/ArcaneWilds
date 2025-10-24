package dev.itsLarss.arcanewilds.datagen;

import dev.itsLarss.arcanewilds.ArcaneWilds;
import dev.itsLarss.arcanewilds.block.ModBlockClass;
import dev.itsLarss.arcanewilds.block.berries.StrawberryBushBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

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

        makeBush(ModBlockClass.STRAWBERRY_BUSH.get(), "strawberry_bush", "strawberry_bush");
        makeBush(ModBlockClass.RASPBERRY_BUSH.get(), "raspberry_bush", "raspberry_bush");
        makeBush(ModBlockClass.BLUEBERRY_BUSH.get(), "blueberry_bush", "blueberry_bush");
        makeBush(ModBlockClass.BLACKBERRY_BUSH.get(), "blackberry_bush", "blackberry_bush");
    }

    private void makeBush(Block block, String textureName, String modeName) {
        getVariantBuilder(block).forAllStates(state -> {
            int age = state.getValue(SweetBerryBushBlock.AGE);
            ModelFile model = models().cross(modeName + "_stage" + age,
                            ResourceLocation.fromNamespaceAndPath(ArcaneWilds.MOD_ID, "block/" + textureName + "_stage" + age))
                    .renderType("cutout");
            return ConfiguredModel.builder().modelFile(model).build();
        });
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
