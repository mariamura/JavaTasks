package com.mariamura.tasks.patterns.Decorator;

public class VeteranElf extends CharacterDecorator {

    public VeteranElf(Character character) {
        super(character);
    }
    public String getExtraLife() {
        return "Get extra life to all elfs...\n";
    }

    @Override
    public String useSkill() {
        return super.useSkill() + getExtraLife();
    }
}
