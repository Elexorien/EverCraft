package com.elexorien.evercraft.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try
        {
            // Load the config file
            configuration.load();

            // Read in properties
            configValue = configuration.get("general", "configValue", true, "Example config value").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log the exception
        }
        finally
        {
            // Save the config file
            configuration.save();
        }

        System.out.println("Configuration Test: " + configValue);
    }
}
