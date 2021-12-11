package com.trailsKR.trailsKR;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class voids {
	public static int getroom(Player p) {
		int a;
		
		if(!main.room.containsKey(p.getUniqueId())) return -1;
		
		a = main.room.get(p.getUniqueId());
		
		return a;
	}
	public static void roomsend(int room, Player p, String msg) {
		for(Player w : Bukkit.getOnlinePlayers()) {
			if(getroom(w) == room) {
				String name = p.getDisplayName();
				w.sendMessage(ChatColor.GREEN + name + " - " + ChatColor.WHITE + msg);
			} else {
				return;
			}
		}
	}
}
