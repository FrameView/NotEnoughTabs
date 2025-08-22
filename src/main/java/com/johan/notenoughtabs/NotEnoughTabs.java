package com.johan.notenoughtabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.johan.notenoughtabs.Groups.populateTabs;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NotEnoughTabs.MOD_ID)
public class NotEnoughTabs {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "fpsdisplay";

    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);



    public static final RegistryObject<CreativeModeTab> BLACK_TAB = CREATIVE_MODE_TABS.register("black_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(Items.BLACK_WOOL::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for(Item i : Groups.BLACK_ITEMS){ output.accept(i); }
            }).build());

    public static final RegistryObject<CreativeModeTab> BLUE_TAB = CREATIVE_MODE_TABS.register("blue_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(BLACK_TAB.getKey())
            .icon(Items.BLUE_WOOL::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for(Item i : Groups.BLUE_ITEMS){ output.accept(i); }
            }).build());

    public static final RegistryObject<CreativeModeTab> BROWN_TAB = CREATIVE_MODE_TABS.register("brown_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(BLUE_TAB.getKey())
            .icon(Items.BROWN_WOOL::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for(Item i : Groups.BROWN_ITEMS){ output.accept(i); }
            }).build());

    public static final RegistryObject<CreativeModeTab> GRAY_TAB = CREATIVE_MODE_TABS.register("gray_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(BROWN_TAB.getKey())
            .icon(Items.GRAY_WOOL::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for(Item i : Groups.GRAY_ITEMS){ output.accept(i); }
            }).build());

    public static final RegistryObject<CreativeModeTab> GREEN_TAB = CREATIVE_MODE_TABS.register("green_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(GRAY_TAB.getKey())
            .icon(Items.GREEN_WOOL::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for(Item i : Groups.GREEN_ITEMS){ output.accept(i); }
            }).build());

    public static final RegistryObject<CreativeModeTab> ORANGE_TAB = CREATIVE_MODE_TABS.register("orange_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(GREEN_TAB.getKey())
            .icon(Items.ORANGE_WOOL::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for(Item i : Groups.ORANGE_ITEMS){ output.accept(i); }
            }).build());

    public static final RegistryObject<CreativeModeTab> PINK_TAB = CREATIVE_MODE_TABS.register("pink_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(ORANGE_TAB.getKey())
            .icon(Items.PINK_WOOL::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for(Item i : Groups.PINK_ITEMS){ output.accept(i); }
            }).build());

    public static final RegistryObject<CreativeModeTab> RED_TAB = CREATIVE_MODE_TABS.register("red_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(PINK_TAB.getKey())
            .icon(Items.RED_WOOL::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for(Item i : Groups.RED_ITEMS){ output.accept(i); }
            }).build());

    public static final RegistryObject<CreativeModeTab> WHITE_TAB = CREATIVE_MODE_TABS.register("white_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(RED_TAB.getKey())
            .icon(Items.WHITE_WOOL::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for(Item i : Groups.WHITE_ITEMS){ output.accept(i); }
            }).build());

    public static final RegistryObject<CreativeModeTab> YELLOW_TAB = CREATIVE_MODE_TABS.register("yellow_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(WHITE_TAB.getKey())
            .icon(Items.YELLOW_WOOL::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for(Item i : Groups.YELLOW_ITEMS){ output.accept(i); }
            }).build());


    public NotEnoughTabs(FMLJavaModLoadingContext context) {
        populateTabs();
        IEventBus bus = context.getModEventBus();
        CREATIVE_MODE_TABS.register(bus);
    }

}
