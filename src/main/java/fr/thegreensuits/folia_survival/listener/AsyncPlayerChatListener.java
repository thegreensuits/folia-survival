package fr.thegreensuits.folia_survival.listener;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AsyncPlayerChatListener implements Listener {
    @EventHandler()
    public void onAsyncPlayerChat(AsyncPlayerChatEvent event) {
        List<Player> mentionnedPlayers = Bukkit.getOnlinePlayers()
                .stream()
                .filter(player -> event.getMessage().contains(player.getDisplayName()) && event.getPlayer() != player)
                .collect(
                        java.util.stream.Collectors.toList());

        for (Player player : mentionnedPlayers) {
            event.setMessage(event.getMessage().replace(player.getDisplayName(),
                    "§5§l" + player.getDisplayName() + "§7"));
            player.playSound(player.getLocation(), Sound.ENTITY_CHICKEN_EGG, 1f, 1f);
        }

        event.setFormat(
                "§7" + event.getPlayer().getDisplayName() + " §8»§7 " + event.getMessage().replaceAll("%", "%%"));
    }
}
