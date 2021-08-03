package com.mariamura.tasks.patterns.Template;

public abstract class SkillTemplate {

    public void useSkill() {
        System.out.println("Prepare wand..");
        attack();
    }

    public abstract void attack();
}
