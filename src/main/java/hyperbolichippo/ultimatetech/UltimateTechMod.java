package hyperbolichippo.ultimatetech;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateTechMod implements ModInitializer {
    public static final String MOD_ID = "ultimate_tech";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "item_group"), () -> new ItemStack(Items.COD_SPAWN_EGG));

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
}