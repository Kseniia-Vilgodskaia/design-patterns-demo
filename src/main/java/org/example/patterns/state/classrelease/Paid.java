package org.example.patterns.state.classrelease;

public class Paid implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Order has been paid. Processing roll back");
        return 10;
    }
}
