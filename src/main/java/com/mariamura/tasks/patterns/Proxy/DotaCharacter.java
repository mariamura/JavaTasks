package com.mariamura.tasks.patterns.Proxy;

public class DotaCharacter implements Character {
    String url;

    public DotaCharacter(String url) {
        this.url = url;
        load();
    }
    void load() {
        System.out.println("Loading from cloud: " + url);
    }


    @Override
    public void create() {
        System.out.println("Dota character is ready..");
    }
}
