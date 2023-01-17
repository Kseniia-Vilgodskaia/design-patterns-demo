package org.example.patterns.templatemethod;

public class TemplateMethodDemoApp {
    public static void main(String[] args) {
        Order order = new Order(1001, "My Super order");
        order.addItem("Teddy Bear", 50.0);
        order.addItem("Creepy Doll", 113.0);
        order.addItem("Adventure Book", 21.0);

//        OrderPrinter printer = new PlainTextPrinter();
        OrderPrinter printer = new FancyTextPrinter();
        printer.print(order);
    }
}
