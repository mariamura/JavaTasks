package com.mariamura.tasks.patterns.Observer;

import java.util.List;

public class Admin implements Observer{

    @Override
    public void handleUpdate(List<Skill> skillList) {
        System.out.println("You skills updated:\n" + skillList);
    }
}
