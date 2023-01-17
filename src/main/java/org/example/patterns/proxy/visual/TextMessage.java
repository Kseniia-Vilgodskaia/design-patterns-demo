package org.example.patterns.proxy.visual;

public class TextMessage implements Message {

    private String content;

    public TextMessage() {
    }

    public String getContent() {
        return content;
    }

    @Override
    public Message getMessage() {
        return null;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void send() {
        //doing a lot of work here...
    }
}
