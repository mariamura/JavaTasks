package com.mariamura.tasks.patterns.Prototype;

public class WorldFactory {
    WorldMap worldMap;

    public WorldFactory(WorldMap worldMap) {
        this.worldMap = worldMap;
    }

    public void setWorldMap(WorldMap worldMap) {
        this.worldMap = worldMap;
    }
    WorldMap cloneWorldMap() {
        return (WorldMap) worldMap.copy();
    }
}
