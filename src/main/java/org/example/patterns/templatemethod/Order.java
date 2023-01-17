package org.example.patterns.templatemethod;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private int id;
    private String name;
    private Map<String, Double> items = new HashMap<>();
    private double total;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void setItems(Map<String, Double> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void addItem(String itemName, Double itemPrice) {
        items.put(itemName, itemPrice);
        total += itemPrice;
    }
}
