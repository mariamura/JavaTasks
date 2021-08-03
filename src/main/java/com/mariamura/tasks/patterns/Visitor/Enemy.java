package com.mariamura.tasks.patterns.Visitor;

public class Enemy implements GameElement {
    @Override
    public void beInUse(Character character) {
        character.attack(this);
    }
}
