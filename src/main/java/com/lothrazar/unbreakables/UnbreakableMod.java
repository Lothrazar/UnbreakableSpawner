package com.lothrazar.unbreakables;

import java.lang.reflect.Field;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
 
@Mod(UnbreakableMod.MODID)
public class UnbreakableMod {

  public static final String MODID = "unbreakables";

  public UnbreakableMod() {
    // Register the setup method for modloading
    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
  }

  private void setup(final FMLCommonSetupEvent event) {
    //reflection
    Field f = ObfuscationReflectionHelper.findField(Block.class, "field_149782_v");//blockHardness
    f.setAccessible(true);
    try {
      f.set(Blocks.SPAWNER, -1);
    }
    catch (IllegalArgumentException e) {
      e.printStackTrace();
    }
    catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
