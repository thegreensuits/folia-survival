package fr.thegreensuits.folia_survival;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Folia Survival plugin enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("Folia Survival plugin disabled");
    }
}
