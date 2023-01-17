package org.example.patterns.abstractfactory;

public class AncientSoldier extends Soldier {
    public AncientSoldier() {
        setDamage(20);
        setStamina(30);
    }

    @Override
    public void attack() {
        System.out.println("I am throwing a stone! Arrrggg");
    }
}
