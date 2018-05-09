package main;


import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public static Main plugin;
	public Main() {
		plugin = this;
	}

	@Override
	public void onDisable() {
		// TODO 自動生成されたメソッド・スタブ
		super.onDisable();
	}

	@Override
	public void onEnable() {
		// TODO 自動生成されたメソッド・スタブ
		super.onEnable();
		System.out.println("PsperClick読み込まれる");
		new PaperClick(this);
		new onInventoryClick(this);
		getCommand("Menu").setExecutor(new Commands(this));
	}





}
