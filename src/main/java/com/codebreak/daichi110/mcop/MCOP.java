package com.codebreak.daichi110.mcop;

import org.bukkit.plugin.java.JavaPlugin;

import com.codebreak.daichi110.mcop.command.MCOPCommand;
import com.codebreak.daichi110.mcop.config.MCOPConfig;

public class MCOP extends JavaPlugin {
	
	public static MCOP instance;
	protected MCOPConfig config;
	private static MCOPAPI api;
	
	@Override
	public void onEnable() {
		
		instance = this;
		
		config = MCOPConfig.getConfig();
		
		api = new MCOPAPI(this, config);
		
		getCommand("mcop").setExecutor(new MCOPCommand());
		
	}
	
	@Override
	public void onDisable() {
		
		
		
	}
	
	public static MCOPAPI getAPI() {
		return api;
		
	}

}
