package com.mariamura.tasks.patterns.Observer;

public class Main {
    public static void main(String[] args) {
        SkillPanel skillPanel = new SkillPanel();

        Skill skill1 = new Skill("Mega Ulta", 1);
        Skill skill2 = new Skill("regeneration", 2);
        skillPanel.addSkill(skill1);
        skillPanel.addSkill(skill2);

        Admin admin = new Admin();
        skillPanel.setAdmin(admin);


    }
}
