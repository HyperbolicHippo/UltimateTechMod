package hyperbolichippo.ultimatetech;

import hyperbolichippo.ultimatetech.registry.ModBlocks;
import hyperbolichippo.ultimatetech.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateTechMod implements ModInitializer {
    public static final String MOD_ID = "ultimatetech";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup MOD_ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "mod_item_group"), () -> new ItemStack(ModItems.WIRE_CUTTERS));

    public static final ItemGroup ELEMENT_ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "element_item_group"), () -> new ItemStack(ModBlocks.HYDROGEN_ATOM.asItem()));

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
