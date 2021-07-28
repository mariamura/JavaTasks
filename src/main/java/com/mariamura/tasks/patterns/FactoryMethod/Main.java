package com.mariamura.tasks.patterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PetFactory petFactory = createPet("cat");
        Pet pet = petFactory.createPet("Liam");
        pet.wantHug();
    }

    static PetFactory createPet(String petType) {
        switch (petType) {
            case "cat": return new CatFactory();
            case "dog": return new DogFactory();
            default: throw new RuntimeException(petType + ": such petType not found..");
        }
    }
}

