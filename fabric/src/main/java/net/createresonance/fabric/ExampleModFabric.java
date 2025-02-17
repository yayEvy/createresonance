package net.createresonance.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.createresonance.ModBlocks;
import net.createresonance.CreateResonance;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateResonance.init();
        CreateResonance.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), CreateResonance.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        ModBlocks.REGISTRATE.register();
    }
}
