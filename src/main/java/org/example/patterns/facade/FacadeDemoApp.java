package org.example.patterns.facade;

public class FacadeDemoApp {
    public static void main(String[] args) {
        MessageFacade messageFacade = new MessageFacade();
        messageFacade.createAndSendMessage("Hello Frida!");
    }
}
