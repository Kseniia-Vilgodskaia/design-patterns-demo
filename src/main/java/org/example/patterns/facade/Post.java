package org.example.patterns.facade;

public class Post {

    public Post() {
    }

    public void sendMessage(Message message) {
        System.out.println("Sending message of Type: " + message.getType() + "\nContent: " + message.getTemplate().getContent());
    }
}
