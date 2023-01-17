package org.example.patterns.state.classrelease;

import java.util.HashMap;
import java.util.Map;

public class OrderStateFactory {

    public enum Type {NEW, PAID, DISPATCHED, DELIVERED, CANCELLED}

    private static final OrderStateFactory FACTORY = new OrderStateFactory();

    private final Map<Type, OrderState> states = new HashMap<>();

    private OrderStateFactory() {
        states.put(Type.NEW, new New());
        states.put(Type.PAID, new Paid());
        states.put(Type.DISPATCHED, new Dispatched());
        states.put(Type.DELIVERED, new Delivered());
        states.put(Type.CANCELLED, new Cancelled());
    }

    public static OrderStateFactory getFactory() {
        return FACTORY;
    }

    public OrderState getOrderStateByType(Type type) {
        return states.get(type);
    }

}
