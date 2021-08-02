package com.mariamura.tasks.patterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Character character = new VeteranElf(new HalfBreedElf(new Elf()));
        System.out.println(character.useSkill());

    }
}
