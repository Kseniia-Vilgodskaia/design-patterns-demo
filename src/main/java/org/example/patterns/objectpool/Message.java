package org.example.patterns.objectpool;

public class Message implements Poolable{

    private String state = "new";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void transform() {
        setState("pending");
        System.out.println("State changed to pending");
        setState("sent");
        System.out.println("State changed to sent");
    }

    @Override
    public void reset() {
        setState("new");
    }
}
