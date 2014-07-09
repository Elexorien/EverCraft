package com.elexorien.evercraft;

import com.elexorien.evercraft.handler.ConfigurationHandler;
import com.elexorien.evercraft.init.ModBlocks;
import com.elexorien.evercraft.init.ModItems;
import com.elexorien.evercraft.proxy.IProxy;
import com.elexorien.evercraft.reference.Reference;
import com.elexorien.evercraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class EverCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static EverCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Network Handling
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        // Initialize items
        ModItems.init();
        // Initialize blocks
        ModBlocks.init();

        LogHelper.info("Pre Initialization complete!");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Register GUIs
        // Register tile entities
        // Register crafting recipes
        // General event handling

        LogHelper.info("Initialization complete!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Wrap things up
        LogHelper.info("Post Initialization complete!");
    }
}
