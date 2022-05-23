package main.mypackage;

import main.mypackage.cmd.cmd;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class Main extends JavaPlugin implements Listener {


    public static Main plugin;
    @Override
    public void onEnable() {
        super.onEnable();
        plugin = this;
        getCommand("").setExecutor(new cmd());
        Listener[] events = {};
        PluginManager pm = Bukkit.getPluginManager();
        Arrays.stream(events).forEach(classes -> {
            pm.registerEvents(classes, this);
        });
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
