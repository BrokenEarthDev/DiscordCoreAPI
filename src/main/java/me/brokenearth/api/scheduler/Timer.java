package me.brokenearth.api.scheduler;
import java.util.TimerTask;

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
 */
public abstract class Timer {

    /**
     * The method that is called when the timer finished
     */
    public abstract void run();
    /**
     * The method that is called when the timer starts
     */
    private Timer timer = this;
    /**
     * Timer class in java.util that handles the timing
     */
    private java.util.Timer timer1 = new java.util.Timer();

    /**
     * Schedules the timer
     * @param millis should be in milliseconds
     */
    public void schedule(int millis) {
        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                timer.run();

            }
        }, millis);
    }

    /**
     * The run method is called after a specific time
     * @param millis must be in milliseconds
     */
    public void runEvery(int millis) {
        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                timer.run();
                runEvery(millis);
            }
        }, millis);
    }

    /**
     * Cancels the timer
     */
    public void cancel() {
        timer1.cancel();
    }
}