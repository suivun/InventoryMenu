package main;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PaperClick implements Listener {

	public PaperClick(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

	@EventHandler
	public void onPlayerInteractEvent(PlayerInteractEvent event) {
		System.out.println("1");
		// 手持ちのアイテムを取得
		ItemStack i = event.getPlayer().getItemInHand();
		// クリックしたブロックを取得
		if(i.getType() == Material.PAPER ) {
			Player Clickplayer = event.getPlayer();
			System.out.println("2");
			Clickplayer.performCommand("Menu");
		}
	}
}
/*https://www.spigotmc.org/threads/inventory-pages.248969/*/