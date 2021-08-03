package com.mariamura.tasks.patterns.Observer;

public class Skill {
    private final String name;
    private int currentLevel;

    public Skill(String name, int currentLevel) {
        this.name = name;
        this.currentLevel = currentLevel;
    }

    public String getName() {
        return name;
    }


    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", currentLevel=" + currentLevel +
                '}';
    }
}
