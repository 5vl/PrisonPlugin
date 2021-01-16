package prisonplugin.prisonplugin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import prisonplugin.prisonplugin.utils.MetricsLite;

public final class main extends JavaPlugin {
    private static main instance;
    String version = this.getDescription().getVersion();
    @Override
    public void onEnable() {
        System.out.println("Enabled Prison Plugin " + version);
        instance = this;
        this.getConfig().options().copyDefaults();
        saveDefaultConfig();
        PluginManager plm = org.bukkit.Bukkit.getPluginManager();
        int pluginId = 10028;
        MetricsLite metrics = new MetricsLite(this, pluginId);
        registerCMD();
    }

    public static main getInstance() {
        return instance;
    }

    public void registerCMD() {

    }
}
