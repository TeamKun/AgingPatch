package net.kunmc.lab.agingpatch;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AgingPatch extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Listener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
