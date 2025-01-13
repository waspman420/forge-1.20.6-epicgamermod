package net.aidan.epicgamermod_number_one.item;

import net.aidan.epicgamermod_number_one.EpicGamerMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EpicGamerMod.MOD_ID);
//custom mod tab
    public static final RegistryObject<CreativeModeTab> GUNS = CREATIVE_MODE_TABS.register("guns",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GUN.get()))
                    .title(Component.translatable("creativetab.guns"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GUN.get());
                        output.accept(ModItems.BULLET.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);

    }
}
