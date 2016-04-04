package me.lim_bo56.lnpp.menus.listeners;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.lim_bo56.lnpp.MainPreferences;
import me.lim_bo56.lnpp.menus.LobbyPreferences;
import me.lim_bo56.lnpp.menus.PlayerPreferences;
import me.lim_bo56.lnpp.utils.AllStrings;

/**
 * 
 * @author lim_bo56
 *
 */

public class MainMenuListener extends AllStrings implements Listener {

    MainPreferences plugin;
	
	public MainMenuListener(MainPreferences instance) {
		this.plugin = instance;
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		if(e.getInventory().getName().equals(MenuPreferencesName)) {
			if(e.isRightClick() || e.isLeftClick()) {
				e.setCancelled(true);
			}
		}
    }
	
	@EventHandler
	public void MenuPreferencesL(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		
		if(e.getInventory().getName().equals(MenuPreferencesName)) {
			if(e.isRightClick() || e.isLeftClick()) {
				if(e.getSlot()== 11) {
					PlayerPreferences.openPlayerPreferences(p);
					p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 10);
				}
			}
		}
		
		if(e.getInventory().getName().equals(MenuPreferencesName)) {
			if(e.isRightClick() || e.isLeftClick()) {
				if(e.getSlot()== 15) {
					LobbyPreferences.openLobbyPreferences(p);
					p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 10);
				}
			}
		}
		
		
	}
}