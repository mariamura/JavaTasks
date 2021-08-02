package com.mariamura.tasks.patterns.Builder;

public class NecromancerBuilder extends CharacterBuilder {
    @Override
    void buildName() {
        character.setName("Necromancer");
    }

    @Override
    void buildSpecies() {
        character.setSpecies(Species.ORK);
    }

    @Override
    void buildMaxLevel() {
        character.setMaxLevel(90);
    }
}
