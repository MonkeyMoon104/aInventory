package io.github.viimeinen1.ainventory.Plugin;

import io.github.viimeinen1.ainventory.Listeners.InventoryListener;
import org.bukkit.plugin.java.JavaPlugin;

public class aInventory extends JavaPlugin {

    /**
     * On enable
     */
    @Override
    public void onEnable() {
        super.onEnable();
        InventoryListener.registerListener();
    }

    /**
     * On disable
     */
    @Override
    public void onDisable() {
        super.onDisable();
        InventoryListener.unregisterListener();
    }

}
