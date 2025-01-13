package net.aidan.epicgamermod_number_one.item;

import net.aidan.epicgamermod_number_one.EpicGamerMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicGamerMod.MOD_ID);

    public static final RegistryObject<Item> GUN = ITEMS.register("gun",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BULLET = ITEMS.register("bullet",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
