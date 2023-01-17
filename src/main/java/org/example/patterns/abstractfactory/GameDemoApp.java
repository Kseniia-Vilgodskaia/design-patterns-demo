package org.example.patterns.abstractfactory;

public class GameDemoApp {
    public static void main(String[] args) {
        //create factories
        CharacterFactory factory1 = new AncientCharacterFactory();
        CharacterFactory factory2 = new MedievalCharacterFactory();

        //test actions of the first factory characters
        Soldier soldier1 = factory1.createSoldier();
        soldier1.attack();
        System.out.println("My damage is " + soldier1.getDamage());

        Wizard wizard1 = factory1.createWizard();
        wizard1.castSpell();
        System.out.println("My magic power is " + wizard1.getMagicPower());


        //test actions of the second factory characters
        Soldier soldier2 = factory2.createSoldier();
        soldier2.attack();
        System.out.println("My damage is " + soldier2.getDamage());

        Wizard wizard2 = factory2.createWizard();
        wizard2.castSpell();
        System.out.println("My magic power is " + wizard2.getMagicPower());
    }
}
