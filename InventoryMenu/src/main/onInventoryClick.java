package main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;

public class onInventoryClick implements Listener {

	public onInventoryClick(Plugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void ClickItem_GUI(InventoryClickEvent e) {
		//クリックしたとき

		if(e.getClickedInventory().equals(GUI.Menu1)) {
			int slot = e.getSlot();
			Player player = (Player)e.getWhoClicked();
			e.setCancelled(true);
			new MenuRun(slot,player);
		}
	}
}
