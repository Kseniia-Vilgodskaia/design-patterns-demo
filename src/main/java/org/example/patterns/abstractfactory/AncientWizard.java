package org.example.patterns.abstractfactory;

public class AncientWizard extends Wizard{
    public AncientWizard() {
        setMagicPower(35);
    }

    @Override
    public void castSpell() {
        System.out.println("I am casting a STONE spell");
    }
}
