package org.example.patterns.factorymethod;

public abstract class Messenger {

    private String encryptionSystem;

    public Messenger(String encryptionSystem) {
        this.encryptionSystem = encryptionSystem;
    }

    public String getEncryptionSystem() {
        return encryptionSystem;
    }

    public abstract void sendInitialLetter();

    public void sayInfo() {
        System.out.println("My Encryption System is " + getEncryptionSystem());
    }
}
