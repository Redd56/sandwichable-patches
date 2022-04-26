package net.Redd.sandwichablepatch.Usefullpackages;

import net.minecraft.block.Block;

import java.util.HashMap;

public class microregistyr {
    public static HashMap<String, Block> registeredBlocks = new HashMap<>();
    public static Block get(String path) { return registeredBlocks.get(path); }
}
