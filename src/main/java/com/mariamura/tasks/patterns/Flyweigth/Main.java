package com.mariamura.tasks.patterns.Flyweigth;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        List<Character> teamMates = new ArrayList<>();

        teamMates.add(team.getCharacterByType("ork"));
        teamMates.add(team.getCharacterByType("ork"));

        teamMates.add(team.getCharacterByType("elf"));
        teamMates.add(team.getCharacterByType("elf"));

        for(Character character: teamMates) {
            character.useSkill();
        }

    }
}
