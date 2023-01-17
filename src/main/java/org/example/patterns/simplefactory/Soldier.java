package org.example.patterns.simplefactory;

public class Soldier extends Character {

    public Soldier() {
        setName("Gerald");
        setDamage(50);
        setStamina(30);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I am a powerful SOLDIER!");
        sayInfo();
    }
}
