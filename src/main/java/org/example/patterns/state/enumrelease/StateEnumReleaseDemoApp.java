package org.example.patterns.state.enumrelease;

public class StateEnumReleaseDemoApp {
    public static void main(String[] args) {
        Order order = new Order();

        order.processPayment();
        order.cancel();
    }
}
