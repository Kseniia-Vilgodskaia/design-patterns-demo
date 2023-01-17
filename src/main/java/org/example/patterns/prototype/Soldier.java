package org.example.patterns.prototype;

public class Soldier extends Character{

    private String state = "idle";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    protected void reset() {
        setState("idle");
    }

    @Override
    public Soldier clone() throws CloneNotSupportedException {
        return (Soldier) super.clone();
    }
}
