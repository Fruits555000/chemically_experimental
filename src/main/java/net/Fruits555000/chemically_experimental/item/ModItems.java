package net.Fruits555000.chemically_experimental.item;

import net.Fruits555000.chemically_experimental.ChemicallyExperimentalMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChemicallyExperimentalMod.MOD_ID);

    public static final RegistryObject<Item> AMMONIA = ITEMS.register("ammonia",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BARIUM_SULFATE = ITEMS.register("barium_sulfate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BENZENE = ITEMS.register("benzene",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BORON_TRIOXIDE = ITEMS.register("boron_trioxide",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CALCIUM_BROMIDE = ITEMS.register("calcium_bromide",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CALCIUM_CHLORIDE = ITEMS.register("calcium_chloride",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUPRIC_CHLORIDE = ITEMS.register("cupric_chloride",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIPHENYL_OXALATE = ITEMS.register("diphenyl_oxalate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HYDROGEN_PEROXIDE = ITEMS.register("hydrogen_peroxide",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INDIUM_CHLORIDE = ITEMS.register("indium_chloride",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_SULFIDE = ITEMS.register("iron_sulfide",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LITHIUM_HYDRIDE = ITEMS.register("lithium_hydride",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LUMINOL = ITEMS.register("luminol",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LYE = ITEMS.register("lye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAGNESIUM_NITRATE = ITEMS.register("magnesium_nitrate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAGNESIUM_OXIDE = ITEMS.register("magnesium_oxide",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MERCURIC_CHLORIDE = ITEMS.register("mercuric_chloride",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POLYETHYLENE = ITEMS.register("polyethylene",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POTASSIUM_CHLORIDE = ITEMS.register("potassium_chloride",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POTASSIUM_IODIDE = ITEMS.register("potassium_iodide",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SOAP = ITEMS.register("soap",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SODIUM_ACETATE = ITEMS.register("sodium_acetate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SODIUM_OXIDE = ITEMS.register("sodium_oxide",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SULFATE = ITEMS.register("sulfate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TUNGSTEN_CHLORIDE = ITEMS.register("tungsten_chloride",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WATER = ITEMS.register("water",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
