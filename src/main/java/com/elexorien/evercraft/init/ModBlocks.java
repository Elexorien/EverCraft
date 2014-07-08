package com.elexorien.evercraft.init;

import com.elexorien.evercraft.block.BlockEC;
import com.elexorien.evercraft.block.BlockTest;
import com.elexorien.evercraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockEC blockTest = new BlockTest();

    public static void init()
    {
        GameRegistry.registerBlock(blockTest, "blockTest");
    }
}
