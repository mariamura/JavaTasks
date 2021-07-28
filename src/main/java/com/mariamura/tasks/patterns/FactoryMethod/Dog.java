package com.mariamura.tasks.patterns.FactoryMethod;

public class Dog implements Pet {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void wantHug() {
        System.out.println("Dog" + this.name + " want to hug you!");
    }
}
