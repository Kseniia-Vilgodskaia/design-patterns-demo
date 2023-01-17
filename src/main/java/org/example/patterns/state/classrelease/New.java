package org.example.patterns.state.classrelease;

public class New implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("This is a new state. No processing needed.");
        return 0;
    }
}
