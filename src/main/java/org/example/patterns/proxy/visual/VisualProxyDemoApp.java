package org.example.patterns.proxy.visual;

public class VisualProxyDemoApp {
    public static void main(String[] args) {
        Message message = new TextMessageProxy();
        message.setContent("Content for my message");

        //checking proxy message content
        System.out.println("Checking proxy message content");
        System.out.println(message.getContent());

        //test that text message object was not created
        System.out.println("Testing that text message object was not created");
        System.out.println(message.getMessage());

        message.send();
        //test that text message object was created
        System.out.println("Testing that text message object was created");
        System.out.println(message.getMessage());
        //checking real message content
        System.out.println("Checking real message content");
        message.getMessage().getContent();
    }
}
