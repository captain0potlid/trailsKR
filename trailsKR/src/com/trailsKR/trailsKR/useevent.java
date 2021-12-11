package com.trailsKR.trailsKR;

import java.util.HashSet;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.material.Door;
import org.bukkit.material.Openable;

public class useevent implements Listener{
	
	@EventHandler
    public void OnPlayerChat(PlayerChatEvent e) {
        
		int room = voids.getroom(e.getPlayer());
		if(room == -1) return;
		e.setCancelled(true);
		voids.roomsend(room, e.getPlayer(), e.getMessage());
		
	}
}


