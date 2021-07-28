package com.mariamura.tasks.patterns.AbstractFactory.Exhibition;

import com.mariamura.tasks.patterns.AbstractFactory.Dog;

public class RareDog implements Dog {
    String name;

    public RareDog(String name) {
        this.name = name;
    }

    @Override
    public void wantWalk() {
        System.out.println(this.name + " want to walk only with a gold leash..");
    }
}
