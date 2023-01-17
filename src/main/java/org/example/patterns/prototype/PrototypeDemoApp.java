package org.example.patterns.prototype;

public class PrototypeDemoApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        //create a prototype object
        Soldier soldier1 = new Soldier();

        //test initial and changed state
        System.out.println("Soldier 1 initial stamina: " + soldier1.getInitialStamina());
        soldier1.setInitialStamina(50);
        System.out.println("Soldier 1 changed initial stamina: " + soldier1.getInitialStamina());
        soldier1.setState("attacking");
        System.out.println("Soldier 1 state: " + soldier1.getState());

        //create clone
        Soldier soldier2 = soldier1.clone();

        //test initial state
        System.out.println("Soldier 2 initial stamina: " + soldier2.getInitialStamina());
        System.out.println("Soldier 2 state: " + soldier2.getState());
    }
}
