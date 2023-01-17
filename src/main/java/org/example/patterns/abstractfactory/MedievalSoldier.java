package org.example.patterns.abstractfactory;

public class MedievalSoldier extends Soldier{

    public MedievalSoldier() {
        setDamage(50);
        setStamina(80);
    }

    @Override
    public void attack() {
        System.out.println("I am stabbing you with a knife");
    }
}
