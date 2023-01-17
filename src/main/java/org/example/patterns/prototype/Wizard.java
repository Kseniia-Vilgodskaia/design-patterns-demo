package org.example.patterns.prototype;

public class Wizard extends Character {

    private String state = "waiting";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    protected void reset() {
        setState("waiting");
    }

    @Override
    public Wizard clone() throws CloneNotSupportedException {
        return (Wizard) super.clone();
    }
}
