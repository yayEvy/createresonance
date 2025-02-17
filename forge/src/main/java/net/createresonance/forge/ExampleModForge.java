package net.createresonance.forge;

import net.createresonance.CreateResonance;
import net.createresonance.ModBlocks;
import net.createresonance.CreateResonance;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateResonance.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.REGISTRATE.registerEventListeners(eventBus);
        CreateResonance.init();
    }
}
