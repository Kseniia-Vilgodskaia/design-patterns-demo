package org.example.patterns.proxy.dynamic;

import org.example.patterns.proxy.dynamic.Message;

public class TelegramMessage implements Message {

    @Override
    public void create() {
        System.out.println("CREATING a new Telegram message...");
    }

    @Override
    public void send() {
        System.out.println("SENDING a new Telegram message...");
    }
}
