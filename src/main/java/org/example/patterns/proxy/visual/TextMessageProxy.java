package org.example.patterns.proxy.visual;

public class TextMessageProxy implements Message{

    private String content;

    private TextMessage message;

    public TextMessage getMessage() {
        return message;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void send() {
        if (message == null) {
            message = new TextMessage();
            if (content != null) {
                message.setContent(content);
            }
        }
        message.send();
    }
}
