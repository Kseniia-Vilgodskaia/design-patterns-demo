package org.example.patterns.factorymethod;

public class TelegramCreator extends MessengerCreator{
    @Override
    public Messenger getMessengerInstance() {
        return new Telegram("Mega-crypt");
    }
}
