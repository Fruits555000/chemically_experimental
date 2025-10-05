package net.Fruits555000.chemically_experimental.block.entity;

import net.Fruits555000.chemically_experimental.ChemicallyExperimentalMod;
import net.Fruits555000.chemically_experimental.block.ModBlocks;
import net.Fruits555000.chemically_experimental.block.entity.custom.CompoundCreatorBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ChemicallyExperimentalMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<CompoundCreatorBlockEntity>> COMPOUND_CREATOR_BE =
            BLOCK_ENTITIES.register("compound_creator_be", () -> BlockEntityType.Builder.of(
                    CompoundCreatorBlockEntity::new, ModBlocks.COMPOUND_CREATOR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
