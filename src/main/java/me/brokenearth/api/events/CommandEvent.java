package me.brokenearth.api.events;

import me.brokenearth.api.commands.Command;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

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
 * Triggered when someone types the command prefix or the prefix and other words followed by it
 *
 * @see Command
 * @author BrokenEarth // BrokenEarthDev
 * @version 1.1
 */
public final class CommandEvent {

    /**
     * The command name
     */
    private String command;
    /**
     * The command prefix
     */
    private String prefix;
    /**
     * The executor of the command
     */
    private Member member;
    /**
     * The channel in which the command is executed
     */
    private MessageChannel channel;
    /**
     * The guild in which the command is executed
     */
    private Guild guild;
    /**
     * The jda in which the command is executed
     */
    private JDA jda;

    public CommandEvent(String command, String prefix, Member member, TextChannel channel, Guild guild, JDA jda) {
        this.command = command;
        this.prefix = prefix;
        this.member = member;
        this.channel = channel;
        this.jda = jda;
        this.guild = guild;
    }

    /**
     * Gets the command name and
     * @return it
     */
    public String getCommandName() {
        return command;
    }

    /**
     * Gets the prefix and
     * @return it
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Gets the executor and
     * @return it
     */
    public Member getMember() {
        return member;
    }

    /**
     * Gets the text channel and
     * @return it
     */
    public MessageChannel getChannel() {
        return channel;
    }

    /**
     * Gets the guild and
     * @return it
     */
    public Guild getGuild() {
        return guild;
    }

    /**
     * Gets the jda and
     * @return it
     */
    public JDA getJDA() {
        return jda;
    }
}
