package com.mariamura.tasks.patterns.Decorator;

public class HalfBreedElf extends CharacterDecorator {

    public HalfBreedElf(Character character) {
        super(character);
    }

    public String useUltimate() {
        return "Ultimate forest power is coming...\n";
    }

    @Override
    public String useSkill() {
        return super.useSkill() + useUltimate();
    }
}
