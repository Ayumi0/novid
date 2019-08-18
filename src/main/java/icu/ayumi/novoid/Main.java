package icu.ayumi.novoid;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static boolean enabled, mess, globmess, consolecomm, teleportspawn;
    public static String message, globalmessage, consolecommand;

    @Override
    public void onEnable() {
        System.out.println("Enabling NoVoids!");
        enabled = this.getConfig().getBoolean("enabled");
        mess = this.getConfig().getBoolean("messages_enabled");
        globmess = this.getConfig().getBoolean("globalmessage_enabled");
        consolecomm = this.getConfig().getBoolean("consolecommand_enabled");
        teleportspawn = this.getConfig().getBoolean("teleportspawn");
        message = this.getConfig().getString("message");
        globalmessage = this.getConfig().getString("globalmessage");
        consolecommand = this.getConfig().getString("consolecommand");
        this.saveConfig();
    }

    @Override
    public void onDisable() {
        System.out.println("Disabling NoVoids!");
    }
}
