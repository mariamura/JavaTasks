package com.mariamura.tasks.patterns.Composite;

public class Main {
    public static void main(String[] args) {
        TeamGroup teamGroup = new TeamGroup();
        teamGroup.addTeamMates(new Elf());
        teamGroup.addTeamMates(new Ork());
        teamGroup.createTeam();
    }
}
