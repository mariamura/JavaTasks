package com.mariamura.tasks.patterns.AbstractFactory.Shelter;

import com.mariamura.tasks.patterns.AbstractFactory.Cat;

public class Siams implements Cat {
    String name;

    Siams(String name) {
        this.name = name;
    }

    @Override
    public void wantMilk() {
        System.out.println(this.name + " want milk!");
    }
}
