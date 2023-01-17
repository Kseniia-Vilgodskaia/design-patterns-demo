package org.example.patterns.strategy;

public class Order {

    private int id;
    private String name;
    private int itemCount;
    private double totalPrice;
    private double discount;
    private double shippingCost;

    public Order(int id, String name, double discount, double shippingCost) {
        this.id = id;
        this.name = name;
        this.discount = discount;
        this.shippingCost = shippingCost;
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

    public int getItemCount() {
        return itemCount;
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotal() {
        return totalPrice - discount + shippingCost;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void addItem(double itemPrice) {
        totalPrice += itemPrice;
        itemCount++;
    }
}
