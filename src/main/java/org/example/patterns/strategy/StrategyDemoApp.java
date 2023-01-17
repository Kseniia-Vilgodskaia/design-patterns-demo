package org.example.patterns.strategy;

public class StrategyDemoApp {
    public static void main(String[] args) {
        Order order = new Order(1, "My Christmas Order", 10, 20);

        OrderPrinterService printerService = new OrderPrinterService(new DetailedOrderPrinter());
        printerService.handlePrinting(order);
    }
}
