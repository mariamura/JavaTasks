package com.mariamura.tasks.patterns.FactoryMethod;

public class CatFactory implements PetFactory {
    @Override
    public Pet createPet(String name) {
        return new Cat(name);
    }
}
