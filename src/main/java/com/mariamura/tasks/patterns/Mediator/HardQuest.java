package com.mariamura.tasks.patterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class HardQuest implements Quest{
    List<Character> characters = new ArrayList<>();
    Character wiseMan;

    public void setWiseMan(Character wiseMan) {
        this.wiseMan = wiseMan;
    }
    public void addCharacter(Character character) {
        this.characters.add(character);
    }

    @Override
    public void sendText(String text, Character character) {
        for(Character c: characters) {
            if(c != character) c.getText(text);
        }
        wiseMan.getText(text);
    }
}
