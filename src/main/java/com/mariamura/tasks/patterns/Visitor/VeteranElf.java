package com.mariamura.tasks.patterns.Visitor;

public class VeteranElf implements Character{
    @Override
    public void attack(Enemy enemy) {
        System.out.println("Veteran is use mega attack on " + enemy);
    }

    @Override
    public void help(Mate mate) {
        System.out.println("Veteran is help to regenerate dead mate " + mate);
    }
}
