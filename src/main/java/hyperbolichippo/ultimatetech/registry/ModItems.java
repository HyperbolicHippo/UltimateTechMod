package hyperbolichippo.ultimatetech.registry;

import hyperbolichippo.ultimatetech.UltimateTechMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TIN_INGOT = registerItem("tin_ingot",
            new Item(new FabricItemSettings().group(UltimateTechMod.ITEM_GROUP)));

    public static final Item WIRE_CUTTERS = registerItem("wire_cutters",
            new Item(new FabricItemSettings().group(UltimateTechMod.ITEM_GROUP).maxCount(1)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(UltimateTechMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        UltimateTechMod.LOGGER.info("Registering mod items...");
    }
}
