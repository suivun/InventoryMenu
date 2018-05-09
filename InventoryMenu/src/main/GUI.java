package main;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class GUI {
	public static Inventory Menu1 = Bukkit.createInventory(null, 54,ChatColor.AQUA + (ChatColor.BOLD + "Menu"));
	static {
		ItemStack item = new ItemStack(Material.ACACIA_DOOR_ITEM);
		String Itemname = ("unko");
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Itemname);
		meta.setLore(Arrays.asList("gomi1","gomi2"));
		item.setItemMeta(meta);
		Menu1.setItem(0, item);


	}


}
