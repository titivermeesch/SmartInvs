package fr.minuskube.inv.scheduler.scheduler;

import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;

public interface SchedulerAdapter {
    BukkitTask runTask(Plugin plugin, Runnable runnable);
}
