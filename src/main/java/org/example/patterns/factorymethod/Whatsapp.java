package org.example.patterns.factorymethod;

public class Whatsapp extends Messenger{

    public Whatsapp(String encryptionSystem) {
        super(encryptionSystem);
    }

    @Override
    public void sendInitialLetter() {
        System.out.println("Hello World from WHATSAPP, I will let everyone know if you delete a message:)");
        sayInfo();
    }
}
