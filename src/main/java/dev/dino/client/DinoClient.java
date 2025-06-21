package dev.dino.client;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = DinoClient.MODID, name = DinoClient.NAME, version = DinoClient.VERSION)
public class DinoClient {
    public static final String MODID = "dino";
    public static final String NAME = "Dino";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(NAME + " client loaded.");
    }
}
