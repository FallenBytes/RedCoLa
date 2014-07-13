package com.fallenbytes.redcola;

import com.fallenbytes.redcola.configuration.ConfigHandler;
import com.fallenbytes.redcola.proxy.IProxy;
import com.fallenbytes.redcola.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class RedCoLa
{
    @Mod.Instance(Reference.MOD_ID)
    public static RedCoLa instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void preInit(FMLPostInitializationEvent event)
    {

    }
}
