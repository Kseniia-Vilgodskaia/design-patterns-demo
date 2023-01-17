package org.example.patterns.templatemethod;

import java.util.Map;

public class FancyTextPrinter extends OrderPrinter {
    @Override
    protected void start() {
        System.out.println("****************Order Details For:****************");
    }

    @Override
    protected String printHeader(Order order) {
        return "ORDER № " + order.getId() + "\nORDER NAME: " + order.getName();
    }

    @Override
    protected String printItemInfo(Order order) {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (Map.Entry<String, Double> entry : order.getItems().entrySet()) {
            builder.append("Item #")
                    .append(i)
                    .append(entry.getKey())
                    .append(" ---price: $")
                    .append(entry.getValue())
                    .append("\n");

            i++;
        }
        return builder.toString();
    }

    @Override
    protected String printTotal(Order order) {
        return "----------------------\nOrder Total Price: " + order.getTotal();
    }

    @Override
    protected void end() {
        System.out.println("******************************");
    }
}
