package com.elexorien.evercraft.init;

import com.elexorien.evercraft.item.ItemEC;
import com.elexorien.evercraft.item.ItemTest;
import com.elexorien.evercraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEC itemTest = new ItemTest();

    public static void init()
    {
        GameRegistry.registerItem(itemTest, "itemTest");
    }
}
