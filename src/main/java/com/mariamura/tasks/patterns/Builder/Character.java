package com.mariamura.tasks.patterns.Builder;

public class Character {

    private String name;
    private Species species;
    private int maxLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", species=" + species +
                ", maxLevel='" + maxLevel + '\'' +
                '}';
    }
}
