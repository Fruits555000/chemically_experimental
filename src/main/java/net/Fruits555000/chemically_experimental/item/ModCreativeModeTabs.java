package net.Fruits555000.chemically_experimental.item;

import net.Fruits555000.chemically_experimental.ChemicallyExperimentalMod;
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
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
