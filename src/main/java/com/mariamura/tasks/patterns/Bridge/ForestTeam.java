package com.mariamura.tasks.patterns.Bridge;

public class ForestTeam extends Character{

    protected ForestTeam(Wizard wizard) {
        super(wizard);
    }

    @Override
    public void upMaxLvl() {
        System.out.println("Forest team is getting max level..");
        wizard.getMagic();
    }
}
