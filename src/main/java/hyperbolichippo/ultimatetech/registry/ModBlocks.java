package hyperbolichippo.ultimatetech.registry;

import hyperbolichippo.ultimatetech.UltimateTechMod;
import hyperbolichippo.ultimatetech.block.AtomBlock;
import hyperbolichippo.ultimatetech.block.PulveriserBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).sounds(BlockSoundGroup.COPPER).requiresTool()), UltimateTechMod.MOD_ITEM_GROUP);

    public static final Block PULVERIZER = registerBlock("pulverizer",
            new PulveriserBlock(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()), UltimateTechMod.MOD_ITEM_GROUP);

    /* ------ ATOM BLOCKS ------ */
    public static final Block HYDROGEN_ATOM = registerBlock("hydrogen_atom",
            new AtomBlock(1, 1, FabricBlockSettings.of(Material.STONE)), UltimateTechMod.ELEMENT_ITEM_GROUP);
    public static final Block HELIUM_ATOM = registerBlock("helium_atom",
            new AtomBlock(2, 2, FabricBlockSettings.of(Material.STONE)), UltimateTechMod.ELEMENT_ITEM_GROUP);
    public static final Block LITHIUM_ATOM = registerBlock("lithium_atom",
            new AtomBlock(3, 3, FabricBlockSettings.of(Material.STONE)), UltimateTechMod.ELEMENT_ITEM_GROUP);
    public static final Block BERYLLIUM_ATOM = registerBlock("beryllium_atom",
            new AtomBlock(4, 4, FabricBlockSettings.of(Material.STONE)), UltimateTechMod.ELEMENT_ITEM_GROUP);
    public static final Block BORON_ATOM = registerBlock("boron_atom",
            new AtomBlock(5, 5, FabricBlockSettings.of(Material.STONE)), UltimateTechMod.ELEMENT_ITEM_GROUP);
    public static final Block CARBON_ATOM = registerBlock("carbon_atom",
            new AtomBlock(6, 6, FabricBlockSettings.of(Material.STONE)), UltimateTechMod.ELEMENT_ITEM_GROUP);
    /* ---------------------------- */

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(UltimateTechMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(UltimateTechMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        UltimateTechMod.LOGGER.debug("Registering mod blocks...");
    }
}
