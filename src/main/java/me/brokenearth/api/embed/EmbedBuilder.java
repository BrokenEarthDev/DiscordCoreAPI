package me.brokenearth.api.embed;

import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.TextChannel;

import java.awt.*;

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
 * This is a very simple class that simplifies (not as much) the EmbedBuilder
 * @author BrokenEarth // BrokenEarthDev
 * @version 1.0
 */
public final class EmbedBuilder {

    /**
     * The target EmbedBuilder
     */
    private net.dv8tion.jda.core.EmbedBuilder builder = new net.dv8tion.jda.core.EmbedBuilder();

    /**
     * Sets the color of the embed builder
     * @param color the color in which the embed builder is going to set
     */
    public void setColor(Color color) {
        builder.setColor(color);
    }

    /**
     * Sets the author of the embed builder
     * @param member the desired author
     */
    public void setAuthor(Member member) {
        builder.setAuthor(member.getUser().getName(), member.getUser().getAvatarUrl(), member.getUser().getAvatarUrl());
    }

    /**
     * Sets the author of the embed builder
     * @param name the name of the author
     * @param url the url of his / her avatar
     * @param iconUrl the icon url of his / her avatar
     */
    public void setAuthor(String name, String url, String iconUrl) {
        builder.setAuthor(name, url, iconUrl);
    }

    /**
     * Sends the embed builder to a specified channel
     * @param channel the desired channel in which the embed builder will be sent
     */
    public void send(TextChannel channel) {
        channel.sendMessage(builder.build()).queue();
    }

    /**
     * Adds a field in the embed builder
     * @param title the title of the embed builder
     * @param value the value of the title of the embed builder
     * @param inline decide whether the field will be inline or not
     */
    public void addField(String title, String value, boolean inline) {
        builder.addField(title, value, inline);
    }

    /**
     * Adds a field in the embed builder
     * @param title the value of the title of the embed builder (title is an empty string)
     * @param inline decide whether the field will be inline or not
     */
    public void addField(String title, boolean inline) {
        builder.addField(title, "", inline);
    }

    /**
     * Gets the embed builder and
     * @return the builder
     */
    public net.dv8tion.jda.core.EmbedBuilder getBuilder() {
        return builder;
    }

    /**
     * Sets the description of the embed builder
     * @param description the description of the embed builder
     */
    public void setDescription(String description) {
        builder.setDescription(description);
    }

    /**
     * Sets the title of the embed builder
     * @param title the title of the embed builder
     */
    public void setTitle(String title) {
        builder.setTitle(title);
    }
}