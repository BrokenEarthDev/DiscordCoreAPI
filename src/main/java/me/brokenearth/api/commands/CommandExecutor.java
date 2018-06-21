package me.brokenearth.api.commands;

import me.brokenearth.api.events.CommandEvent;

/**
 * Copyright 2018 github.com/BrokenEarthDev
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 * @author BrokenEarth // BrokenEarthDev
 * @version 1.0
 * @see Command
 */
public interface CommandExecutor {

    /**
     * Triggered when someone typed the prefix
     * @param event The event in which the command is triggered
     * @param args The command argument - split by regex
     */
    void onCommand(CommandEvent event, String[] args);
}
