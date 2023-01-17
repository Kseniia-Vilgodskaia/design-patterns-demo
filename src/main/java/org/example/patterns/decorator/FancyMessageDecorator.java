package org.example.patterns.decorator;

public class FancyMessageDecorator implements Message{
    Message message;

    public FancyMessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println("FANCY DECORATION FOR MESSAGE...");
        message.print();
    }
}
