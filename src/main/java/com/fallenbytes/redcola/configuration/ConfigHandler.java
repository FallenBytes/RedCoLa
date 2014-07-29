package com.fallenbytes.redcola.configuration;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import org.omg.PortableInterceptor.ObjectReferenceFactory;
import sun.org.mozilla.javascript.internal.ast.ObjectProperty;

import java.io.File;
import java.util.*;

/**
 * Created by FallenBytes on 7/12/2014.
 */



public class ConfigHandler
{
    public static void init(File configFile)
    {
        //create config object
        Configuration config = new Configuration(configFile);

        //crate config list
        List<Property> props = new ArrayList<Property>();


        /*=========================================*/
        /*Declare Config options and default values*/
        /*=========================================*/
        boolean bTest = false;
        int iTest = 8;
        double dTest = 12.6;
        String sTest = "things and stuff";




        try
        {
            // try loading config file
            config.load();

            /*=========================================*/
            /*Declare Config options and default values*/
            /*=========================================*/

            bTest = config.get(Configuration.CATEGORY_GENERAL, "bTest", bTest).getBoolean();
            iTest = config.get(Configuration.CATEGORY_GENERAL, "iTest", iTest).getInt();
            dTest = config.get(Configuration.CATEGORY_GENERAL, "dTest", dTest).getDouble();
            sTest = config.get(Configuration.CATEGORY_GENERAL, "sTest", sTest).getString();

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

        System.out.println(sTest);
    }
}
