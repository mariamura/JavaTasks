package com.mariamura.tasks.patterns.Memento;

public class Cloud {
    private Saver saver;

    public Saver getSaver() {
        return saver;
    }

    public void setSaver(Saver saver) {
        this.saver = saver;
    }
}
