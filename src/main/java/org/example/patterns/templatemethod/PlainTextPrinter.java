package org.example.patterns.templatemethod;

import java.util.Map;

public class PlainTextPrinter extends OrderPrinter{
    @Override
    protected void start() {
        System.out.println("order info");
    }

    @Override
    protected String printHeader(Order order) {
        return "#" + order.getId() + ": " + order.getName();
    }

    @Override
    protected String printItemInfo(Order order) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Double> entry : order.getItems().entrySet()) {
            builder.append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append("\n");
        }
        return builder.toString();
    }

    @Override
    protected String printTotal(Order order) {
        return "total: " + order.getTotal();
    }

    @Override
    protected void end() {
        System.out.println();
    }
}
