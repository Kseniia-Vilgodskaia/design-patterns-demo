package org.example.patterns.strategy;

public abstract class OrderPrinter {

    public void print(Order order) {
        System.out.println("*****Printing info about the order:**********");
        System.out.println(order.getId() + "\t\t\t\t\t" + order.getName());
    }
}
