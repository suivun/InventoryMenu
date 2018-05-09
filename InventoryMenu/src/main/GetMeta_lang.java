package main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.java.JavaPlugin;

public class GetMeta_lang extends JavaPlugin {
	public String playerlang (Player player) {

		for(MetadataValue meta: player.getMetadata("language")){
			String res = meta.asString();
			Bukkit.broadcastMessage("CorePositions is "+res);
			return res;
		}
		return "";
	}
}
