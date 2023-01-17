package org.example.patterns.simplefactory;

public class CharacterFactory {

    public static Character createCharacter(CharacterType type) {
        switch (type) {
            case SOLDIER:
                return new Soldier();
            case WIZARD:
                return new Wizard();
            case COOK:
                return new Cook();
            default:
                throw new IllegalArgumentException("Character type not found " + type);
        }
    }
}
