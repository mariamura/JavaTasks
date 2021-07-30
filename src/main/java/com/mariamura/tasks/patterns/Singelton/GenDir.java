package com.mariamura.tasks.patterns.Singelton;

public class GenDir {
    private static GenDir genDir;
    private String name;

    private GenDir() {
    }

    public static synchronized GenDir getGenDir() {
        if(genDir == null) {
            genDir = new GenDir();
        }
        return genDir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
