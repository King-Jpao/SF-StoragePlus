package me.kingjpao.sfstorageplus;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class ExampleAddon extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.ym 
        Config cfg = new Config(this);
        
        NamespacedKey categoryId = new NamespacedKey(this, "Storage+");
        CustomItemStack categoryItem = new CustomItemStack(Material.CHEST, "&4OStorage+");

        ItemGroup itemGroup = new ItemGroup(Storage+, CHEST);
        SlimefunItemStack itemStack = new SlimefunItemStack("STORAGE_SHARD", Material.AMETHYST SHARD, "", "", "");
        ItemStack[] recipe = {
    new ItemStack(Material.AMETHYST_SHARD),    new ItemStack(Material.GLASS_PANE), new ItemStack(Material.AMETHYST_SHARD),
    new ItemStack(Material.GLASS_PANE),        new ItemStack(Material.DIAMOND),    new ItemStack(Material.GLASS_PANE),
    new ItemStack(Material.AMETHYST_SHARD),    SlimefunItems.CARBONADO,            new ItemStack(Material.AMETHYST_SHARD)  
};
        SlimefunItem sfItem = new SlimefunItem(STORAGE_SHARD, AMETHYST_SHARD, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        sfItem.register(this);    
        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }

}
