package com.codebreak.daichi110.mcop;

import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import com.codebreak.daichi110.mcop.config.MCOPConfig;

public class MCOPAPI {
	
	private MCOP plugin;
	private MCOPConfig config;
	
	private Inventory kits;
	private Team team;

	public MCOPAPI(MCOP plugin, MCOPConfig config) {
		
		this.plugin = plugin;
		this.config = config;
		
	}
	
	public void Setup() {
		
		//スコアボード周り
		if(getScoreboard().getTeam("MCOP") == null) {
			team = getScoreboard().registerNewTeam("MCOP");
			team.setDisplayName(ChatColor.GOLD + "生存者" + ChatColor.RESET);
			team.setPrefix(ChatColor.GOLD.toString());
			team.setSuffix(ChatColor.RESET.toString());
		}
		
		//インベントリ周り
		int slot = 9;	
		kits = plugin.getServer().createInventory(null, slot, "Kit選択画面");
		setKitsMenu();
		
	}
	
	public Scoreboard getScoreboard() {
		
		return plugin.getServer().getScoreboardManager().getMainScoreboard();
		
	}
	
	public void setKitsMenu() {
		
	}

}
