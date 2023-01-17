package org.example.patterns.factorymethod;

public class WhatsappCreator extends MessengerCreator{
    @Override
    public Messenger getMessengerInstance() {
        return new Whatsapp("Bi-crypt");
    }
}
