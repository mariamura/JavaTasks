package com.mariamura.tasks.patterns.AbstractFactory;

import com.mariamura.tasks.patterns.AbstractFactory.Shelter.ShelterFactory;

public class CharitableEvents {
    public static void main(String[] args) {
        AnimalGroupFactory animalGroupFactory = new ShelterFactory();
        Cat cat = animalGroupFactory.getCat("Yuri");
        Dog dog = animalGroupFactory.getDog("Monika");

        System.out.println("Charitable events is stater...");
        cat.wantMilk();
        dog.wantWalk();
    }

}
