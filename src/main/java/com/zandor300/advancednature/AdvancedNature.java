package com.zandor300.advancednature;

import com.zandor300.advancednature.proxy.ServerProxy;
import com.zandor300.advancednature.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

/**
 * Created by Zandor300 on 5-12-2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class AdvancedNature {

	@SidedProxy(clientSide = Reference.CLIENTSIDE, serverSide = Reference.SERVERSIDE)
	public static ServerProxy Proxy;

	@Mod.EventHandler
	public static void PreInit(FMLPostInitializationEvent event) {
		//ModItems.init();
		//ModBlocks.init();

		//LogHelper.info("Pre Initialization Complete!");
	}

	@Mod.EventHandler
	public static void Init(FMLInitializationEvent event) {
		//Recipes.init();
		//LogHelper.info("Initialization Complete!");
	}

	@Mod.EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		//LogHelper.info("Post Initialization Complete!");
	}
}