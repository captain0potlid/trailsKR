package com.trailsKR.trailsKR;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {

	ConsoleCommandSender consol = Bukkit.getConsoleSender();
	public static HashMap<UUID, Integer> room = new HashMap<UUID, Integer>(); 
	
	@Override
	public void onEnable() {
		consol.sendMessage(ChatColor.AQUA + "ChatRoom Plugin has been enabled.");
		getServer().getPluginManager().registerEvents(this, this);
		this.getCommand("chat").setExecutor(new oncmd());
		this.getServer().getPluginManager().registerEvents(new useevent(), this);
	}
}
