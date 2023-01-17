package org.example.patterns.memento;

public class MementoDemoApp {
    public static void main(String[] args) {
        //create message
        Message message = new Message("Urgent message", new Template("Donuts are here!!!", Template.Type.CASUAL));
//        Message message = new Message(null, null);

        //test message state
        System.out.println(message);

        //create memento
        Message.MessageMemento memento = message.getMemento();

        //change message state
        message.setTheme("No soup for you!");
        message.setTemplate(new Template("You lose...", Template.Type.OFFICIAL));
        //test changed message state
        System.out.println(message);

        //reset message
        message.reset(memento);

        //test reset message state
        System.out.println(message);
    }
}
