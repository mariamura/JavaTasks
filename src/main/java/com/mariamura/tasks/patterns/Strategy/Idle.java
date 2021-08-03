package com.mariamura.tasks.patterns.Strategy;

public class Idle implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Stay back...");
    }
}
