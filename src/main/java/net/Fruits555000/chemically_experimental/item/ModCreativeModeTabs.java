package net.Fruits555000.chemically_experimental.item;

import net.Fruits555000.chemically_experimental.ChemicallyExperimentalMod;
import net.Fruits555000.chemically_experimental.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChemicallyExperimentalMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COMPOUNDS_TAB = CREATIVE_MODE_TABS.register("compounds_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TUNGSTEN_CHLORIDE.get()))
                    .title(Component.translatable("creativetab.chemically_experimental.compounds"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AMMONIA.get());
                        output.accept(ModItems.BARIUM_SULFATE.get());
                        output.accept(ModItems.BENZENE.get());
                        output.accept(ModItems.BORON_TRIOXIDE.get());
                        output.accept(ModItems.CALCIUM_BROMIDE.get());
                        output.accept(ModItems.CALCIUM_CHLORIDE.get());
                        output.accept(ModItems.CUPRIC_CHLORIDE.get());
                        output.accept(ModItems.DIPHENYL_OXALATE.get());
                        output.accept(ModItems.HYDROGEN_PEROXIDE.get());
                        output.accept(ModItems.INDIUM_CHLORIDE.get());
                        output.accept(ModItems.IRON_SULFIDE.get());
                        output.accept(ModItems.LITHIUM_HYDRIDE.get());
                        output.accept(ModItems.LUMINOL.get());
                        output.accept(ModItems.LYE.get());
                        output.accept(ModItems.MAGNESIUM_NITRATE.get());
                        output.accept(ModItems.MAGNESIUM_OXIDE.get());
                        output.accept(ModItems.MERCURIC_CHLORIDE.get());
                        output.accept(ModItems.POLYETHYLENE.get());
                        output.accept(ModItems.POTASSIUM_CHLORIDE.get());
                        output.accept(ModItems.POTASSIUM_IODIDE.get());
                        output.accept(ModItems.SOAP.get());
                        output.accept(ModItems.SODIUM_ACETATE.get());
                        output.accept(ModItems.SODIUM_OXIDE.get());
                        output.accept(ModItems.SULFATE.get());
                        output.accept(ModItems.TUNGSTEN_CHLORIDE.get());
                        output.accept(ModItems.WATER.get());
                        output.accept(ModBlocks.COMPOUND_CREATOR.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> ELEMENTS_TAB = CREATIVE_MODE_TABS.register("elements_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HYDROGEN.get()))
                    .title(Component.translatable("creativetab.chemically_experimental.elements"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HYDROGEN.get());
                        output.accept(ModBlocks.HELIUM.get());
                        output.accept(ModBlocks.LITHIUM.get());
                        output.accept(ModBlocks.BERYLLIUM.get());
                        output.accept(ModBlocks.BORON.get());
                        output.accept(ModBlocks.CARBON.get());
                        output.accept(ModBlocks.NITROGEN.get());
                        output.accept(ModBlocks.OXYGEN.get());
                        output.accept(ModBlocks.FLUORINE.get());
                        output.accept(ModBlocks.NEON.get());
                        output.accept(ModBlocks.SODIUM.get());
                        output.accept(ModBlocks.MAGNESIUM.get());
                        output.accept(ModBlocks.ALUMINUM.get());
                        output.accept(ModBlocks.SILICON.get());
                        output.accept(ModBlocks.PHOSPHORUS.get());
                        output.accept(ModBlocks.SULFUR.get());
                        output.accept(ModBlocks.CHLORINE.get());
                        output.accept(ModBlocks.ARGON.get());
                        output.accept(ModBlocks.POTASSIUM.get());
                        output.accept(ModBlocks.CALCIUM.get());
                        output.accept(ModBlocks.SCANDIUM.get());
                        output.accept(ModBlocks.TITANIUM.get());
                        output.accept(ModBlocks.VANADIUM.get());
                        output.accept(ModBlocks.CHROMIUM.get());
                        output.accept(ModBlocks.MANGANESE.get());
                        output.accept(ModBlocks.IRON.get());
                        output.accept(ModBlocks.COBALT.get());
                        output.accept(ModBlocks.NICKEL.get());
                        output.accept(ModBlocks.COPPER.get());
                        output.accept(ModBlocks.ZINC.get());
                        output.accept(ModBlocks.GALLIUM.get());
                        output.accept(ModBlocks.GERMANIUM.get());
                        output.accept(ModBlocks.ARSENIC.get());
                        output.accept(ModBlocks.SELENIUM.get());
                        output.accept(ModBlocks.BROMINE.get());
                        output.accept(ModBlocks.KRYPTON.get());
                        output.accept(ModBlocks.RUBIDIUM.get());
                        output.accept(ModBlocks.STRONTIUM.get());
                        output.accept(ModBlocks.YTTRIUM.get());
                        output.accept(ModBlocks.ZIRCONIUM.get());
                        output.accept(ModBlocks.NIOBIUM.get());
                        output.accept(ModBlocks.MOLYBDENUM.get());
                        output.accept(ModBlocks.TECHNETIUM.get());
                        output.accept(ModBlocks.RUTHENIUM.get());
                        output.accept(ModBlocks.RHODIUM.get());
                        output.accept(ModBlocks.PALLADIUM.get());
                        output.accept(ModBlocks.SILVER.get());
                        output.accept(ModBlocks.CADMIUM.get());
                        output.accept(ModBlocks.INDIUM.get());
                        output.accept(ModBlocks.TIN.get());
                        output.accept(ModBlocks.ANTIMONY.get());
                        output.accept(ModBlocks.TELLURIUM.get());
                        output.accept(ModBlocks.IODINE.get());
                        output.accept(ModBlocks.XENON.get());
                        output.accept(ModBlocks.CESIUM.get());
                        output.accept(ModBlocks.BARIUM.get());
                        output.accept(ModBlocks.LANTHANUM.get());
                        output.accept(ModBlocks.CERIUM.get());
                        output.accept(ModBlocks.PRASEODYMIUM.get());
                        output.accept(ModBlocks.NEODYMIUM.get());
                        output.accept(ModBlocks.PROMETHIUM.get());
                        output.accept(ModBlocks.SAMARIUM.get());
                        output.accept(ModBlocks.EUROPIUM.get());
                        output.accept(ModBlocks.GADOLINIUM.get());
                        output.accept(ModBlocks.TERBIUM.get());
                        output.accept(ModBlocks.DYSPROSIUM.get());
                        output.accept(ModBlocks.HOLMIUM.get());
                        output.accept(ModBlocks.ERBIUM.get());
                        output.accept(ModBlocks.THULIUM.get());
                        output.accept(ModBlocks.YTTERBIUM.get());
                        output.accept(ModBlocks.LUTETIUM.get());
                        output.accept(ModBlocks.HAFNIUM.get());
                        output.accept(ModBlocks.TANTALUM.get());
                        output.accept(ModBlocks.TUNGSTEN.get());
                        output.accept(ModBlocks.RHENIUM.get());
                        output.accept(ModBlocks.OSMIUM.get());
                        output.accept(ModBlocks.IRIDIUM.get());
                        output.accept(ModBlocks.PLATINUM.get());
                        output.accept(ModBlocks.GOLD.get());
                        output.accept(ModBlocks.MERCURY.get());
                        output.accept(ModBlocks.THALLIUM.get());
                        output.accept(ModBlocks.LEAD.get());
                        output.accept(ModBlocks.BISMUTH.get());
                        output.accept(ModBlocks.POLONIUM.get());
                        output.accept(ModBlocks.ASTATINE.get());
                        output.accept(ModBlocks.RADON.get());
                        output.accept(ModBlocks.FRANCIUM.get());
                        output.accept(ModBlocks.RADIUM.get());
                        output.accept(ModBlocks.ACTINIUM.get());
                        output.accept(ModBlocks.THORIUM.get());
                        output.accept(ModBlocks.PROTACTINIUM.get());
                        output.accept(ModBlocks.URANIUM.get());
                        output.accept(ModBlocks.NEPTUNIUM.get());
                        output.accept(ModBlocks.PLUTONIUM.get());
                        output.accept(ModBlocks.AMERICIUM.get());
                        output.accept(ModBlocks.CURIUM.get());
                        output.accept(ModBlocks.BERKELIUM.get());
                        output.accept(ModBlocks.CALIFORNIUM.get());
                        output.accept(ModBlocks.EINSTEINIUM.get());
                        output.accept(ModBlocks.FERMIUM.get());
                        output.accept(ModBlocks.MENDELEVIUM.get());
                        output.accept(ModBlocks.NOBELIUM.get());
                        output.accept(ModBlocks.LAWRENCIUM.get());
                        output.accept(ModBlocks.RUTHERFORDIUM.get());
                        output.accept(ModBlocks.DUBNIUM.get());
                        output.accept(ModBlocks.SEABORGIUM.get());
                        output.accept(ModBlocks.BOHRIUM.get());
                        output.accept(ModBlocks.HASSIUM.get());
                        output.accept(ModBlocks.MEITNERIUM.get());
                        output.accept(ModBlocks.DARMSTADTIUM.get());
                        output.accept(ModBlocks.ROENTGENIUM.get());
                        output.accept(ModBlocks.COPERNICIUM.get());
                        output.accept(ModBlocks.NIHONIUM.get());
                        output.accept(ModBlocks.FLEROVIUM.get());
                        output.accept(ModBlocks.MOSCOVIUM.get());
                        output.accept(ModBlocks.LIVERMORIUM.get());
                        output.accept(ModBlocks.TENNESSINE.get());
                        output.accept(ModBlocks.OGANESSON.get());
                        output.accept(ModBlocks.UNKNOWN_ELEMENT.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
