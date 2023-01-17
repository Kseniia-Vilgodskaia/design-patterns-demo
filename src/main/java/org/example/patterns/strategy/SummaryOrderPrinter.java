package org.example.patterns.strategy;

public class SummaryOrderPrinter extends OrderPrinter{

    @Override
    public void print(Order order) {
        super.print(order);
        System.out.println("Total price: " + order.getTotal());
    }
}
