package org.example.patterns.factorymethod;

public class FactoryMethodDemoApp {
    public static void main(String[] args) {
        WhatsappCreator whatsappCreator = new WhatsappCreator();
        whatsappCreator.createMessenger();

        TelegramCreator telegramCreator = new TelegramCreator();
        telegramCreator.createMessenger();
    }
}
