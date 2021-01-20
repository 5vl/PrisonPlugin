package prisonplugin.prisonplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import prisonplugin.prisonplugin.utils.chatcolors;

public class prison extends chatcolors implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        if (s.equalsIgnoreCase("prison")) {
            if (p.hasPermission("prison.prison")) {
                if (args.length > 0) {
                    if (p.hasPermission("prison.prison.test")) {
                        if (args[0].equalsIgnoreCase("test")) {
                            p.sendMessage(color("Test successful!"));
                        }
                    }
                }
                else {
                    p.sendMessage(color("Help for /prison:"));
                }
            }
        }
        return false;
    }
}
