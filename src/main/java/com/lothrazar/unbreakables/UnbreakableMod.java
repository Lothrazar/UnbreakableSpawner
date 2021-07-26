package com.lothrazar.unbreakables;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
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
    // accesstransformer makes this public -> destroySpeed
    Blocks.SPAWNER.defaultBlockState().destroySpeed = -1;
  }
}
