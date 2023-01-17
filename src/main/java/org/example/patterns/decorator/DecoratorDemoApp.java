package org.example.patterns.decorator;

public class DecoratorDemoApp {
    public static void main(String[] args) {
        //create a simple text message
        Message textMessage = new TextMessage("this is my message");
        textMessage.print();

        System.out.println("****************************************");

        //create a fancy decorator and pass the message
        Message fancyMessageDecorator = new FancyMessageDecorator(textMessage);
        fancyMessageDecorator.print();


        System.out.println("****************************************");

        //create a super decorator and pass the fancy decorator
        Message superMessageDecorator = new SuperMessageDecorator(fancyMessageDecorator);
        superMessageDecorator.print();
    }
}
