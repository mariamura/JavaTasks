package com.mariamura.tasks.patterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();

        character.setActivity(new Attack());
        character.execute();

        character.setActivity(new Idle());
        character.execute();
    }
}
