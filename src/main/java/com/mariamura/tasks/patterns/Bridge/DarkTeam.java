package com.mariamura.tasks.patterns.Bridge;

public class DarkTeam extends Character{

    protected DarkTeam(Wizard wizard) {
        super(wizard);
    }

    @Override
    public void upMaxLvl() {
        System.out.println("Dark team is getting max level...");
        wizard.getMagic();
    }
}
