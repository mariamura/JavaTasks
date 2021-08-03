package com.mariamura.tasks.patterns.State;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Activity activity = new Attack();
        Activity activity1 = new Idle();
        Hero hero = new Hero();

        hero.setActivity(activity);
        hero.changeActivity();
        hero.justDoIt();

        Thread.sleep(5000);

        hero.setActivity(activity1);
        hero.changeActivity();
        hero.justDoIt();
    }
}
