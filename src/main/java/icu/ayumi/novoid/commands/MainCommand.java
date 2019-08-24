package icu.ayumi.novoid.commands;

import icu.ayumi.novoid.Main;
import icu.ayumi.novoid.MessageUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MainCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("nv")){
            return true;
        }
        if(args.length == 0){
            if(commandSender.hasPermission("nv.disable")){
                Main.enabled = !Main.enabled;
                if(Main.enabled){
                    commandSender.sendMessage(MessageUtil.translate(Main.enablemessage));
                } else {
                    commandSender.sendMessage(MessageUtil.translate(Main.disablemessage));
                }
            }
        } else if(args[0].equalsIgnoreCase("author")){
            commandSender.sendMessage("Author: Ayumi");
        }
        return false;
    }
}
