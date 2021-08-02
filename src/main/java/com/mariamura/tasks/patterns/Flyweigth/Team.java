package com.mariamura.tasks.patterns.Flyweigth;

import java.util.HashMap;
import java.util.Map;

public class Team {
    private static final Map<String, Character> teamMates = new HashMap<>();

    public Character getCharacterByType(String type) {
        Character character = teamMates.get(type);

        if(character==null){
            switch (type) {
                case "elf" -> {
                    System.out.println("New Elf is calling!");
                    character = new Elf();
                }
                case "ork" -> {
                    System.out.println("New Ork is calling!");
                    character = new Ork();
                }
            }
            teamMates.put(type, character);
        }
        return character;
    }
}
