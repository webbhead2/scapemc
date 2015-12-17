package me.tamazaki.core.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import me.tamazaki.core.Prefixes;

public class PlayerListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		event.setJoinMessage(null);
		
		if(!player.hasPlayedBefore()) {
			Bukkit.broadcastMessage(Prefixes.PREFIX + "Welcome §6" + player.getName() + " §7to ScapeMC §c" + Bukkit.getServerName().toString());
		}
		
		player.sendMessage(" ");
		player.sendMessage(" ");
		player.sendMessage(" ");
		player.sendMessage("      §c§l§nWelcome to ScapeMC");
		player.sendMessage(" ");
		player.sendMessage("  §7Owned by §6Tamazaki §7and §6kmohawesome");
		player.sendMessage("  §7Managed by §6DDrules");
		player.sendMessage("  §7Network developed by §6Tamazaki");
		player.sendMessage(" ");
		player.sendMessage("  §3§lFORUMS §bscapemcn.enjin.com/forums");
		player.sendMessage("  §2§lSHOP §ascapemcn.enjin.com/store");
		player.sendMessage(" ");
		player.sendMessage("  §7Connected to §c§nLobby #1");
		player.sendMessage(" ");
		player.sendMessage(player.getUniqueId().toString().trim());
	}
	
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent event) {
		Player player = event.getPlayer();
		
		if(event.getMessage().startsWith("/icanhasbukkit") || event.getMessage().startsWith("/pl") || event.getMessage().startsWith("/plugins") || event.getMessage().startsWith("/minecraft:") || event.getMessage().startsWith("/say") || event.getMessage().startsWith("?")) {
			event.setCancelled(true);
			player.sendMessage(Prefixes.PREFIX + "§6§oScapeSuits v0.1 §7developed by §c§lTamazaki");
		}
	}
}
