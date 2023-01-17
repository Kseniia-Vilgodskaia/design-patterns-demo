package org.example.patterns.state.classrelease;

public class StateDemoApp {
    public static void main(String[] args) {
        Order order = new Order();

        order.processPayment();
        order.cancel();
    }
}
