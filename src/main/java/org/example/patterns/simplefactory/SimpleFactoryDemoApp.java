package org.example.patterns.simplefactory;

public class SimpleFactoryDemoApp {
    public static void main(String[] args) {
        CharacterFactory.createCharacter(CharacterType.SOLDIER).sayHello();
        CharacterFactory.createCharacter(CharacterType.COOK).sayHello();
        CharacterFactory.createCharacter(CharacterType.WIZARD).sayHello();
    }
}
