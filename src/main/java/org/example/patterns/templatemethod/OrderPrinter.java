package org.example.patterns.templatemethod;

public abstract class OrderPrinter {

    public void print(Order order) {
        start();
        System.out.println(printHeader(order));
        System.out.println(printItemInfo(order));
        System.out.println(printTotal(order));
        end();
    }

    protected abstract void start();
    protected abstract String printHeader(Order order);
    protected abstract String printItemInfo(Order order);
    protected abstract String printTotal(Order order);
    protected abstract void end();
}
