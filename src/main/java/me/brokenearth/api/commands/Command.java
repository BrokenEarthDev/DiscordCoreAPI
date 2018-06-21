package me.brokenearth.api.commands;

import me.brokenearth.api.events.CommandEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.util.HashMap;

/**
 * Copyright 2018 github.com/BrokenEarthDev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 *
 * This class handles commands - make sure to register it in the registerCommand method
 * triggers CommandEvent
 * @see CommandEvent
 * @see CommandExecutor
 * @author BrokenEarth
 * @version 1.0
 */
public final class Command extends ListenerAdapter {

    /**
     * The prefix of the command
     */
    private static String prefix = "";

    /**
     * This hashmap stores Command as a key and String as a value
     */
    private static HashMap<CommandExecutor, String> map = new HashMap<>();

    /**
     * Sets the command prefix
     * @param prefix the desired command prefix
     */
    public static void setCommandPrefix(String prefix) {
        Command.prefix = prefix;
    }

    /**
     * Use this to register the command
     * @param executor the class that implements the CommandExecutor interface
     */
    public static void registerCommand(CommandExecutor executor) {
        map.put(executor, "");
    }

    @Override
    public final void onMessageReceived(MessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (!event.getMessage().getContentRaw().startsWith(prefix)) return; event.getChannel();
        for (CommandExecutor executor : map.keySet()) executor.onCommand(new CommandEvent(getCmd(args[0]), prefix, event.getMember(), event.getTextChannel(), event.getGuild(), event.getJDA()), args);
    }

    /**
     * Replaces the prefix by an empty string
     * @param cmd the name of the cmd
     * @return a string - prefix replaced by an empty string
     */
    private String getCmd(String cmd) {
        return cmd.replace(prefix, "");
    }
}