package com.lothrazar.unbreakables;

import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(UnbreakableMod.MODID)
public class UnbreakableMod {

  public static final String MODID = "unbreakables";

  public UnbreakableMod(IEventBus modEventBus) {
    // Register the setup method for modloading
    modEventBus.addListener(this::setup);
  }

  private void setup(final FMLCommonSetupEvent event) {
    // accesstransformer makes this public -> destroySpeed
    Blocks.SPAWNER.defaultBlockState().destroySpeed = -1;
  }
}
