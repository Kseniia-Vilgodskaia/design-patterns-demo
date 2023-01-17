package org.example.patterns.abstractfactory;

public abstract class Soldier {

    private int damage;
    private int stamina;

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

    public abstract void attack();
}
