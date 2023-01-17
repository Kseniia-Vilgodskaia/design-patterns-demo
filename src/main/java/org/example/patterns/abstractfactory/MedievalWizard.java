package org.example.patterns.abstractfactory;

public class MedievalWizard extends Wizard{
    public MedievalWizard() {
        setMagicPower(90);
    }

    @Override
    public void castSpell() {
        System.out.println("I am casting a METAL spell");
    }
}
