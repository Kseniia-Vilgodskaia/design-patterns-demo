package org.example.patterns.flyweight;

//shared entity (flyweight)
public class SystemEmail implements Email{

    private String text;

    public SystemEmail(String text) {
        this.text = text;
    }

    @Override
    public String getText(Integer code) {
        return text + "The violation code is " + code;
    }
}
