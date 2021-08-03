package com.mariamura.tasks.patterns.Visitor;

public class Fight implements GameElement {
    GameElement[] gameElements;

    public Fight() {
        this.gameElements = new GameElement[]{
                new Mate(),
                new Enemy()
        };
    }

    @Override
    public void beInUse(Character character) {
        for(GameElement element: gameElements) {
            element.beInUse(character);
        }
    }
}
