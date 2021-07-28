package com.mariamura.tasks.patterns.AbstractFactory.Exhibition;

import com.mariamura.tasks.patterns.AbstractFactory.Cat;

public class RareCat implements Cat {
    String name;

    public RareCat(String name) {
        this.name = name;
    }

    @Override
    public void wantMilk() {
        System.out.println(this.name + " want to the best milk ever..");
    }
}
