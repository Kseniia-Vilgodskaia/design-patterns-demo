package org.example.patterns.observer;

import java.util.ArrayList;
import java.util.List;

//Observable
public class Order {
    private int id;

    private int itemCount;
    private double totalItemPrice;

    private double discount;

    private double shippingCost;

    //create a list of observers
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalItemPrice() {
        return totalItemPrice;
    }

    public double getTotalOrderPrice() {
        return totalItemPrice - discount + shippingCost;
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

    //method with notification for observers
    public void addItem(double itemPrice) {
        totalItemPrice += itemPrice;
        itemCount++;
        observers.forEach(observer -> observer.updated(this));
    }

    //create a method to attach observers
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    //create a method to detach observers
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", itemCount=" + itemCount +
                ", totalItemPrice=" + totalItemPrice +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
