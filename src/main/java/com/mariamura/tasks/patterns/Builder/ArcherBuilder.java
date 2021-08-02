package com.mariamura.tasks.patterns.Builder;

public class ArcherBuilder extends CharacterBuilder {
    @Override
    void buildName() {
        character.setName("Archer");
    }

    @Override
    void buildSpecies() {
        character.setSpecies(Species.ELF);
    }

    @Override
    void buildMaxLevel() {
        character.setMaxLevel(150);
    }
}
