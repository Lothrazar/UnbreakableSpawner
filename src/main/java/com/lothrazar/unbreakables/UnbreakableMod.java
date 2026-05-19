package com.lothrazar.unbreakables;

import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(UnbreakableMod.MODID)
public class UnbreakableMod {

  public static final String MODID = "unbreakables";

  public UnbreakableMod(IEventBus modEventBus, ModContainer modContainer) {
    modEventBus.addListener(this::setup);
    modContainer.registerConfig(ModConfig.Type.COMMON, ConfigUnbreak.CONFIG);
  }

  private void setup(final FMLCommonSetupEvent event) {
    // accesstransformer makes this public
    Blocks.SPAWNER.defaultBlockState().destroySpeed = -1;
    if (ConfigUnbreak.TRIAL_SPAWNER_UNBREAKABLE.get()) {
      Blocks.TRIAL_SPAWNER.defaultBlockState().destroySpeed = -1;
    }
  }
}
