package org.example.patterns.singleton;

public class InstanceHolderSingleton {

    private InstanceHolderSingleton() {
    }

    private static class Holder {
        private static final InstanceHolderSingleton INSTANCE  = new InstanceHolderSingleton();
    }

    public static InstanceHolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
