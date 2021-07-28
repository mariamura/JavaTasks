package com.mariamura.tasks.patterns.FactoryMethod;

public class Cat implements Pet {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void wantHug() {
        System.out.println("Cat " + this.name + " want to hug you!");
    }
}
