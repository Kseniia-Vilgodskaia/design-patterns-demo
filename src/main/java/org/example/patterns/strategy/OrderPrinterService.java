package org.example.patterns.strategy;

public class OrderPrinterService {

    private OrderPrinter printer;

    public OrderPrinterService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void handlePrinting(Order order) {
        printer.print(order);
    }
}
