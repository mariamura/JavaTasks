package com.mariamura.tasks.patterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> skills = new ArrayList<>();
        skills.add("earth shake");
        skills.add("extra power");
        skills.add("invisibility");
        Character character = new Character("Elf", 200, skills);

        Iterator iterator = character.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
