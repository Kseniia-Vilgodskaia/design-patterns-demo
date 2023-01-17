package org.example.patterns.decorator;

public class SuperMessageDecorator implements Message{
    private Message message;

    public SuperMessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println("just suuuuupper...");
        message.print();
    }
}
