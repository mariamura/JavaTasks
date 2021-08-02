package com.mariamura.tasks.patterns.Builder;

public class Warrior extends CharacterBuilder {
    @Override
    void buildName() {
        character.setName("Warrior");
    }

    @Override
    void buildSpecies() {
        character.setSpecies(Species.HUMAN);
    }

    @Override
    void buildMaxLevel() {
        character.setMaxLevel(75);
    }
}
