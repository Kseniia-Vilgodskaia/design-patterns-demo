package org.example.patterns.objectpool;

public class ObjectPoolDemoApp {
    public static void main(String[] args) {
        ObjectPool<Message> messageObjectPool = new ObjectPool<>(Message::new, 3);

        Message message1 = messageObjectPool.get();
        message1.transform();

        Message message2 = messageObjectPool.get();
        message2.transform();

        Message message3 = messageObjectPool.get();
        message3.transform();

        messageObjectPool.release(message1);
        Message message4 = messageObjectPool.get();
        message4.transform();

//        messageObjectPool.release(message2);
    }
}
