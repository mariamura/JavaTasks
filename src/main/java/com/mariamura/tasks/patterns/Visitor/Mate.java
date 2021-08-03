package com.mariamura.tasks.patterns.Visitor;

public class Mate implements GameElement {
    @Override
    public void beInUse(Character character) {
        character.help(this);
    }
}
