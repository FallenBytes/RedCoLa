package com.fallenbytes.redcola.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

/**
 * Created by FallenBytes on 7/12/2014.
 */

public class ConfigHandler
{
    public static void init(File configFile)
    {
        //create config object
        Configuration config = new Configuration(configFile);

        boolean configValue = false;

        try
        {
            // try loading config file
            config.load();

            //read properties from config
            configValue = config.get(Configuration.CATEGORY_GENERAL, "configValue", true, "example config").getBoolean(true);

        }
        catch (Exception e)
        {
            //log exception
        }
        finally
        {
            //save config file
            config.save();
        }

        System.out.println(configValue);
    }
}
