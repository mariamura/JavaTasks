package com.mariamura.tasks.patterns.Memento;

import java.util.Date;

public class Game {
    private String version;
    private Date date;

    public Game(String version, Date date) {
        this.version = version;
        this.date = new Date();
    }

    public Saver save() {
        return new Saver(version);
    }

    public void load() {
        version = save().getVersion();
        date = save().getData();
    }

    @Override
    public String toString() {
        return "Game{" +
                "version='" + version + '\'' +
                ", data=" + date +
                '}';
    }
}
