package org.example.patterns.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> supplier, int count) {
        this.availablePool = new LinkedBlockingQueue<>();
        for (int i=0; i < count; i++) {
            availablePool.offer(supplier.get());
        }
    }
    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            System.err.println("Pool is empty");
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.err.println("Cannot put the object into pool");
        }
    }
}
