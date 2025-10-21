package dev.itsLarss.arcanewilds.datagen;

import dev.itsLarss.arcanewilds.ArcaneWilds;
import dev.itsLarss.arcanewilds.item.ModItemClass;
import dev.itsLarss.arcanewilds.block.ModBlockClass;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        /*List<ItemLike> ALEXANDRITE_SMELTABLES = List.of(ModItemClass.RAW_ALEXANDRITE.get(),
                ModBlocks.ALEXANDRITE_ORE.get(), ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 9)
                .requires(ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ALEXANDRITE_BLOCK.get()), has(ModBlocks.ALEXANDRITE_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 32)
                .requires(ModBlocks.MAGIC_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ALEXANDRITE_BLOCK.get()), has(ModBlocks.ALEXANDRITE_BLOCK.get()))
                .save(pRecipeOutput, TutorialMod.MOD_ID + ":alexandrite_from_magic_block");

        oreSmelting(pRecipeOutput, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 200, "alexandrite");
        oreBlasting(pRecipeOutput, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 100, "alexandrite");*/

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItemClass.IGNIUM_INGOT.get())
                .pattern(" NN")
                .pattern("NNA")
                .pattern("AAA")
                .define('A', ModItemClass.RAW_IGNIUM.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItemClass.RAW_IGNIUM.get()), has(ModItemClass.IGNIUM_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlockClass.AMETHYST_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItemClass.AMETHYST.get())
                .unlockedBy(getHasName(ModItemClass.AMETHYST.get()), has(ModItemClass.AMETHYST.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlockClass.JADE_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItemClass.JADE.get())
                .unlockedBy(getHasName(ModItemClass.JADE.get()), has(ModItemClass.JADE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlockClass.IGNIUM_BLOCK.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ModItemClass.IGNIUM_INGOT.get())
                .unlockedBy(getHasName(ModItemClass.IGNIUM_INGOT.get()), has(ModItemClass.IGNIUM_INGOT.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItemClass.AMETHYST.get(), 9)
                .requires(ModBlockClass.AMETHYST_BLOCK.get())
                .unlockedBy(getHasName(ModBlockClass.AMETHYST_BLOCK.get()), has(ModBlockClass.AMETHYST_BLOCK.get()))
                .save(pRecipeOutput, ArcaneWilds.MOD_ID + ":amethyst_from_amethyst_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItemClass.JADE.get(), 9)
                .requires(ModBlockClass.JADE_BLOCK.get())
                .unlockedBy(getHasName(ModBlockClass.JADE_BLOCK.get()), has(ModBlockClass.JADE_BLOCK.get()))
                .save(pRecipeOutput, ArcaneWilds.MOD_ID + ":jade_from_jade_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItemClass.IGNIUM_INGOT.get(), 9)
                .requires(ModBlockClass.IGNIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlockClass.IGNIUM_BLOCK.get()), has(ModBlockClass.IGNIUM_BLOCK.get()))
                .save(pRecipeOutput, ArcaneWilds.MOD_ID + ":ignium_ingot_from_ignium_block");

        List<ItemLike> AMETHYST_SMELTABLES = List.of(ModItemClass.AMETHYST.get(),
                ModBlockClass.AMETHYST_ORE.get(), ModBlockClass.AMETHYST_DEEPSLATE_ORE.get());

        List<ItemLike> JADE_SMELTABLES = List.of(ModItemClass.RAW_JADEIT.get(),
                ModBlockClass.JADEIT_ORE.get(), ModBlockClass.JADEIT_DEEPSLATE_ORE.get());

        List<ItemLike> IGNIUM_SMELTABLES = List.of(ModItemClass.RAW_IGNIUM.get(),
                ModBlockClass.IGNIUM_ORE.get());

        oreSmelting(pRecipeOutput, AMETHYST_SMELTABLES, RecipeCategory.MISC, ModItemClass.AMETHYST.get(), 0.25f, 200, "amethyst");
        oreBlasting(pRecipeOutput, AMETHYST_SMELTABLES, RecipeCategory.MISC, ModItemClass.AMETHYST.get(), 0.25f, 100, "amethyst");

        oreSmelting(pRecipeOutput, JADE_SMELTABLES, RecipeCategory.MISC, ModItemClass.JADE.get(), 0.35f, 400, "jade");
        oreBlasting(pRecipeOutput, JADE_SMELTABLES, RecipeCategory.MISC, ModItemClass.JADE.get(), 0.35f, 200, "jade");

        oreSmelting(pRecipeOutput, IGNIUM_SMELTABLES, RecipeCategory.MISC, ModItemClass.RAW_IGNIUM.get(), 0.45f, 600, "ignium");
        oreBlasting(pRecipeOutput, IGNIUM_SMELTABLES, RecipeCategory.MISC, ModItemClass.RAW_IGNIUM.get(), 0.45f, 300, "ignium");

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, ArcaneWilds.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
