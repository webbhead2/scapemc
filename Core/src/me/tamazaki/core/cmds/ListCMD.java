package me.tamazaki.core.cmds;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.tamazaki.core.Prefixes;

public class ListCMD implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		int players = Bukkit.getServer().getOnlinePlayers().size();
		int max = Bukkit.getServer().getMaxPlayers();
		
		sender.sendMessage(Prefixes.PREFIX + "§6There are §a" + players + "§8/§a" + max + " §6players online.");
		return true;
	}

}
