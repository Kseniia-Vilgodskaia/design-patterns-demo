package org.example.patterns.facade;

public class Message {

    public enum Type {OFFICIAL, CASUAL, SYSTEM};

    private Template template;
    private Type type;

    public Message(Template template, Type type) {
        this.template = template;
        this.type = type;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
