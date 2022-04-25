package net.Redd.sandwichablepatch.compats;

import io.github.foundationgames.sandwichable.Sandwichable;
import io.github.foundationgames.sandwichable.blocks.CuttingBoardBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import static io.github.foundationgames.sandwichable.blocks.BlocksRegistry.registerBlock;

public class ArchitectsPalette {
    public static final Block TWISTED_CUTTING_BOARD = new CuttingBoardBlock(FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE));
    public static void init() {
        registerBlock(TWISTED_CUTTING_BOARD, "twisted_cutting_board", Sandwichable.SANDWICHABLE_ITEMS);

    }
}
