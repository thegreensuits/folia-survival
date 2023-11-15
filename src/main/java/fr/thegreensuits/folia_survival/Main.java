package fr.thegreensuits.folia_survival;

import org.bukkit.plugin.java.JavaPlugin;

import fr.thegreensuits.folia_survival.listener.AsyncPlayerChatListener;
import fr.thegreensuits.folia_survival.listener.PlayerJoinListener;
import fr.thegreensuits.folia_survival.listener.PlayerQuitListener;

public class Main extends JavaPlugin {
    public static Main INSTANCE;

    public Main() {
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        super.onEnable();

        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), INSTANCE);
        getServer().getPluginManager().registerEvents(new PlayerQuitListener(), INSTANCE);
        getServer().getPluginManager().registerEvents(new AsyncPlayerChatListener(), INSTANCE);

        getLogger().info("Folia Survival plugin enabled");
    }

    @Override
    public void onDisable() {
        super.onLoad();
        getLogger().info("Folia Survival plugin disabled");
    }
}
