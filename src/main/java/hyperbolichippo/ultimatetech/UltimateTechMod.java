package hyperbolichippo.ultimatetech;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateTechMod implements ModInitializer {
    public static final String MOD_ID = "ultimate_tech";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
}
