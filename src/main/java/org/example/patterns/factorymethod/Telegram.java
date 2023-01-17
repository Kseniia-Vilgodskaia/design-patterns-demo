package org.example.patterns.factorymethod;

public class Telegram extends Messenger{
    public Telegram(String encryptionSystem) {
        super(encryptionSystem);
    }

    @Override
    public void sendInitialLetter() {
        System.out.println("Hello World from TELEGRAM, I am secure B)");
        sayInfo();
    }
}
