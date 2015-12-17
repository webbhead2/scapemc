package me.tamazaki.core.cmds;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PingPlayerCMD implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Only players can use this command.");
			return true;
		}
		Player player = (Player) sender;
		
		if(args.length == 0) {
			player.sendMessage("§cInvalid Arguments! /ping <player>");
			return true;
		}
		
		Player target = Bukkit.getServer().getPlayer(args[0]);
		
		player.sendMessage("§6You have just pinged §7" + target.getName());
		target.sendMessage("§6You have just been pinged by §7" + player.getName());
		target.playSound(target.getLocation(), Sound.NOTE_PLING, 1, 1);
		
		return true;
	}

}
