package org.example.patterns.state.classrelease;

public class Delivered implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Order delivered. Please return your order to our nearest office.");
        return 30;
    }
}
