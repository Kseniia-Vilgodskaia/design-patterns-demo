package org.example.patterns.observer;

public class ObserverDemoApp {
    public static void main(String[] args) {
        Order order = new Order(1);

        order.addObserver(new PriceObserver());
        order.addObserver(new QuantityObserver());

        order.addItem(45);
        order.addItem(50);
        order.addItem(145);
        order.addItem(230);
        order.addItem(4);
        System.out.println(order);
    }
}
