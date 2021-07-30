package com.mariamura.tasks.patterns.Singelton;

public class Main {
    public static void main(String[] args) {
        GenDir g = GenDir.getGenDir();
        g.setName("John");
        System.out.println("New general director is " + g.getName());
    }
}
