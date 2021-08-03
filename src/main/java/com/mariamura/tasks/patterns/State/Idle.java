package com.mariamura.tasks.patterns.State;

public class Idle implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Stay back");
    }
}
