package net.kunmc.lab.agingpatch;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler(ignoreCancelled = true)
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (player.getWalkSpeed() != 0.2f) {
            player.setWalkSpeed(0.2f);
        }

        if (player.getMaxHealth() != 20) {
            player.setMaxHealth(20);
        }

        Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"effect clear " + player.getName());
    }
}
