package com.mariamura.tasks.patterns.AbstractFactory;

public interface AnimalGroupFactory {
    Dog getDog(String name);
    Cat getCat(String name);
}
