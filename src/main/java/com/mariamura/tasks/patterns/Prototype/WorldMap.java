package com.mariamura.tasks.patterns.Prototype;

public class WorldMap implements Copyable {
    private int id;
    private String name;
    private String sourceMap;

    public WorldMap(int id, String name, String sourceMap) {
        this.id = id;
        this.name = name;
        this.sourceMap = sourceMap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourceMap() {
        return sourceMap;
    }

    public void setSourceMap(String sourceMap) {
        this.sourceMap = sourceMap;
    }

    @Override
    public String toString() {
        return "WorldMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sourceMap='" + sourceMap + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        return new WorldMap(id, name, sourceMap);
    }
}
