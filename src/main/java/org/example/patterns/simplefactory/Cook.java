package org.example.patterns.simplefactory;

public class Cook extends Character{
    public Cook() {
        setName("Ivan");
        setDamage(5);
        setStamina(8);

    }

    @Override
    public void sayHello() {
        System.out.println("Howdy! I am a COOK, yam yam!");
        sayInfo();
    }
}
