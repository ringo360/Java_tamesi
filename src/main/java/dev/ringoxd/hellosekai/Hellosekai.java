package dev.ringoxd.hellosekai;

import org.bukkit.plugin.java.JavaPlugin;

public final class Hellosekai extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // System.out.println("Hello, Sekai.");
        getLogger().info("Hello Sekai!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        // System.out.println("Goodbye, Sekai!");
        getLogger().info("Goodbye Sekai!");
    }
}
