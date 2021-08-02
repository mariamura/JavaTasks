package com.mariamura.tasks.patterns.Prototype;

public class Main {
    public static void main(String[] args) {
        WorldMap worldMap = new WorldMap(1, "Minecraft", "new SourceFile()");
        System.out.println(worldMap);

        WorldFactory worldFactory = new WorldFactory(worldMap);
        WorldMap worldMapClone = worldFactory.cloneWorldMap();
        System.out.println(worldMapClone);
    }
}
