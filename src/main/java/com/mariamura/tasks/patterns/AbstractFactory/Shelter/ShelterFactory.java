package com.mariamura.tasks.patterns.AbstractFactory.Shelter;

import com.mariamura.tasks.patterns.AbstractFactory.AnimalGroupFactory;
import com.mariamura.tasks.patterns.AbstractFactory.Cat;
import com.mariamura.tasks.patterns.AbstractFactory.Dog;

public class ShelterFactory implements AnimalGroupFactory {

    @Override
    public Dog getDog(String name) {
        return new Bulldog(name);
    }

    @Override
    public Cat getCat(String name) {
        return new Siams(name);
    }
}
