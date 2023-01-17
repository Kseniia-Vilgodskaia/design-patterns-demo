package org.example.patterns.memento;

public class Template {

    public enum Type {OFFICIAL, CASUAL, SYSTEM}

    private String content;
    private Type type;

    public Template(String content, Type type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Template{" +
                "content='" + content + '\'' +
                ", type=" + type +
                '}';
    }
}
