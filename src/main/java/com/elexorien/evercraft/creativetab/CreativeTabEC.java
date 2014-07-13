package com.elexorien.evercraft.creativetab;

import com.elexorien.evercraft.init.ModItems;
import com.elexorien.evercraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEC
{
    public static final CreativeTabs EC_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.itemTest;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "EverCraft";
        }
    };
}
