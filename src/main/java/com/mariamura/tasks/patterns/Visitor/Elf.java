package com.mariamura.tasks.patterns.Visitor;

public class Elf implements Character {
    @Override
    public void attack(Enemy enemy) {
        System.out.println("Elf is attack " + enemy);
    }

    @Override
    public void help(Mate mate) {
        System.out.println("Elf is use small regeneration on mate " + mate);
    }
}
