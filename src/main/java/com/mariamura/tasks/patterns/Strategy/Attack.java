package com.mariamura.tasks.patterns.Strategy;

public class Attack implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Use special power!");
    }
}
