package com.mariamura.tasks.patterns.Proxy;

public class Main {
    public static void main(String[] args) {
        Character character = new ProxyDotaCharacter("https://www.dota/clouds/wizard");
        character.create();
    }
}
