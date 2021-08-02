package com.mariamura.tasks.patterns.Decorator;

public class CharacterDecorator implements Character {
    Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public String useSkill() {
        return character.useSkill();
    }
}
