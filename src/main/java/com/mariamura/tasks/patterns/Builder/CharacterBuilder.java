package com.mariamura.tasks.patterns.Builder;

public abstract class CharacterBuilder {
    Character character;

    void createCharacter() {
        character = new Character();
    }

    abstract void buildName();
    abstract void buildSpecies();
    abstract void buildMaxLevel();

    Character getCharacter() {
        return character;
    }

}
