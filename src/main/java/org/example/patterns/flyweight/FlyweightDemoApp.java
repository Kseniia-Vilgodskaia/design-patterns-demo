package org.example.patterns.flyweight;

public class FlyweightDemoApp {
    public static void main(String[] args) {
        EmailFactory emailFactory = EmailFactory.getInstance();

        Email systemEmail = emailFactory.getEmail(EmailFactory.EmailType.DRESS_CODE_VIOLATION);
        System.out.println(systemEmail.getText(503));

        Email positionOfferEmail = emailFactory.getPositionOfferEmail(new Template("Java Junior"), 2000);
        System.out.println(positionOfferEmail.getText(null));
    }
}
