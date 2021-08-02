package com.mariamura.tasks.patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class TeamGroup {
    private List<Character> teamMates = new ArrayList<>();

    public void addTeamMates(Character character) {
        teamMates.add(character);
    }

    public void removeTeamMates(Character character) {
        teamMates.remove(character);
    }

    public void createTeam() {
        System.out.println("Team mates is creating...");
        for(Character character: teamMates) {
            character.useSkill();
        }
    }

}
