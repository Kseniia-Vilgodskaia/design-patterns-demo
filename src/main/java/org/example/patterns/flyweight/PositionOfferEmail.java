package org.example.patterns.flyweight;

//unshared entity
public class PositionOfferEmail implements Email{
    private Template template;

    private int salaryOfferAmount;

    public PositionOfferEmail(Template template, int salaryOfferAmount) {
        this.template = template;
        this.salaryOfferAmount = salaryOfferAmount;
    }

    @Override
    public String getText(Integer code) {
        return "Your new position is: " + template.getContent() + "\nWith salary: " + salaryOfferAmount;
    }
}
