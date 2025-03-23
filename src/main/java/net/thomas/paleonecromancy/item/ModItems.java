package net.thomas.paleonecromancy.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thomas.paleonecromancy.PaleoNecromancy;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PaleoNecromancy.MOD_ID);

    public static final RegistryObject<Item> Necronium = ITEMS.register("necronium",
            () -> new Item((new Item.Properties())));

    public static final RegistryObject<Item> Uncut_Ammonite_Fossil = ITEMS.register("uncut_ammonite_fossil",
            () -> new Item((new Item.Properties())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
