package com.mariamura.tasks.patterns.Builder;

public class Commander {
    CharacterBuilder characterBuilder;

    public void setCharacterBuilder(CharacterBuilder characterBuilder) {
        this.characterBuilder = characterBuilder;
    }
    Character buildCharacter() {
        characterBuilder.createCharacter();
        characterBuilder.buildName();
        characterBuilder.buildSpecies();
        characterBuilder.buildMaxLevel();

        Character character = characterBuilder.getCharacter();
        return character;
    }
}
