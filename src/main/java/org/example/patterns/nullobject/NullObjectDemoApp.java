package org.example.patterns.nullobject;

public class NullObjectDemoApp {
    public static void main(String[] args) {
        Order order = new Order(100, "My Super Order");

//        OrderPrinter printer = new PlainTextOrderPrinter();
        OrderPrinter printer = new NullOrderPrinter();
        printer.print(order);
    }
}
