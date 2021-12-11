package com.trailsKR.trailsKR;

import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class oncmd implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("chat")) {
			if(args[0].isEmpty() || args[0].isBlank()) {
				sender.sendMessage(ChatColor.RED + "사용방법 : /chat <룸 번호>");
				return true;
			}else {
				main.room.put(Bukkit.getPlayer(sender.getName()).getUniqueId(), Integer.parseInt(args[0]));
				sender.sendMessage(ChatColor.WHITE + "You are in room #" + args[0]);
				return true;
			}
			
		}
		return true;
	}
}
