package org.example.patterns.simplefactory;

public class Wizard extends Character {
    public Wizard() {
        setName("Gendalf");
        setDamage(10);
        setStamina(100);
    }

    @Override
    public void sayHello() {
        System.out.println("Heeeeeeyyyyy youuu, I am the most powerful WIZARD!");
        sayInfo();
    }
}
