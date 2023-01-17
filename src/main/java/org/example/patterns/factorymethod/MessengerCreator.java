package org.example.patterns.factorymethod;

public abstract class MessengerCreator {
    public Messenger createMessenger() {
        Messenger messenger = getMessengerInstance();
        messenger.sendInitialLetter();
        return messenger;
    }

    public abstract Messenger getMessengerInstance();
}
