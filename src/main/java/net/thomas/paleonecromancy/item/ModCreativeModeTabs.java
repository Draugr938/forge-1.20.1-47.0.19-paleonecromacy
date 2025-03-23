package net.thomas.paleonecromancy.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thomas.paleonecromancy.PaleoNecromancy;
import net.thomas.paleonecromancy.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PaleoNecromancy.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PALEONECROMANCY_TAB = CREATIVE_MODE_TABS.register("paleonecromancy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Necronium.get()))
                    .title(Component.translatable("creativetab.paleonecromancy_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Necronium.get());
                        output.accept(ModItems.Uncut_Ammonite_Fossil.get());
                        output.accept(ModBlocks.NECRONIUM_BLOCK.get());
                        output.accept(ModBlocks.NECRONIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_NECRONIUM_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
