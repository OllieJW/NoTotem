package me.olliejw.nototemdrop;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoTotemDrop extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Enabling NoTotemDrop. Go to https://olliejw.me for more plugins :)");
        getServer().getPluginManager().registerEvents(new MobDropEvent(), this);
    }
}
