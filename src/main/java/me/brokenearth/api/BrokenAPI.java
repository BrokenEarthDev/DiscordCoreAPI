package me.brokenearth.api;

import me.brokenearth.api.commands.Command;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.util.concurrent.TimeUnit;

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
 * This is the main class of the API
 * You need to use the register method to use it
 * @author BrokenEarth
 * @version 1.0
 */
public abstract class BrokenAPI extends ListenerAdapter {

    /**
     * The jda in which it is declared in the register method
     */
    private static JDA jda;

    /**
     * Registers the API
     * @param jda the jda you are using
     */
    public static void register(JDA jda) {
        setJda(jda);
        BrokenAPI.jda = jda;
        jda.addEventListener(new Command());
    }

    /**
     * Unregisters the API
     */
    public static void unregister() {
        jda.removeEventListener(new Command());
    }

    /**
     * Sets the jda for API use
     * @param jda the jda you are using
     */
    private static void setJda(JDA jda) {
        BrokenAPI.jda = jda;
    }

    /**
     * Gets the jda
     * @return it
     */
    public static JDA getJda() {
        return jda;
    }
}