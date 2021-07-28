package com.mariamura.tasks.patterns.AbstractFactory;

import com.mariamura.tasks.patterns.AbstractFactory.Exhibition.ExhibitionFactory;

public class WorldExhibition {
    public static void main(String[] args) {
        AnimalGroupFactory animalGroupFactory = new ExhibitionFactory();
        Cat cat = animalGroupFactory.getCat("Lucy");
        Dog dog = animalGroupFactory.getDog("George");

        System.out.println("World exhibition is started...");
        cat.wantMilk();
        dog.wantWalk();
    }
}
