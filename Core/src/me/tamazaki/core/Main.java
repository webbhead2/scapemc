package me.tamazaki.core;

import org.bukkit.plugin.java.JavaPlugin;

import me.tamazaki.core.cmds.ListCMD;
import me.tamazaki.core.cmds.PingPlayerCMD;
import me.tamazaki.core.listeners.LoginListener;
import me.tamazaki.core.listeners.PlayerChat;
import me.tamazaki.core.listeners.PlayerListener;

public class Main extends JavaPlugin {
	public static Main plugin;
	
	@Override
	public void onEnable() {
		
		plugin = this;
		
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		getServer().getPluginManager().registerEvents(new LoginListener(), this);
		getServer().getPluginManager().registerEvents(new PlayerChat(), this);
		
		getCommand("ping").setExecutor(new PingPlayerCMD());
		getCommand("list").setExecutor(new ListCMD());
		
	}
	
	@Override
	public void onDisable() {
		
		plugin = null;
		
	}

}
