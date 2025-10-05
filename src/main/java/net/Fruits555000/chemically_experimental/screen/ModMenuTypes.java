package net.Fruits555000.chemically_experimental.screen;

import net.Fruits555000.chemically_experimental.ChemicallyExperimentalMod;
import net.Fruits555000.chemically_experimental.screen.custom.CompoundCreatorMenu;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, ChemicallyExperimentalMod.MOD_ID);

    public static final RegistryObject<MenuType<CompoundCreatorMenu>> COMPOUND_CREATOR_MENU =
            MENUS.register("compound_creator_menu", () -> IForgeMenuType.create(CompoundCreatorMenu::new));

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
