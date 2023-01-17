package org.example.patterns.decorator;

public class TextMessage implements Message{

    private String content;

    public TextMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(getContent());
    }
}
