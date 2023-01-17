package org.example.patterns.state.enumrelease;

public enum OrderState {

    NEW(() -> System.out.println("This is a new order, no charges")),
    PAID(() -> System.out.println("We'll contact you back once the order is cancelled.")),
    DISPATCHED(() -> System.out.println("You'll be able to cancel order once delivery is done.")),
    DELIVERED(() -> System.out.println("Please, return your order to the delivery guy.")),
    CANCELLED(() -> System.out.println("This order has already been cancelled"));

    private Runnable cancelRun;

    OrderState(Runnable cancelRun) {
        this.cancelRun = cancelRun;
    }

    public void cancel() {
        cancelRun.run();
    }
}
