package main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Commands implements CommandExecutor {

	@SuppressWarnings("unused")
	private final Main plugin;
	public Commands(Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(!(sender instanceof Player))return false;
		Player player = (Player)sender;

		if(command.getName().equalsIgnoreCase("Menu")) {
			//本体
			//GUI.Menu1.setItem(0, new ItemStack(Material.ACACIA_DOOR_ITEM,  1));
			player.openInventory(GUI.Menu1);
			sender.sendMessage(ChatColor.GREEN + "OpenMenu");


		}
		return false;
	}

}
//https://bukkit.org/threads/tutorial-create-a-inventory-menu.173571/