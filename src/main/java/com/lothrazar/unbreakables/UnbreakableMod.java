package com.lothrazar.unbreakables;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = UnbreakableMod.MODID, certificateFingerprint = "@FINGERPRINT@", updateJSON = "https://raw.githubusercontent.com/Lothrazar/UnbreakableSpawner/trunk/1.12/update.json")
public class UnbreakableMod {

  public static final String MODID = "unbreakables";

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    MinecraftForge.EVENT_BUS.register(this);
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    Blocks.MOB_SPAWNER.setHardness(-1);
    //reflection
    //    Field f = ObfuscationReflectionHelper.findField(Block.class, "field_149782_v");//blockHardness
    //    f.setAccessible(true);
    //    try {
    //      f.set(Blocks.MOB_SPAWNER, -1);
    //    }
    //    catch (IllegalArgumentException e) {
    //      e.printStackTrace();
    //    }
    //    catch (IllegalAccessException e) {
    //      e.printStackTrace();
    //    }
  }
}
