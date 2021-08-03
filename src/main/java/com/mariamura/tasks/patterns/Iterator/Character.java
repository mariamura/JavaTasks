package com.mariamura.tasks.patterns.Iterator;

import java.util.List;

public class Character implements Collection {
    private String name;
    private int maxLevel;
    private List<String> skills;

    public Character(String name, int maxLevel, List<String> skills) {
        this.name = name;
        this.maxLevel = maxLevel;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator {
        int id;

        @Override
        public boolean hasNext() {
            return id<skills.size();
        }

        @Override
        public Object next() {
            return skills.get(id++);
        }
    }
}
