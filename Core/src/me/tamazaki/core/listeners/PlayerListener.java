package me.tamazaki.core.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.tamazaki.core.Prefixes;

public class PlayerListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		if(player.hasPermission("essentials.join.silent")) {
			event.setJoinMessage(null);
			for(Player online : Bukkit.getServer().getOnlinePlayers()) {
				if(online.hasPermission("essentials.staff")) {
					online.sendMessage(Prefixes.STAFF + player.getName() + " has joined silently.");
				}
			}
		}
	}
}
