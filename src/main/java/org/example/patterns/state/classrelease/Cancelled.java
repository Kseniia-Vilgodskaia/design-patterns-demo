package org.example.patterns.state.classrelease;

public class Cancelled implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Order has already been cancelled.");
        return 0;
    }
}
