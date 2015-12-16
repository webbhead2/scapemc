package me.tamazaki.core.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class PlayerChat implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		
		if(PermissionsEx.getUser(player).inGroup("Owner")) {
			event.setFormat("§4Owner §8┃ §7" + player.getName() + " §8> §f" + event.getMessage());
		} else if(PermissionsEx.getUser(player).inGroup("Admin")) {
			event.setFormat("§cAdmin §8┃ §7" + player.getName() + " §8> §f" + event.getMessage());
		} else if(PermissionsEx.getUser(player).inGroup("Developer")) {
			event.setFormat("§aDeveloper §8┃ §7" + player.getName() + " §8> §f" + event.getMessage());
		} else if(PermissionsEx.getUser(player).inGroup("Moderator")) {
			event.setFormat("§6Moderator §8┃ §7" + player.getName() + " §8> §f" + event.getMessage());
		} else if(PermissionsEx.getUser(player).inGroup("Helper")) {
			event.setFormat("§eHelper §8┃ §7" + player.getName() + " §8> §f" + event.getMessage());
		} else {
			event.setFormat("§7" + player.getName() + " §8> §7" + event.getMessage());
		}
	}
}
