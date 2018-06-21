package me.brokenearth.api.scheduler;
import java.util.TimerTask;

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