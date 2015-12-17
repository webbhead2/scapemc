package me.tamazaki.core;

import org.bukkit.plugin.java.JavaPlugin;

import me.tamazaki.core.cmds.PingPlayerCMD;
import me.tamazaki.core.listeners.PlayerChat;
import me.tamazaki.core.listeners.PlayerListener;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		getServer().getPluginManager().registerEvents(new PlayerChat(), this);
		
		getCommand("ping").setExecutor(new PingPlayerCMD());
		
	}
	
	@Override
	public void onDisable() {
		
	}

}
