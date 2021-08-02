package com.mariamura.tasks.patterns.Bridge;

public abstract class Character {
    protected Wizard wizard;

    protected Character(Wizard wizard) {
        this.wizard = wizard;
    }

    public abstract void upMaxLvl();
}
