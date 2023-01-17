package org.example.patterns.proxy.dynamic;

import java.lang.reflect.Proxy;

public class MessageFactory {

    public static Message getMessage() {
        return (Message) Proxy.newProxyInstance(ProxyDemoApp.class.getClassLoader(),
                new Class[]{Message.class}, new MessageInvocationHandler());
    }

}
