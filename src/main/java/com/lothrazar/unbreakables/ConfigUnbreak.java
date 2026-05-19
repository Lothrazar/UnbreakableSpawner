package com.lothrazar.unbreakables;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ConfigUnbreak {

  public static ModConfigSpec CONFIG;
  public static ModConfigSpec.BooleanValue TRIAL_SPAWNER_UNBREAKABLE;
  static {
    final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    BUILDER.comment("This mod always makes basic spawners unbreakable.  Set this config to false if you want to change that setting for trial spawners")
        .push(UnbreakableMod.MODID);
    TRIAL_SPAWNER_UNBREAKABLE = BUILDER.comment("Are trial spawners also unbreakable").define("trial_spawner", true);
    BUILDER.pop();
    CONFIG = BUILDER.build();
  }


}
