package com.mariamura.tasks.patterns.FactoryMethod;

public class DogFactory implements PetFactory {
    @Override
    public Pet createPet(String name) {
        return new Dog(name);
    }
}
