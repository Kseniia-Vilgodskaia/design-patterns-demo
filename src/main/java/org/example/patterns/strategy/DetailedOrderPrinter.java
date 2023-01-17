package org.example.patterns.strategy;

public class DetailedOrderPrinter extends OrderPrinter{

    @Override
    public void print(Order order) {
        super.print(order);
        System.out.println("Items in order: " + order.getItemCount());
        System.out.println("Discount: " + order.getDiscount());
        System.out.println("Shipping cost: " + order.getShippingCost());
        System.out.println("Total items cost: " + order.getTotalPrice());
        System.out.println("***************Total for order:*****************");
        System.out.println(order.getTotal());
    }
}
