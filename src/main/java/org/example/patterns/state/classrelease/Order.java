package org.example.patterns.state.classrelease;

public class Order {

    private final OrderStateFactory stateFactory = OrderStateFactory.getFactory();

    private OrderState currentState = stateFactory.getOrderStateByType(OrderStateFactory.Type.NEW);

    //method for state objects
    public double cancel() {
        return currentState.handleCancellation();
    }

    public void processPayment() {
        currentState = stateFactory.getOrderStateByType(OrderStateFactory.Type.PAID);
    }

    public void dispatch() {
        currentState = stateFactory.getOrderStateByType(OrderStateFactory.Type.DISPATCHED);
    }

    public void deliver() {
        currentState = stateFactory.getOrderStateByType(OrderStateFactory.Type.DELIVERED);
    }
}
