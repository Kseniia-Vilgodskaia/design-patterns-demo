package org.example.patterns.simplefactory;

public abstract class Character {

    private String name;
    private int damage;
    private int stamina;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public abstract void sayHello();

    public void sayInfo() {
        System.out.println("My name is " + getName());
        System.out.println("My damage is " + getDamage());
        System.out.println("My stamina is " + getStamina());
    }
}
