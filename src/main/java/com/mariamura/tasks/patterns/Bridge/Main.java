package com.mariamura.tasks.patterns.Bridge;

public class Main {
    public static void main(String[] args) {
        Character[] characters = {
                new DarkTeam(new Ork()),
                new ForestTeam(new Elf())
        };
        for(Character character : characters) {
            character.upMaxLvl();
        }
    }
}
