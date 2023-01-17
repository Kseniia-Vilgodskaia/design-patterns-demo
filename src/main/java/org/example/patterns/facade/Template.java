package org.example.patterns.facade;

public class Template {

    private String content;

    public Template(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
