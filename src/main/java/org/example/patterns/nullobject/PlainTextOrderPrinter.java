package org.example.patterns.nullobject;

public class PlainTextOrderPrinter extends OrderPrinter{
    @Override
    void print(Order order) {
        System.out.println("Order #" + order.getId());
        System.out.println("Name: " + order.getName());
    }
}
