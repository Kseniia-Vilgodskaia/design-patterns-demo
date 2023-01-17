package org.example.patterns.state.enumrelease;


public class Order {

    private OrderState currentState = OrderState.NEW;

    //method for state objects
    public void cancel() {
        currentState.cancel();
        currentState = OrderState.CANCELLED;
    }

    public void processPayment() {
        currentState = OrderState.PAID;
    }

    public void dispatch() {
        currentState = OrderState.DISPATCHED;
    }

    public void deliver() {
        currentState = OrderState.DELIVERED;
    }
}
