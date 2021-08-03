package com.mariamura.tasks.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class SkillPanel implements Character{
    List<Skill> skillList = new ArrayList<>();
    Admin admin = new Admin();

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void addSkill(Skill skill) {
        skillList.add(skill);
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        admin.handleUpdate(skillList);
    }
}
