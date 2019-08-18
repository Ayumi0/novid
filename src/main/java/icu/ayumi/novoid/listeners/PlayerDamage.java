package icu.ayumi.novoid.listeners;

import icu.ayumi.novoid.Main;
import icu.ayumi.novoid.MessageUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public class PlayerDamage {

    public void onDamage(EntityDamageEvent event){
        if(event.getEntity() instanceof Player && event.getCause().equals(EntityDamageEvent.DamageCause.VOID)){
            if(Main.enabled){
                Player p = (Player) event.getEntity();
                event.setCancelled(true);
                if(Main.mess){
                    p.sendMessage(MessageUtil.translate(Main.message.replaceAll("%player", p.getName())));
                }
                if(Main.globmess){
                    Bukkit.getServer().broadcastMessage(MessageUtil.translate(Main.globalmessage.replaceAll("%player", p.getName())));
                }
                if(Main.consolecomm){
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), Main.consolecommand.replaceAll("%player", p.getName()));
                }
                if(Main.teleportspawn){
                    p.teleport(Bukkit.getServer().getWorld(p.getLocation().getWorld().getName()).getSpawnLocation());
                }
            }
        }
    }
}
