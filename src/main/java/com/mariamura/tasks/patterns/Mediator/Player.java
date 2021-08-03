package com.mariamura.tasks.patterns.Mediator;

public class Player implements Character{
    String name;
    Quest quest;

    public Player(String name, Quest quest) {
        this.name = name;
        this.quest = quest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void sendText(String text) {
        quest.sendText(text, this);
    }

    @Override
    public void getText(String text) {
        System.out.println(this.name + " is thinking about answer...");
    }
}
