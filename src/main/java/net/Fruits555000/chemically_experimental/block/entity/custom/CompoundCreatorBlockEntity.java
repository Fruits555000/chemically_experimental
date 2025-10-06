package net.Fruits555000.chemically_experimental.block.entity.custom;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import net.Fruits555000.chemically_experimental.block.custom.CompoundCreatorBlock;
import net.Fruits555000.chemically_experimental.block.entity.ModBlockEntities;
import net.Fruits555000.chemically_experimental.screen.custom.CompoundCreatorMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.CrafterMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

public class CompoundCreatorBlockEntity extends RandomizableContainerBlockEntity implements MenuProvider {
    public final ItemStackHandler itemHandler = new ItemStackHandler(10) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            if (!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }
    };

    private NonNullList<ItemStack> items = NonNullList.withSize(9, ItemStack.EMPTY);

    public static final int SLOT_DISABLED = 1;
    public static final int SLOT_ENABLED = 0;
    public static final int DATA_TRIGGERED = 9;
    public static final int NUM_DATA = 10;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int craftingTicksRemaining = 0;

    public CompoundCreatorBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.COMPOUND_CREATOR_BE.get(), pPos, pBlockState);
        data = new ContainerData() {
            private final int[] slotStates = new int[9];
            private int triggered = 0;

            @Override
            public int get(int pIndex) {
                return pIndex == 9 ? this.triggered : this.slotStates[pIndex];
            }

            @Override
            public void set(int pIndex, int pValue) {
                if (pIndex == 9) {
                    this.triggered = pValue;
                } else {
                    this.slotStates[pIndex] = pValue;
                }
            }

            @Override
            public int getCount() {
                return 10;
            }
        };
    }

    @Override
    public boolean canPlaceItem(int pSlot, ItemStack pStack) {
        if (this.data.get(pSlot) == 1) {
            return false;
        } else {
            ItemStack itemstack = this.items.get(pSlot);
            int i = itemstack.getCount();
            if (i >= itemstack.getMaxStackSize()) {
                return false;
            } else {
                return itemstack.isEmpty() ? true : !this.smallerStackExist(i, itemstack, pSlot);
            }
        }
    }

    private boolean smallerStackExist(int pCurrentSize, ItemStack pStack, int pSlot) {
        for (int i = pSlot + 1; i < 9; i++) {
            if (!this.isSlotDisabled(i)) {
                ItemStack itemstack = this.getItem(i);
                if (itemstack.isEmpty() || itemstack.getCount() < pCurrentSize && ItemStack.isSameItemSameComponents(itemstack, pStack)) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public int getContainerSize() {
        return 9;
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    private boolean slotCanBeDisabled(int pSlot) {
        return pSlot > -1 && pSlot < 9 && this.items.get(pSlot).isEmpty();
    }

    public boolean isSlotDisabled(int pSlot) {
        return pSlot >= 0 && pSlot < 9 ? this.data.get(pSlot) == 1 : false;
    }

    private void addDisabledSlots(CompoundTag pTag) {
        IntList intlist = new IntArrayList();

        for (int i = 0; i < 9; i++) {
            if (this.isSlotDisabled(i)) {
                intlist.add(i);
            }
        }

        pTag.putIntArray("disabled_slots", intlist);
    }

    private void addTriggered(CompoundTag pTag) {
        pTag.putInt("triggered", this.data.get(9));
    }

    @Override
    protected void loadAdditional(CompoundTag pTag, HolderLookup.Provider pRegistries) {
        super.loadAdditional(pTag, pRegistries);
        this.craftingTicksRemaining = pTag.getInt("crafting_ticks_remaining");
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if (!this.tryLoadLootTable(pTag)) {
            ContainerHelper.loadAllItems(pTag, this.items, pRegistries);
        }

        int[] aint = pTag.getIntArray("disabled_slots");

        for (int i = 0; i < 9; i++) {
            this.data.set(i, 0);
        }

        for (int j : aint) {
            if (this.slotCanBeDisabled(j)) {
                this.data.set(j, 1);
            }
        }

        this.data.set(9, pTag.getInt("triggered"));
    }

    @Override
    protected void saveAdditional(CompoundTag pTag, HolderLookup.Provider pRegistries) {
        super.saveAdditional(pTag, pRegistries);
        pTag.putInt("crafting_ticks_remaining", this.craftingTicksRemaining);
        if (!this.trySaveLootTable(pTag)) {
            ContainerHelper.saveAllItems(pTag, this.items, pRegistries);
        }

        this.addDisabledSlots(pTag);
        this.addTriggered(pTag);
    }

    public void tick(Level level, BlockPos blockPos, BlockState blockState, CompoundCreatorBlockEntity compoundCreator) {
        int i = compoundCreator.craftingTicksRemaining - 1;

        if (i >= 0) {
            compoundCreator.craftingTicksRemaining = i;
            if (i == 0) {
                level.setBlock(blockPos, blockState.setValue(CompoundCreatorBlock.CRAFTING, Boolean.valueOf(false)), 3);
            }
        }
    }

    @Override
    public Component getDisplayName() {
        return null;
    }

    @Override
    protected Component getDefaultName() {
        return null;
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return null;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> pItems) {

    }

    @Override
    protected AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory) {
        return new CompoundCreatorMenu(pContainerId, pPlayerInventory, this, this.data);
    }
}