package com.mariamura.tasks.patterns.State;

public class Hero {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if(activity instanceof Support) setActivity(new Support());
        else if(activity instanceof Attack) setActivity(new Attack());
        else if(activity instanceof Idle) setActivity(new Idle());
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
