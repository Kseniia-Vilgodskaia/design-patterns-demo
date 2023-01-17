package org.example.patterns.proxy.dynamic;

public class ProxyDemoApp {
    public static void main(String[] args) {

        Message messageWithoutProxy = new TelegramMessage();
        messageWithoutProxy.create();
        messageWithoutProxy.send();

        System.out.println("***********************");

        Message proxyMessage = MessageFactory.getMessage();
        proxyMessage.create();
        proxyMessage.send();
    }
}
