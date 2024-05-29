package net.kaden.demiplane.item;

import net.kaden.demiplane.Demiplane;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Demiplane.MOD_ID);
    //DeferredRegister is a list of items that is registered at a specific time (which is whenever forge calls for them)

    //adds new items
    //Fabric of Reality
    public static final RegistryObject<Item> FABRICOFREALITY = ITEMS.register("fabricofreality",
            () -> new Item(new Item.Properties()));
    //Demiplane Scroll
    public static final RegistryObject<Item> DEMIPLANESCROLL = ITEMS.register("demiplanescroll",
            () -> new Item(new Item.Properties()));



    //have to register the register
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
