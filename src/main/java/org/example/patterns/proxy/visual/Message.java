package org.example.patterns.proxy.visual;

public interface Message {

    //for testing
    Message getMessage();

    String getContent();
    void setContent(String content);

    void send();
}
