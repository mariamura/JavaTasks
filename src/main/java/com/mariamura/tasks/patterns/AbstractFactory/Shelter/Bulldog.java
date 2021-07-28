package com.mariamura.tasks.patterns.AbstractFactory.Shelter;

import com.mariamura.tasks.patterns.AbstractFactory.Dog;

public class Bulldog implements Dog {
    String name;

    public Bulldog(String name) {
        this.name = name;
    }

    @Override
    public void wantWalk() {
        System.out.println(this.name + " want to walk!");
    }
}
