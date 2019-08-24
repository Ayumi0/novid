package icu.ayumi.novoid;

import icu.ayumi.novoid.commands.MainCommand;
import icu.ayumi.novoid.listeners.PlayerDamage;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static boolean enabled, mess, globmess, consolecomm, teleportspawn;
    public static String message, globalmessage, consolecommand, enablemessage, disablemessage;

    @Override
    public void onEnable() {
        System.out.println("Enabling NoVoids!");
        enabled = true;
        enablemessage = this.getConfig().getString("enabledmessage");
        disablemessage = this.getConfig().getString("disabledmessage");
        mess = this.getConfig().getBoolean("messages_enabled");
        globmess = this.getConfig().getBoolean("globalmessage_enabled");
        consolecomm = this.getConfig().getBoolean("consolecommand_enabled");
        teleportspawn = this.getConfig().getBoolean("teleportspawn");
        message = this.getConfig().getString("message");
        globalmessage = this.getConfig().getString("globalmessage");
        consolecommand = this.getConfig().getString("consolecommand");
        this.saveConfig();
        this.getServer().getPluginManager().registerEvents(new PlayerDamage(), this);
        this.getCommand("nv").setExecutor(new MainCommand());
    }

    @Override
    public void onDisable() {
        System.out.println("Disabling NoVoids!");
    }
}
