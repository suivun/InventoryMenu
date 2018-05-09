package main;

import org.bukkit.entity.Player;

public class MenuRun{

	public MenuRun(int slot, Player player) {
		// TODO 自動生成されたコンストラクター・スタブ
 
		switch(slot){
		case 0:
			player.sendMessage("gom");
			break;
		case 1:
			player.sendMessage("gom");
			break;
		default:
			player.sendMessage("gomiii " + slot);
			break;
		}

	}
}
