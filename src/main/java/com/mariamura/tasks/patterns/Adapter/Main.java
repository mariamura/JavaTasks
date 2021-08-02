package com.mariamura.tasks.patterns.Adapter;

public class Main {
    public static void main(String[] args) {
        Character character = new AdapterCharacterToOrk();
        character.earn();
        character.eat();
        character.walk();
    }
}
