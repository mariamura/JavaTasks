package com.mariamura.tasks.patterns.Adapter;

public class AdapterCharacterToOrk extends Ork implements Character {
    @Override
    public void walk() {
        walkOnWolf();
    }

    @Override
    public void earn() {
        earnCoins();
    }

    @Override
    public void eat() {
        eatRareMeat();
    }
}
