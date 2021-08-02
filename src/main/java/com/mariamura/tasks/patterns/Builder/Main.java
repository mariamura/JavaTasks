package com.mariamura.tasks.patterns.Builder;

public class Main {
    public static void main(String[] args) {
        Commander commander = new Commander();
        commander.setCharacterBuilder(new NecromancerBuilder());
        Character character = commander.buildCharacter();

        System.out.println(character);
    }
}
