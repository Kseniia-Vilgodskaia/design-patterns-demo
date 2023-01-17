package org.example.patterns.observer;

public class QuantityObserver implements OrderObserver{
    @Override
    public void updated(Order order) {
        int itemCount = order.getItemCount();

        if (itemCount >= 5) {
            order.setShippingCost(10);
        } else {
            order.setShippingCost(60);
        }
    }
}
