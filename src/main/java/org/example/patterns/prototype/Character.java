package org.example.patterns.prototype;

public abstract class Character implements Cloneable{
    private int initialStamina = 20;

    public int getInitialStamina() {
        return initialStamina;
    }

    public void setInitialStamina(int initialStamina) {
        this.initialStamina = initialStamina;
    }

    @Override
    public Character clone() throws CloneNotSupportedException {
        Character character = (Character) super.clone();
        character.initialize();
        return character;
    }

    protected void initialize() {
        setInitialStamina(20);
        reset();
    }

    protected abstract void reset();
}
