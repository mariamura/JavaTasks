package com.mariamura.tasks.patterns.AbstractFactory.Exhibition;

import com.mariamura.tasks.patterns.AbstractFactory.AnimalGroupFactory;
import com.mariamura.tasks.patterns.AbstractFactory.Cat;
import com.mariamura.tasks.patterns.AbstractFactory.Dog;
import com.mariamura.tasks.patterns.AbstractFactory.Shelter.Siams;

public class ExhibitionFactory implements AnimalGroupFactory {
    @Override
    public Dog getDog(String name) {
        return new RareDog(name);
    }

    @Override
    public Cat getCat(String name) {
        return new RareCat(name);
    }
}
