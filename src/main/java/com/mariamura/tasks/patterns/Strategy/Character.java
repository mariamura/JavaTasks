package com.mariamura.tasks.patterns.Strategy;

public class Character {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void execute() {
        activity.justDoIt();
    }
}
