package org.example.patterns.facade;

public class MessageFacade {

    public void createAndSendMessage(String content) {
        Template template = new Template(content);
        Message.Type type = getMessageType(content);

        Message message = new Message(template, type);
        Post post = new Post();
        post.sendMessage(message);
    }

    private Message.Type getMessageType(String content) {
        Message.Type type = null;
        if (content.startsWith("Dear")) {
            type = Message.Type.OFFICIAL;
        } else if (content.startsWith("Hello")) {
            type = Message.Type.CASUAL;
        } else if (content.startsWith("System")) {
            type = Message.Type.SYSTEM;
        }
        return type;
    }
}
