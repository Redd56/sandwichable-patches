package net.Redd.sandwichablepatch.compats;

import io.github.foundationgames.sandwichable.Sandwichable;
import io.github.foundationgames.sandwichable.blocks.CuttingBoardBlock;
import net.Redd.sandwichablepatch.Main;
import net.devtech.arrp.json.recipe.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import static io.github.foundationgames.sandwichable.blocks.BlocksRegistry.registerBlock;

public class ArchitectsPalette {
    public static final Block TWISTED_CUTTING_BOARD = new CuttingBoardBlock(FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE));
    public static void init() {
        registerBlock(TWISTED_CUTTING_BOARD, "twisted_cutting_board", Sandwichable.SANDWICHABLE_ITEMS);



        Main.SANDWICHABLE_RESOURCES.addRecipe(new Identifier("arrp", "twisted1"), JRecipe.shaped(
                JPattern.pattern(
                        "AA ",
                        "   ",
                        "   "
                ),
                JKeys.keys()
                        .key("A",
                                JIngredient.ingredient()
                                        .item("architects_palette:stripped_twisted_log")
                        ),
                JResult.itemStack(TWISTED_CUTTING_BOARD.asItem(),2)
        ));

    }
}
