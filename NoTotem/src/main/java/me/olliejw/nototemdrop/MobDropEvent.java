package me.olliejw.nototemdrop;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class MobDropEvent implements Listener {

    ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);
    @EventHandler
    public void mobDropEvent (EntityDeathEvent event) {
        event.getDrops().remove(totem);
    }
}
