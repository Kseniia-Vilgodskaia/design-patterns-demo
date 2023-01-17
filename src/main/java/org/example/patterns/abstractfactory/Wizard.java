package org.example.patterns.abstractfactory;

public abstract class Wizard {

    private int magicPower;

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public abstract void castSpell();
}
