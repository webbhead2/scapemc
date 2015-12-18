package me.tamazaki.core.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import me.tamazaki.core.Prefixes;

public class PlayerListener implements Listener {
	
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent event) {
		Player player = event.getPlayer();
		
		if(event.getMessage().startsWith("/icanhasbukkit") || event.getMessage().startsWith("/pl") || event.getMessage().startsWith("/plugins") || event.getMessage().startsWith("/minecraft:") || event.getMessage().startsWith("/say") || event.getMessage().startsWith("?")) {
			event.setCancelled(true);
			player.sendMessage(Prefixes.PREFIX + "§6§oScapeSuits v0.1 §7developed by §c§lTamazaki");
		}
	}
}
