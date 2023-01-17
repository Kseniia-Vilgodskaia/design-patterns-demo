package org.example.patterns.observer;

public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double price = order.getTotalItemPrice();

        if (price >= 500) {
            order.setDiscount(30);
        } else if (price >= 200) {
            order.setDiscount(10);
        }
    }
}
