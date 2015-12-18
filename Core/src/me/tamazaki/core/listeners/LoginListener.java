package me.tamazaki.core.listeners;

import static me.tamazaki.core.Main.plugin;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LoginListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		String uuid = player.getUniqueId().toString();
		
		if(!new File(plugin.getDataFolder(), "players/" + uuid + ".yml").exists()) {
			File user = new File(plugin.getDataFolder(), "players/" + uuid + ".yml");
			YamlConfiguration config = YamlConfiguration.loadConfiguration(user);
			config.set("name", player.getName());
			config.set("uuid", uuid);
			config.set("punishments", null);
			config.set("punishments.ban", null);
			config.set("punishments.ban.banned", false);
			config.set("punishments.ban.message", "User hasn't been banned.");
			config.set("punishments.warned", 0);
			config.set("punishments.kicked", 0);
			
			try {
				config.save(user);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			Bukkit.broadcastMessage("§6Welcome §7" + player.getName() + " §6to §c§lScapeMC");
			
		}
		
		event.setJoinMessage(null);
		
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
	}

}
