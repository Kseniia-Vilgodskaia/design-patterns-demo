package org.example.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmailFactory {

    public enum EmailType {PASSWORD_EXPIRED, DRESS_CODE_VIOLATION, WARNING}

    private static final EmailFactory FACTORY = new EmailFactory();

    public static EmailFactory getInstance() {
        return FACTORY;
    }

    private Map<EmailType, SystemEmail> systemEmails = new HashMap<>();

    private EmailFactory() {
        systemEmails.put(EmailType.PASSWORD_EXPIRED, new SystemEmail("Your password is expired"));
        systemEmails.put(EmailType.DRESS_CODE_VIOLATION, new SystemEmail("Go home and change your outfit!"));
        systemEmails.put(EmailType.WARNING, new SystemEmail("It's a warning, start to worry"));
    }

    public SystemEmail getEmail(EmailType type) {
        return systemEmails.get(type);
    }

    public PositionOfferEmail getPositionOfferEmail(Template template, int salaryOfferAmount) {
        return new PositionOfferEmail(template, salaryOfferAmount);
    }
}
