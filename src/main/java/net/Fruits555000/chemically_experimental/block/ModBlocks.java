package net.Fruits555000.chemically_experimental.block;

import net.Fruits555000.chemically_experimental.ChemicallyExperimentalMod;
import net.Fruits555000.chemically_experimental.block.custom.CompoundCreatorBlock;
import net.Fruits555000.chemically_experimental.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ChemicallyExperimentalMod.MOD_ID);

    public static final RegistryObject<Block> COMPOUND_CREATOR = registerBlock("compound_creator",
            () -> new CompoundCreatorBlock(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE).noOcclusion()));

    //  Elements  \\

    public static final RegistryObject<Block> HYDROGEN = registerBlock("hydrogen",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> HELIUM = registerBlock("helium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LITHIUM = registerBlock("lithium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BERYLLIUM = registerBlock("beryllium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BORON = registerBlock("boron",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CARBON = registerBlock("carbon",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> NITROGEN = registerBlock("nitrogen",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> OXYGEN = registerBlock("oxygen",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FLUORINE = registerBlock("fluorine",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> NEON = registerBlock("neon",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SODIUM = registerBlock("sodium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MAGNESIUM = registerBlock("magnesium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ALUMINUM = registerBlock("aluminum",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SILICON = registerBlock("silicon",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PHOSPHORUS = registerBlock("phosphorus",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SULFUR = registerBlock("sulfur",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CHLORINE = registerBlock("chlorine",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ARGON = registerBlock("argon",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> POTASSIUM = registerBlock("potassium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CALCIUM = registerBlock("calcium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SCANDIUM = registerBlock("scandium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TITANIUM = registerBlock("titanium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> VANADIUM = registerBlock("vanadium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CHROMIUM = registerBlock("chromium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MANGANESE = registerBlock("manganese",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> IRON = registerBlock("iron",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> COBALT = registerBlock("cobalt",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> NICKEL = registerBlock("nickel",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> COPPER = registerBlock("copper",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ZINC = registerBlock("zinc",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GALLIUM = registerBlock("gallium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GERMANIUM = registerBlock("germanium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ARSENIC = registerBlock("arsenic",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SELENIUM = registerBlock("selenium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BROMINE = registerBlock("bromine",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> KRYPTON = registerBlock("krypton",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBIDIUM = registerBlock("rubidium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> STRONTIUM = registerBlock("strontium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> YTTRIUM = registerBlock("yttrium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ZIRCONIUM = registerBlock("zirconium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> NIOBIUM = registerBlock("niobium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MOLYBDENUM = registerBlock("molybdenum",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TECHNETIUM = registerBlock("technetium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUTHENIUM = registerBlock("ruthenium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RHODIUM = registerBlock("rhodium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PALLADIUM = registerBlock("palladium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SILVER = registerBlock("silver",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CADMIUM = registerBlock("cadmium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> INDIUM = registerBlock("indium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TIN = registerBlock("tin",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ANTIMONY = registerBlock("antimony",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TELLURIUM = registerBlock("tellurium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> IODINE = registerBlock("iodine",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> XENON = registerBlock("xenon",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CESIUM = registerBlock("cesium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BARIUM = registerBlock("barium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LANTHANUM = registerBlock("lanthanum",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CERIUM = registerBlock("cerium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PRASEODYMIUM = registerBlock("praseodymium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> NEODYMIUM = registerBlock("neodymium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PROMETHIUM = registerBlock("promethium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SAMARIUM = registerBlock("samarium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> EUROPIUM = registerBlock("europium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GADOLINIUM = registerBlock("gadolinium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TERBIUM = registerBlock("terbium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> DYSPROSIUM = registerBlock("dysprosium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> HOLMIUM = registerBlock("holmium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ERBIUM = registerBlock("erbium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> THULIUM = registerBlock("thulium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> YTTERBIUM = registerBlock("ytterbium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LUTETIUM = registerBlock("lutetium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> HAFNIUM = registerBlock("hafnium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TANTALUM = registerBlock("tantalum",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TUNGSTEN = registerBlock("tungsten",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RHENIUM = registerBlock("rhenium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> OSMIUM = registerBlock("osmium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> IRIDIUM = registerBlock("iridium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PLATINUM = registerBlock("platinum",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GOLD = registerBlock("gold",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MERCURY = registerBlock("mercury",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> THALLIUM = registerBlock("thallium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LEAD = registerBlock("lead",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BISMUTH = registerBlock("bismuth",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> POLONIUM = registerBlock("polonium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ASTATINE = registerBlock("astatine",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RADON = registerBlock("radon",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FRANCIUM = registerBlock("francium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RADIUM = registerBlock("radium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ACTINIUM = registerBlock("actinium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> THORIUM = registerBlock("thorium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PROTACTINIUM = registerBlock("protactinium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> URANIUM = registerBlock("uranium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> NEPTUNIUM = registerBlock("neptunium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PLUTONIUM = registerBlock("plutonium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> AMERICIUM = registerBlock("americium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CURIUM = registerBlock("curium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BERKELIUM = registerBlock("berkelium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CALIFORNIUM = registerBlock("californium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> EINSTEINIUM = registerBlock("einsteinium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FERMIUM = registerBlock("fermium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MENDELEVIUM = registerBlock("mendelevium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> NOBELIUM = registerBlock("nobelium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LAWRENCIUM = registerBlock("lawrencium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUTHERFORDIUM = registerBlock("rutherfordium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> DUBNIUM = registerBlock("dubnium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SEABORGIUM = registerBlock("seaborgium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BOHRIUM = registerBlock("bohrium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> HASSIUM = registerBlock("hassium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MEITNERIUM = registerBlock("meitnerium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> DARMSTADTIUM = registerBlock("darmstadtium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ROENTGENIUM = registerBlock("roentgenium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> COPERNICIUM = registerBlock("copernicium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> NIHONIUM = registerBlock("nihonium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FLEROVIUM = registerBlock("flerovium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MOSCOVIUM = registerBlock("moscovium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LIVERMORIUM = registerBlock("livermorium",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TENNESSINE = registerBlock("tennessine",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> OGANESSON = registerBlock("oganesson",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> UNKNOWN_ELEMENT = registerBlock("unknown_element",
            () -> new Block(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.STONE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);

        return  toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
