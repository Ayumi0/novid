package icu.ayumi.novoid;

import org.bukkit.ChatColor;

public class MessageUtil {
    public static String translate(String message){
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
