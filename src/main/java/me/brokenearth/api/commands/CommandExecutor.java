package me.brokenearth.api.commands;

import me.brokenearth.api.events.CommandEvent;

public interface CommandExecutor {

    /**
     * Triggered when someone typed the prefix
     * @param event The event in which the command is triggered
     * @param args The command argument - split by regex
     */
    void onCommand(CommandEvent event, String[] args);
}
