package org.example.patterns.state.classrelease;

public class Dispatched implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Order dispatched. Roll back will be possible after delivery.");
        return 20;
    }
}
