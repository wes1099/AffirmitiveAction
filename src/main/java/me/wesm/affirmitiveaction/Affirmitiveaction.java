package me.wesm.affirmitiveaction;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;
import static org.bukkit.Bukkit.broadcastMessage;

public final class Affirmitiveaction extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[AffirmitiveAction]: annhiliating discriminatory entities.");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onDiscrimination(AsyncPlayerChatEvent event){
        String msg = event.getMessage();
        Player player = event.getPlayer();
        if (msg.contains("nigger")){
            player.setHealth(0.01);
            player.getWorld().strikeLightning(player.getLocation());
            broadcastMessage(ChatColor.DARK_RED + player.getName() + " was vaporized for discriminatory language.");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
